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

public class ModifyMaliciousRequestWhiteListRequest extends AbstractModel {

    /**
    * Allowlist ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Allowlisted domain names
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Remarks
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
     * Get Allowlist ID 
     * @return Id Allowlist ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Allowlist ID
     * @param Id Allowlist ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Allowlisted domain names 
     * @return Domain Allowlisted domain names
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Allowlisted domain names
     * @param Domain Allowlisted domain names
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Remarks 
     * @return Mark Remarks
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks
     * @param Mark Remarks
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    public ModifyMaliciousRequestWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMaliciousRequestWhiteListRequest(ModifyMaliciousRequestWhiteListRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Mark", this.Mark);

    }
}

