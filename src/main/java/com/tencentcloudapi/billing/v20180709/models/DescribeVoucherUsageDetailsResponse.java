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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherUsageDetailsResponse extends AbstractModel {

    /**
    * The total number of vouchers.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The total amount used. The value of this parameter is the total amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
    */
    @SerializedName("TotalUsedAmount")
    @Expose
    private Long TotalUsedAmount;

    /**
    * The usage details.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UsageRecords")
    @Expose
    private UsageRecords [] UsageRecords;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of vouchers. 
     * @return TotalCount The total number of vouchers.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of vouchers.
     * @param TotalCount The total number of vouchers.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The total amount used. The value of this parameter is the total amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000. 
     * @return TotalUsedAmount The total amount used. The value of this parameter is the total amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public Long getTotalUsedAmount() {
        return this.TotalUsedAmount;
    }

    /**
     * Set The total amount used. The value of this parameter is the total amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     * @param TotalUsedAmount The total amount used. The value of this parameter is the total amount used (USD, rounded to 8 decimal places) multiplied by 100,000,000.
     */
    public void setTotalUsedAmount(Long TotalUsedAmount) {
        this.TotalUsedAmount = TotalUsedAmount;
    }

    /**
     * Get The usage details.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UsageRecords The usage details.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public UsageRecords [] getUsageRecords() {
        return this.UsageRecords;
    }

    /**
     * Set The usage details.
Note: This field may return `null`, indicating that no valid value was found.
     * @param UsageRecords The usage details.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUsageRecords(UsageRecords [] UsageRecords) {
        this.UsageRecords = UsageRecords;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVoucherUsageDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherUsageDetailsResponse(DescribeVoucherUsageDetailsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalUsedAmount != null) {
            this.TotalUsedAmount = new Long(source.TotalUsedAmount);
        }
        if (source.UsageRecords != null) {
            this.UsageRecords = new UsageRecords[source.UsageRecords.length];
            for (int i = 0; i < source.UsageRecords.length; i++) {
                this.UsageRecords[i] = new UsageRecords(source.UsageRecords[i]);
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
        this.setParamSimple(map, prefix + "TotalUsedAmount", this.TotalUsedAmount);
        this.setParamArrayObj(map, prefix + "UsageRecords.", this.UsageRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

