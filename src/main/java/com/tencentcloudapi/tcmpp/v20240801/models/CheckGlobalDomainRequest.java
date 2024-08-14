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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckGlobalDomainRequest extends AbstractModel {

    /**
    * Domain name list
    */
    @SerializedName("DomainUrlList")
    @Expose
    private String [] DomainUrlList;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get Domain name list 
     * @return DomainUrlList Domain name list
     */
    public String [] getDomainUrlList() {
        return this.DomainUrlList;
    }

    /**
     * Set Domain name list
     * @param DomainUrlList Domain name list
     */
    public void setDomainUrlList(String [] DomainUrlList) {
        this.DomainUrlList = DomainUrlList;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public CheckGlobalDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckGlobalDomainRequest(CheckGlobalDomainRequest source) {
        if (source.DomainUrlList != null) {
            this.DomainUrlList = new String[source.DomainUrlList.length];
            for (int i = 0; i < source.DomainUrlList.length; i++) {
                this.DomainUrlList[i] = new String(source.DomainUrlList[i]);
            }
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainUrlList.", this.DomainUrlList);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}
