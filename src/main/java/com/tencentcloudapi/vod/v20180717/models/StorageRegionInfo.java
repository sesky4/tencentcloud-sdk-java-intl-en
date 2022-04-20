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

public class StorageRegionInfo extends AbstractModel{

    /**
    * Storage region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Description of the storage region.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether storage is enabled in the region. Valid values:
<li>opened: Enabled</li>
<li>unopened: Not enabled</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether the region is the default storage region. Valid values: true, false.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get Storage region. 
     * @return Region Storage region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Storage region.
     * @param Region Storage region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Description of the storage region. 
     * @return Description Description of the storage region.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the storage region.
     * @param Description Description of the storage region.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether storage is enabled in the region. Valid values:
<li>opened: Enabled</li>
<li>unopened: Not enabled</li> 
     * @return Status Whether storage is enabled in the region. Valid values:
<li>opened: Enabled</li>
<li>unopened: Not enabled</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether storage is enabled in the region. Valid values:
<li>opened: Enabled</li>
<li>unopened: Not enabled</li>
     * @param Status Whether storage is enabled in the region. Valid values:
<li>opened: Enabled</li>
<li>unopened: Not enabled</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether the region is the default storage region. Valid values: true, false. 
     * @return IsDefault Whether the region is the default storage region. Valid values: true, false.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether the region is the default storage region. Valid values: true, false.
     * @param IsDefault Whether the region is the default storage region. Valid values: true, false.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public StorageRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageRegionInfo(StorageRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

