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

public class DescribeCustomerUinResponse extends AbstractModel{

    /**
    * List of customer UINs Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DescribeCustomerUinData [] Data;

    /**
    * The number of customers
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of customer UINs Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data List of customer UINs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeCustomerUinData [] getData() {
        return this.Data;
    }

    /**
     * Set List of customer UINs Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data List of customer UINs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(DescribeCustomerUinData [] Data) {
        this.Data = Data;
    }

    /**
     * Get The number of customers 
     * @return Total The number of customers
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set The number of customers
     * @param Total The number of customers
     */
    public void setTotal(String Total) {
        this.Total = Total;
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

    public DescribeCustomerUinResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerUinResponse(DescribeCustomerUinResponse source) {
        if (source.Data != null) {
            this.Data = new DescribeCustomerUinData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DescribeCustomerUinData(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

