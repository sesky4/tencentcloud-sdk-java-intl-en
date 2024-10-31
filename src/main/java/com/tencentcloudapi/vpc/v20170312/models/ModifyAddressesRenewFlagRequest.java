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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressesRenewFlagRequest extends AbstractModel {

    /**
    * List of unique EIP IDs, for example, eip-xxxx.
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * Auto-renewal flag.
<ul style="margin:0">
<li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li>
<li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not automatically renew.</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify upon expiration and do not automatically renew.</li>
</ul>
If this parameter is set to NOTIFY_AND_AUTO_RENEW and the account balance is sufficient, the instance will be automatically renewed on a monthly basis after expiration.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get List of unique EIP IDs, for example, eip-xxxx. 
     * @return AddressIds List of unique EIP IDs, for example, eip-xxxx.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set List of unique EIP IDs, for example, eip-xxxx.
     * @param AddressIds List of unique EIP IDs, for example, eip-xxxx.
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get Auto-renewal flag.
<ul style="margin:0">
<li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li>
<li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not automatically renew.</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify upon expiration and do not automatically renew.</li>
</ul>
If this parameter is set to NOTIFY_AND_AUTO_RENEW and the account balance is sufficient, the instance will be automatically renewed on a monthly basis after expiration. 
     * @return RenewFlag Auto-renewal flag.
<ul style="margin:0">
<li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li>
<li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not automatically renew.</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify upon expiration and do not automatically renew.</li>
</ul>
If this parameter is set to NOTIFY_AND_AUTO_RENEW and the account balance is sufficient, the instance will be automatically renewed on a monthly basis after expiration.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag.
<ul style="margin:0">
<li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li>
<li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not automatically renew.</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify upon expiration and do not automatically renew.</li>
</ul>
If this parameter is set to NOTIFY_AND_AUTO_RENEW and the account balance is sufficient, the instance will be automatically renewed on a monthly basis after expiration.
     * @param RenewFlag Auto-renewal flag.
<ul style="margin:0">
<li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li>
<li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not automatically renew.</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify upon expiration and do not automatically renew.</li>
</ul>
If this parameter is set to NOTIFY_AND_AUTO_RENEW and the account balance is sufficient, the instance will be automatically renewed on a monthly basis after expiration.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ModifyAddressesRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressesRenewFlagRequest(ModifyAddressesRenewFlagRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

