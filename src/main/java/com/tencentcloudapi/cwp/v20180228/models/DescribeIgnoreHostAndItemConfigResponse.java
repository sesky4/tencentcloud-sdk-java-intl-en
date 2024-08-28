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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIgnoreHostAndItemConfigResponse extends AbstractModel {

    /**
    * Affected detection items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemSet")
    @Expose
    private BaselineItemInfo [] ItemSet;

    /**
    * Affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostSet")
    @Expose
    private BaselineHost [] HostSet;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Affected detection items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemSet Affected detection items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaselineItemInfo [] getItemSet() {
        return this.ItemSet;
    }

    /**
     * Set Affected detection items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemSet Affected detection items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemSet(BaselineItemInfo [] ItemSet) {
        this.ItemSet = ItemSet;
    }

    /**
     * Get Affected hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostSet Affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaselineHost [] getHostSet() {
        return this.HostSet;
    }

    /**
     * Set Affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostSet Affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostSet(BaselineHost [] HostSet) {
        this.HostSet = HostSet;
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

    public DescribeIgnoreHostAndItemConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIgnoreHostAndItemConfigResponse(DescribeIgnoreHostAndItemConfigResponse source) {
        if (source.ItemSet != null) {
            this.ItemSet = new BaselineItemInfo[source.ItemSet.length];
            for (int i = 0; i < source.ItemSet.length; i++) {
                this.ItemSet[i] = new BaselineItemInfo(source.ItemSet[i]);
            }
        }
        if (source.HostSet != null) {
            this.HostSet = new BaselineHost[source.HostSet.length];
            for (int i = 0; i < source.HostSet.length; i++) {
                this.HostSet[i] = new BaselineHost(source.HostSet[i]);
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
        this.setParamArrayObj(map, prefix + "ItemSet.", this.ItemSet);
        this.setParamArrayObj(map, prefix + "HostSet.", this.HostSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

