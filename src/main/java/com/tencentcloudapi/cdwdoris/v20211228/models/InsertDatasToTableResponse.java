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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsertDatasToTableResponse extends AbstractModel {

    /**
    * Whether the insertion operation is successful
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * Message description of the operation result
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Number of inserted data rows
    */
    @SerializedName("InsertCount")
    @Expose
    private Long InsertCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the insertion operation is successful 
     * @return Success Whether the insertion operation is successful
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set Whether the insertion operation is successful
     * @param Success Whether the insertion operation is successful
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get Message description of the operation result 
     * @return Message Message description of the operation result
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Message description of the operation result
     * @param Message Message description of the operation result
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Number of inserted data rows 
     * @return InsertCount Number of inserted data rows
     */
    public Long getInsertCount() {
        return this.InsertCount;
    }

    /**
     * Set Number of inserted data rows
     * @param InsertCount Number of inserted data rows
     */
    public void setInsertCount(Long InsertCount) {
        this.InsertCount = InsertCount;
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

    public InsertDatasToTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsertDatasToTableResponse(InsertDatasToTableResponse source) {
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InsertCount != null) {
            this.InsertCount = new Long(source.InsertCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InsertCount", this.InsertCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
