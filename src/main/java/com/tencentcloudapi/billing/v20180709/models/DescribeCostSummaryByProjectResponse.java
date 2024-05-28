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

public class DescribeCostSummaryByProjectResponse extends AbstractModel {

    /**
    * Data readiness, 0 for not ready, 1 for ready
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * Consumption details
    */
    @SerializedName("Total")
    @Expose
    private ConsumptionSummaryTotal Total;

    /**
    * Consumption details summarized by business
    */
    @SerializedName("Data")
    @Expose
    private ConsumptionProjectSummaryDataItem [] Data;

    /**
    * Record count. The system returns null when NeedRecordNum is 0.
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data readiness, 0 for not ready, 1 for ready 
     * @return Ready Data readiness, 0 for not ready, 1 for ready
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set Data readiness, 0 for not ready, 1 for ready
     * @param Ready Data readiness, 0 for not ready, 1 for ready
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get Consumption details 
     * @return Total Consumption details
     */
    public ConsumptionSummaryTotal getTotal() {
        return this.Total;
    }

    /**
     * Set Consumption details
     * @param Total Consumption details
     */
    public void setTotal(ConsumptionSummaryTotal Total) {
        this.Total = Total;
    }

    /**
     * Get Consumption details summarized by business 
     * @return Data Consumption details summarized by business
     */
    public ConsumptionProjectSummaryDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set Consumption details summarized by business
     * @param Data Consumption details summarized by business
     */
    public void setData(ConsumptionProjectSummaryDataItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get Record count. The system returns null when NeedRecordNum is 0. 
     * @return RecordNum Record count. The system returns null when NeedRecordNum is 0.
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set Record count. The system returns null when NeedRecordNum is 0.
     * @param RecordNum Record count. The system returns null when NeedRecordNum is 0.
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
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

    public DescribeCostSummaryByProjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostSummaryByProjectResponse(DescribeCostSummaryByProjectResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.Total != null) {
            this.Total = new ConsumptionSummaryTotal(source.Total);
        }
        if (source.Data != null) {
            this.Data = new ConsumptionProjectSummaryDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ConsumptionProjectSummaryDataItem(source.Data[i]);
            }
        }
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamObj(map, prefix + "Total.", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RecordNum", this.RecordNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

