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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOtherCHDFSBindingListResponse extends AbstractModel {

    /**
    * List not bound to DLC products
    */
    @SerializedName("OtherCHDFSBindingList")
    @Expose
    private OtherCHDFSBinding [] OtherCHDFSBindingList;

    /**
    * Total records
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List not bound to DLC products 
     * @return OtherCHDFSBindingList List not bound to DLC products
     */
    public OtherCHDFSBinding [] getOtherCHDFSBindingList() {
        return this.OtherCHDFSBindingList;
    }

    /**
     * Set List not bound to DLC products
     * @param OtherCHDFSBindingList List not bound to DLC products
     */
    public void setOtherCHDFSBindingList(OtherCHDFSBinding [] OtherCHDFSBindingList) {
        this.OtherCHDFSBindingList = OtherCHDFSBindingList;
    }

    /**
     * Get Total records 
     * @return Total Total records
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total records
     * @param Total Total records
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeOtherCHDFSBindingListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOtherCHDFSBindingListResponse(DescribeOtherCHDFSBindingListResponse source) {
        if (source.OtherCHDFSBindingList != null) {
            this.OtherCHDFSBindingList = new OtherCHDFSBinding[source.OtherCHDFSBindingList.length];
            for (int i = 0; i < source.OtherCHDFSBindingList.length; i++) {
                this.OtherCHDFSBindingList[i] = new OtherCHDFSBinding(source.OtherCHDFSBindingList[i]);
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
        this.setParamArrayObj(map, prefix + "OtherCHDFSBindingList.", this.OtherCHDFSBindingList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
