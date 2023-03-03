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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDocumentsByRoomResponse extends AbstractModel{

    /**
    * The information of the documents.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Documents")
    @Expose
    private DocumentInfo [] Documents;

    /**
    * The total number of records that meet the conditions.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The information of the documents.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Documents The information of the documents.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DocumentInfo [] getDocuments() {
        return this.Documents;
    }

    /**
     * Set The information of the documents.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Documents The information of the documents.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocuments(DocumentInfo [] Documents) {
        this.Documents = Documents;
    }

    /**
     * Get The total number of records that meet the conditions. 
     * @return Total The total number of records that meet the conditions.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of records that meet the conditions.
     * @param Total The total number of records that meet the conditions.
     */
    public void setTotal(Long Total) {
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

    public DescribeDocumentsByRoomResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocumentsByRoomResponse(DescribeDocumentsByRoomResponse source) {
        if (source.Documents != null) {
            this.Documents = new DocumentInfo[source.Documents.length];
            for (int i = 0; i < source.Documents.length; i++) {
                this.Documents[i] = new DocumentInfo(source.Documents[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Documents.", this.Documents);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

