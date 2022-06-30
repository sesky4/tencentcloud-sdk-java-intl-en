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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewaySourceIpTranslationNatRulesResponse extends AbstractModel{

    /**
    * Array of objects of a NAT gateway's SNAT rules.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceIpTranslationNatRuleSet")
    @Expose
    private SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet;

    /**
    * The number of eligible object arrays of a NAT gateway's forwarding rules.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of objects of a NAT gateway's SNAT rules.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SourceIpTranslationNatRuleSet Array of objects of a NAT gateway's SNAT rules.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public SourceIpTranslationNatRule [] getSourceIpTranslationNatRuleSet() {
        return this.SourceIpTranslationNatRuleSet;
    }

    /**
     * Set Array of objects of a NAT gateway's SNAT rules.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SourceIpTranslationNatRuleSet Array of objects of a NAT gateway's SNAT rules.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSourceIpTranslationNatRuleSet(SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet) {
        this.SourceIpTranslationNatRuleSet = SourceIpTranslationNatRuleSet;
    }

    /**
     * Get The number of eligible object arrays of a NAT gateway's forwarding rules. 
     * @return TotalCount The number of eligible object arrays of a NAT gateway's forwarding rules.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of eligible object arrays of a NAT gateway's forwarding rules.
     * @param TotalCount The number of eligible object arrays of a NAT gateway's forwarding rules.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeNatGatewaySourceIpTranslationNatRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewaySourceIpTranslationNatRulesResponse(DescribeNatGatewaySourceIpTranslationNatRulesResponse source) {
        if (source.SourceIpTranslationNatRuleSet != null) {
            this.SourceIpTranslationNatRuleSet = new SourceIpTranslationNatRule[source.SourceIpTranslationNatRuleSet.length];
            for (int i = 0; i < source.SourceIpTranslationNatRuleSet.length; i++) {
                this.SourceIpTranslationNatRuleSet[i] = new SourceIpTranslationNatRule(source.SourceIpTranslationNatRuleSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SourceIpTranslationNatRuleSet.", this.SourceIpTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

