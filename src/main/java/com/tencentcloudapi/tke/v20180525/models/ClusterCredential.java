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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCredential extends AbstractModel{

    /**
    * CA root certificate
    */
    @SerializedName("CACert")
    @Expose
    private String CACert;

    /**
    * Token for authentication
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get CA root certificate 
     * @return CACert CA root certificate
     */
    public String getCACert() {
        return this.CACert;
    }

    /**
     * Set CA root certificate
     * @param CACert CA root certificate
     */
    public void setCACert(String CACert) {
        this.CACert = CACert;
    }

    /**
     * Get Token for authentication 
     * @return Token Token for authentication
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token for authentication
     * @param Token Token for authentication
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    public ClusterCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCredential(ClusterCredential source) {
        if (source.CACert != null) {
            this.CACert = new String(source.CACert);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CACert", this.CACert);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

