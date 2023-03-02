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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordBatchResponse extends AbstractModel{

    /**
    * Information of the bulk added domains
    */
    @SerializedName("DetailList")
    @Expose
    private CreateRecordBatchDetail [] DetailList;

    /**
    * Bulk task ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of the bulk added domains 
     * @return DetailList Information of the bulk added domains
     */
    public CreateRecordBatchDetail [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set Information of the bulk added domains
     * @param DetailList Information of the bulk added domains
     */
    public void setDetailList(CreateRecordBatchDetail [] DetailList) {
        this.DetailList = DetailList;
    }

    /**
     * Get Bulk task ID 
     * @return JobId Bulk task ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set Bulk task ID
     * @param JobId Bulk task ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
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

    public CreateRecordBatchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordBatchResponse(CreateRecordBatchResponse source) {
        if (source.DetailList != null) {
            this.DetailList = new CreateRecordBatchDetail[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new CreateRecordBatchDetail(source.DetailList[i]);
            }
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

