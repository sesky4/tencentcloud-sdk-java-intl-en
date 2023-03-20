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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RootCertificates extends AbstractModel{

    /**
    * Chinese SM signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * Standard certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
     * Get Chinese SM signature certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sign Chinese SM signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set Chinese SM signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sign Chinese SM signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Encrypt Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Encrypt Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Standard certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Standard Standard certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set Standard certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Standard Standard certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    public RootCertificates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RootCertificates(RootCertificates source) {
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new String(source.Encrypt);
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "Standard", this.Standard);

    }
}
