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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsagePlanSecretIdsRequest extends AbstractModel{

    /**
    * Unique ID of bound usage plan.
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Unique ID of bound usage plan. 
     * @return UsagePlanId Unique ID of bound usage plan.
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set Unique ID of bound usage plan.
     * @param UsagePlanId Unique ID of bound usage plan.
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

