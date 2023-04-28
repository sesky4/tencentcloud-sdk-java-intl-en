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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisDimensional extends AbstractModel{

    /**
    * Analysis name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of data being analyzed. Valid values: `query`, `field`, `original`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Analysis content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigInfo")
    @Expose
    private AlarmAnalysisConfig [] ConfigInfo;

    /**
     * Get Analysis name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Analysis name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Analysis name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Analysis name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type of data being analyzed. Valid values: `query`, `field`, `original`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type of data being analyzed. Valid values: `query`, `field`, `original`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of data being analyzed. Valid values: `query`, `field`, `original`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type of data being analyzed. Valid values: `query`, `field`, `original`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Analysis content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content Analysis content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Analysis content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content Analysis content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigInfo Configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AlarmAnalysisConfig [] getConfigInfo() {
        return this.ConfigInfo;
    }

    /**
     * Set Configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigInfo Configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigInfo(AlarmAnalysisConfig [] ConfigInfo) {
        this.ConfigInfo = ConfigInfo;
    }

    public AnalysisDimensional() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisDimensional(AnalysisDimensional source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ConfigInfo != null) {
            this.ConfigInfo = new AlarmAnalysisConfig[source.ConfigInfo.length];
            for (int i = 0; i < source.ConfigInfo.length; i++) {
                this.ConfigInfo[i] = new AlarmAnalysisConfig(source.ConfigInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "ConfigInfo.", this.ConfigInfo);

    }
}

