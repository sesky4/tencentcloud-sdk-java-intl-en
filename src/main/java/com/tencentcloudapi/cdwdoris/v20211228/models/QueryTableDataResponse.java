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

public class QueryTableDataResponse extends AbstractModel {

    /**
    * Total records of query results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Field name array of query results
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * Field type array of query results
    */
    @SerializedName("FieldTypes")
    @Expose
    private String [] FieldTypes;

    /**
    * Returned data record array. Each element is an array, containing the value of the corresponding field.
    */
    @SerializedName("Rows")
    @Expose
    private Rows [] Rows;

    /**
    * Error message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total records of query results 
     * @return TotalCount Total records of query results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total records of query results
     * @param TotalCount Total records of query results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Field name array of query results 
     * @return Fields Field name array of query results
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set Field name array of query results
     * @param Fields Field name array of query results
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get Field type array of query results 
     * @return FieldTypes Field type array of query results
     */
    public String [] getFieldTypes() {
        return this.FieldTypes;
    }

    /**
     * Set Field type array of query results
     * @param FieldTypes Field type array of query results
     */
    public void setFieldTypes(String [] FieldTypes) {
        this.FieldTypes = FieldTypes;
    }

    /**
     * Get Returned data record array. Each element is an array, containing the value of the corresponding field. 
     * @return Rows Returned data record array. Each element is an array, containing the value of the corresponding field.
     */
    public Rows [] getRows() {
        return this.Rows;
    }

    /**
     * Set Returned data record array. Each element is an array, containing the value of the corresponding field.
     * @param Rows Returned data record array. Each element is an array, containing the value of the corresponding field.
     */
    public void setRows(Rows [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Error message 
     * @return Message Error message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message
     * @param Message Error message
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public QueryTableDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTableDataResponse(QueryTableDataResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.FieldTypes != null) {
            this.FieldTypes = new String[source.FieldTypes.length];
            for (int i = 0; i < source.FieldTypes.length; i++) {
                this.FieldTypes[i] = new String(source.FieldTypes[i]);
            }
        }
        if (source.Rows != null) {
            this.Rows = new Rows[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new Rows(source.Rows[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
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
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamArraySimple(map, prefix + "FieldTypes.", this.FieldTypes);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

