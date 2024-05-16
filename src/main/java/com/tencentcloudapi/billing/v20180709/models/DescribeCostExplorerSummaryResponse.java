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

public class DescribeCostExplorerSummaryResponse extends AbstractModel {

    /**
    * Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Header informationNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Header")
    @Expose
    private AnalyseHeaderDetail Header;

    /**
    * Data detailsNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private AnalyseDetail [] Detail;

    /**
    * Data amountNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalDetail")
    @Expose
    private AnalyseDetail TotalDetail;

    /**
    * Filter boxNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionValue")
    @Expose
    private AnalyseConditionDetail ConditionValue;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of data entries
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Number of data entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Header informationNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Header Header informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseHeaderDetail getHeader() {
        return this.Header;
    }

    /**
     * Set Header informationNote: This field may return null, indicating that no valid values can be obtained.
     * @param Header Header informationNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeader(AnalyseHeaderDetail Header) {
        this.Header = Header;
    }

    /**
     * Get Data detailsNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Data detailsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseDetail [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Data detailsNote: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Data detailsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(AnalyseDetail [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Data amountNote: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalDetail Data amountNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseDetail getTotalDetail() {
        return this.TotalDetail;
    }

    /**
     * Set Data amountNote: This field may return null, indicating that no valid values can be obtained.
     * @param TotalDetail Data amountNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalDetail(AnalyseDetail TotalDetail) {
        this.TotalDetail = TotalDetail;
    }

    /**
     * Get Filter boxNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ConditionValue Filter boxNote: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalyseConditionDetail getConditionValue() {
        return this.ConditionValue;
    }

    /**
     * Set Filter boxNote: This field may return null, indicating that no valid values can be obtained.
     * @param ConditionValue Filter boxNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionValue(AnalyseConditionDetail ConditionValue) {
        this.ConditionValue = ConditionValue;
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

    public DescribeCostExplorerSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostExplorerSummaryResponse(DescribeCostExplorerSummaryResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Header != null) {
            this.Header = new AnalyseHeaderDetail(source.Header);
        }
        if (source.Detail != null) {
            this.Detail = new AnalyseDetail[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new AnalyseDetail(source.Detail[i]);
            }
        }
        if (source.TotalDetail != null) {
            this.TotalDetail = new AnalyseDetail(source.TotalDetail);
        }
        if (source.ConditionValue != null) {
            this.ConditionValue = new AnalyseConditionDetail(source.ConditionValue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamObj(map, prefix + "TotalDetail.", this.TotalDetail);
        this.setParamObj(map, prefix + "ConditionValue.", this.ConditionValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

