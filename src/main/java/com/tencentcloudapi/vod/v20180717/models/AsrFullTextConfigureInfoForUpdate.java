/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrFullTextConfigureInfoForUpdate extends AbstractModel{

    /**
    * Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The modification information of the subtitle format list.
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * The format of the subtitle file generated. <font color='red'>If you pass in an empty string</font>, no subtitle files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormatsOperation` instead.</font>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
     * Get Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li> 
     * @return Switch Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
     * @param Switch Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The modification information of the subtitle format list. 
     * @return SubtitleFormatsOperation The modification information of the subtitle format list.
     */
    public SubtitleFormatsOperation getSubtitleFormatsOperation() {
        return this.SubtitleFormatsOperation;
    }

    /**
     * Set The modification information of the subtitle format list.
     * @param SubtitleFormatsOperation The modification information of the subtitle format list.
     */
    public void setSubtitleFormatsOperation(SubtitleFormatsOperation SubtitleFormatsOperation) {
        this.SubtitleFormatsOperation = SubtitleFormatsOperation;
    }

    /**
     * Get The format of the subtitle file generated. <font color='red'>If you pass in an empty string</font>, no subtitle files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormatsOperation` instead.</font> 
     * @return SubtitleFormat The format of the subtitle file generated. <font color='red'>If you pass in an empty string</font>, no subtitle files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormatsOperation` instead.</font>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set The format of the subtitle file generated. <font color='red'>If you pass in an empty string</font>, no subtitle files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormatsOperation` instead.</font>
     * @param SubtitleFormat The format of the subtitle file generated. <font color='red'>If you pass in an empty string</font>, no subtitle files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormatsOperation` instead.</font>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    public AsrFullTextConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrFullTextConfigureInfoForUpdate(AsrFullTextConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubtitleFormatsOperation != null) {
            this.SubtitleFormatsOperation = new SubtitleFormatsOperation(source.SubtitleFormatsOperation);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "SubtitleFormatsOperation.", this.SubtitleFormatsOperation);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);

    }
}

