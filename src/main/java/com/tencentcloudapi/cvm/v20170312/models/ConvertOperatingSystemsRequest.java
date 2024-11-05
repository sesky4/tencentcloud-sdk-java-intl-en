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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConvertOperatingSystemsRequest extends AbstractModel {

    /**
    * ID of an instance to execute operating system switching.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether it is a minimum scale switching.
    */
    @SerializedName("MinimalConversion")
    @Expose
    private Boolean MinimalConversion;

    /**
    * Whether it is pre-check only.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Target operating system type for switching. Only TencentOS is supported.
    */
    @SerializedName("TargetOSType")
    @Expose
    private String TargetOSType;

    /**
     * Get ID of an instance to execute operating system switching. 
     * @return InstanceIds ID of an instance to execute operating system switching.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID of an instance to execute operating system switching.
     * @param InstanceIds ID of an instance to execute operating system switching.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether it is a minimum scale switching. 
     * @return MinimalConversion Whether it is a minimum scale switching.
     */
    public Boolean getMinimalConversion() {
        return this.MinimalConversion;
    }

    /**
     * Set Whether it is a minimum scale switching.
     * @param MinimalConversion Whether it is a minimum scale switching.
     */
    public void setMinimalConversion(Boolean MinimalConversion) {
        this.MinimalConversion = MinimalConversion;
    }

    /**
     * Get Whether it is pre-check only. 
     * @return DryRun Whether it is pre-check only.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether it is pre-check only.
     * @param DryRun Whether it is pre-check only.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Target operating system type for switching. Only TencentOS is supported. 
     * @return TargetOSType Target operating system type for switching. Only TencentOS is supported.
     */
    public String getTargetOSType() {
        return this.TargetOSType;
    }

    /**
     * Set Target operating system type for switching. Only TencentOS is supported.
     * @param TargetOSType Target operating system type for switching. Only TencentOS is supported.
     */
    public void setTargetOSType(String TargetOSType) {
        this.TargetOSType = TargetOSType;
    }

    public ConvertOperatingSystemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConvertOperatingSystemsRequest(ConvertOperatingSystemsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.MinimalConversion != null) {
            this.MinimalConversion = new Boolean(source.MinimalConversion);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.TargetOSType != null) {
            this.TargetOSType = new String(source.TargetOSType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "MinimalConversion", this.MinimalConversion);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "TargetOSType", this.TargetOSType);

    }
}
