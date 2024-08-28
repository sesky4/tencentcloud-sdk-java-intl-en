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

public class UsualPlace extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWPP client UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Country ID
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
    * Province ID
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * City ID
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWPP client UUID 
     * @return Uuid CWPP client UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP client UUID
     * @param Uuid CWPP client UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Country ID 
     * @return CountryId Country ID
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set Country ID
     * @param CountryId Country ID
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get Province ID 
     * @return ProvinceId Province ID
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set Province ID
     * @param ProvinceId Province ID
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get City ID 
     * @return CityId City ID
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set City ID
     * @param CityId City ID
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    public UsualPlace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsualPlace(UsualPlace source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.CountryId != null) {
            this.CountryId = new Long(source.CountryId);
        }
        if (source.ProvinceId != null) {
            this.ProvinceId = new Long(source.ProvinceId);
        }
        if (source.CityId != null) {
            this.CityId = new Long(source.CityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CityId", this.CityId);

    }
}

