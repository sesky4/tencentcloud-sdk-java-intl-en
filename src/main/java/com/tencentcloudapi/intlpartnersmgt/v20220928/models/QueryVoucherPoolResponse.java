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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherPoolResponse extends AbstractModel{

    /**
    * Reseller name
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Reseller role type (1: Reseller; 2: Distributor; 3: Second-level reseller)
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * Total quota
    */
    @SerializedName("TotalQuota")
    @Expose
    private Float TotalQuota;

    /**
    * Remaining quota
    */
    @SerializedName("RemainingQuota")
    @Expose
    private Float RemainingQuota;

    /**
    * The number of issued vouchers
    */
    @SerializedName("IssuedNum")
    @Expose
    private Long IssuedNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Reseller name 
     * @return AgentName Reseller name
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Reseller name
     * @param AgentName Reseller name
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Reseller role type (1: Reseller; 2: Distributor; 3: Second-level reseller) 
     * @return AccountType Reseller role type (1: Reseller; 2: Distributor; 3: Second-level reseller)
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Reseller role type (1: Reseller; 2: Distributor; 3: Second-level reseller)
     * @param AccountType Reseller role type (1: Reseller; 2: Distributor; 3: Second-level reseller)
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Total quota 
     * @return TotalQuota Total quota
     */
    public Float getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set Total quota
     * @param TotalQuota Total quota
     */
    public void setTotalQuota(Float TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get Remaining quota 
     * @return RemainingQuota Remaining quota
     */
    public Float getRemainingQuota() {
        return this.RemainingQuota;
    }

    /**
     * Set Remaining quota
     * @param RemainingQuota Remaining quota
     */
    public void setRemainingQuota(Float RemainingQuota) {
        this.RemainingQuota = RemainingQuota;
    }

    /**
     * Get The number of issued vouchers 
     * @return IssuedNum The number of issued vouchers
     */
    public Long getIssuedNum() {
        return this.IssuedNum;
    }

    /**
     * Set The number of issued vouchers
     * @param IssuedNum The number of issued vouchers
     */
    public void setIssuedNum(Long IssuedNum) {
        this.IssuedNum = IssuedNum;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryVoucherPoolResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherPoolResponse(QueryVoucherPoolResponse source) {
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Float(source.TotalQuota);
        }
        if (source.RemainingQuota != null) {
            this.RemainingQuota = new Float(source.RemainingQuota);
        }
        if (source.IssuedNum != null) {
            this.IssuedNum = new Long(source.IssuedNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "RemainingQuota", this.RemainingQuota);
        this.setParamSimple(map, prefix + "IssuedNum", this.IssuedNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

