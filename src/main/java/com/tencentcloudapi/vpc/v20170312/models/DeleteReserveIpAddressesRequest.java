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

public class DeleteReserveIpAddressesRequest extends AbstractModel {

    /**
    * Unique ID of the VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * List of reserved private IP addresses.
    */
    @SerializedName("ReserveIpIds")
    @Expose
    private String [] ReserveIpIds;

    /**
     * Get Unique ID of the VPC. 
     * @return VpcId Unique ID of the VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of the VPC.
     * @param VpcId Unique ID of the VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get List of reserved private IP addresses. 
     * @return ReserveIpIds List of reserved private IP addresses.
     */
    public String [] getReserveIpIds() {
        return this.ReserveIpIds;
    }

    /**
     * Set List of reserved private IP addresses.
     * @param ReserveIpIds List of reserved private IP addresses.
     */
    public void setReserveIpIds(String [] ReserveIpIds) {
        this.ReserveIpIds = ReserveIpIds;
    }

    public DeleteReserveIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReserveIpAddressesRequest(DeleteReserveIpAddressesRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ReserveIpIds != null) {
            this.ReserveIpIds = new String[source.ReserveIpIds.length];
            for (int i = 0; i < source.ReserveIpIds.length; i++) {
                this.ReserveIpIds[i] = new String(source.ReserveIpIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "ReserveIpIds.", this.ReserveIpIds);

    }
}
