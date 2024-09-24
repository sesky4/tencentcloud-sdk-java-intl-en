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

public class DescribeVulEffectModulesResponse extends AbstractModel {

    /**
    * Total number of lists
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulEffectModuleInfo")
    @Expose
    private VulEffectModuleInfo [] VulEffectModuleInfo;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of lists 
     * @return TotalCount Total number of lists
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of lists
     * @param TotalCount Total number of lists
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of affected hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulEffectModuleInfo List of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VulEffectModuleInfo [] getVulEffectModuleInfo() {
        return this.VulEffectModuleInfo;
    }

    /**
     * Set List of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulEffectModuleInfo List of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulEffectModuleInfo(VulEffectModuleInfo [] VulEffectModuleInfo) {
        this.VulEffectModuleInfo = VulEffectModuleInfo;
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

    public DescribeVulEffectModulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulEffectModulesResponse(DescribeVulEffectModulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VulEffectModuleInfo != null) {
            this.VulEffectModuleInfo = new VulEffectModuleInfo[source.VulEffectModuleInfo.length];
            for (int i = 0; i < source.VulEffectModuleInfo.length; i++) {
                this.VulEffectModuleInfo[i] = new VulEffectModuleInfo(source.VulEffectModuleInfo[i]);
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
        this.setParamArrayObj(map, prefix + "VulEffectModuleInfo.", this.VulEffectModuleInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
