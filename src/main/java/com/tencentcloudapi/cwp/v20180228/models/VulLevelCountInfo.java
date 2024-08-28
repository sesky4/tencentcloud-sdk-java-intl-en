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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulLevelCountInfo extends AbstractModel {

    /**
    * Vulnerability level
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
     * Get Vulnerability level 
     * @return VulLevel Vulnerability level
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Vulnerability level
     * @param VulLevel Vulnerability level
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VulCount Number of vulnerabilities
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set Number of vulnerabilities
     * @param VulCount Number of vulnerabilities
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    public VulLevelCountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulLevelCountInfo(VulLevelCountInfo source) {
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);

    }
}

