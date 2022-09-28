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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDefaultCertificateRequest extends AbstractModel{

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * ID of the certificate.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Status of the certificate. Values:
<li>`deployed`: The certificate is deployed;</li>
<li>`disabled`: The certificate is disabled.</li>When a deployment fails, you can try again.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ID of the certificate. 
     * @return CertId ID of the certificate.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ID of the certificate.
     * @param CertId ID of the certificate.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Status of the certificate. Values:
<li>`deployed`: The certificate is deployed;</li>
<li>`disabled`: The certificate is disabled.</li>When a deployment fails, you can try again. 
     * @return Status Status of the certificate. Values:
<li>`deployed`: The certificate is deployed;</li>
<li>`disabled`: The certificate is disabled.</li>When a deployment fails, you can try again.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the certificate. Values:
<li>`deployed`: The certificate is deployed;</li>
<li>`disabled`: The certificate is disabled.</li>When a deployment fails, you can try again.
     * @param Status Status of the certificate. Values:
<li>`deployed`: The certificate is deployed;</li>
<li>`disabled`: The certificate is disabled.</li>When a deployment fails, you can try again.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyDefaultCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDefaultCertificateRequest(ModifyDefaultCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}
