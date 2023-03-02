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

public class RoundPlayListItemInfo extends AbstractModel{

    /**
    * The file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The type of the media played. Valid values:
<li>`Transcode`: A transcoding output. Because a file may be bound to multiple transcoding templates, you need to specify `Definition` if the type is `Transcode`.</li>
<li>`Original`: The original file.</li>
The file must be in HLS format.
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * The transcoding template used to generate the transcoding output played. This parameter is required if `AudioVideoType` is `Transcode`.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get The file ID. 
     * @return FileId The file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The file ID.
     * @param FileId The file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The type of the media played. Valid values:
<li>`Transcode`: A transcoding output. Because a file may be bound to multiple transcoding templates, you need to specify `Definition` if the type is `Transcode`.</li>
<li>`Original`: The original file.</li>
The file must be in HLS format. 
     * @return AudioVideoType The type of the media played. Valid values:
<li>`Transcode`: A transcoding output. Because a file may be bound to multiple transcoding templates, you need to specify `Definition` if the type is `Transcode`.</li>
<li>`Original`: The original file.</li>
The file must be in HLS format.
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set The type of the media played. Valid values:
<li>`Transcode`: A transcoding output. Because a file may be bound to multiple transcoding templates, you need to specify `Definition` if the type is `Transcode`.</li>
<li>`Original`: The original file.</li>
The file must be in HLS format.
     * @param AudioVideoType The type of the media played. Valid values:
<li>`Transcode`: A transcoding output. Because a file may be bound to multiple transcoding templates, you need to specify `Definition` if the type is `Transcode`.</li>
<li>`Original`: The original file.</li>
The file must be in HLS format.
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get The transcoding template used to generate the transcoding output played. This parameter is required if `AudioVideoType` is `Transcode`. 
     * @return Definition The transcoding template used to generate the transcoding output played. This parameter is required if `AudioVideoType` is `Transcode`.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The transcoding template used to generate the transcoding output played. This parameter is required if `AudioVideoType` is `Transcode`.
     * @param Definition The transcoding template used to generate the transcoding output played. This parameter is required if `AudioVideoType` is `Transcode`.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public RoundPlayListItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayListItemInfo(RoundPlayListItemInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

