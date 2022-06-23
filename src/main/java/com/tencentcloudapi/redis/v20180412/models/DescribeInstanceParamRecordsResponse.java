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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamRecordsResponse extends AbstractModel{

    /**
    * Total number of modifications.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of modifications.
    */
    @SerializedName("InstanceParamHistory")
    @Expose
    private InstanceParamHistory [] InstanceParamHistory;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of modifications. 
     * @return TotalCount Total number of modifications.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of modifications.
     * @param TotalCount Total number of modifications.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of modifications. 
     * @return InstanceParamHistory Information of modifications.
     */
    public InstanceParamHistory [] getInstanceParamHistory() {
        return this.InstanceParamHistory;
    }

    /**
     * Set Information of modifications.
     * @param InstanceParamHistory Information of modifications.
     */
    public void setInstanceParamHistory(InstanceParamHistory [] InstanceParamHistory) {
        this.InstanceParamHistory = InstanceParamHistory;
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

    public DescribeInstanceParamRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceParamRecordsResponse(DescribeInstanceParamRecordsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceParamHistory != null) {
            this.InstanceParamHistory = new InstanceParamHistory[source.InstanceParamHistory.length];
            for (int i = 0; i < source.InstanceParamHistory.length; i++) {
                this.InstanceParamHistory[i] = new InstanceParamHistory(source.InstanceParamHistory[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceParamHistory.", this.InstanceParamHistory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

