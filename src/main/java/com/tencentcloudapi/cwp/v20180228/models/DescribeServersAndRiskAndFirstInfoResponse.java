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

public class DescribeServersAndRiskAndFirstInfoResponse extends AbstractModel {

    /**
    * Number of risky files
    */
    @SerializedName("RiskFileCount")
    @Expose
    private Long RiskFileCount;

    /**
    * New risky files today
    */
    @SerializedName("AddRiskFileCount")
    @Expose
    private Long AddRiskFileCount;

    /**
    * Number of affected servers
    */
    @SerializedName("ServersCount")
    @Expose
    private Long ServersCount;

    /**
    * Whether it is in trial. true: yes; false: no.
    */
    @SerializedName("IsFirstCheck")
    @Expose
    private Boolean IsFirstCheck;

    /**
    * Last Trojan detection time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of risky files 
     * @return RiskFileCount Number of risky files
     */
    public Long getRiskFileCount() {
        return this.RiskFileCount;
    }

    /**
     * Set Number of risky files
     * @param RiskFileCount Number of risky files
     */
    public void setRiskFileCount(Long RiskFileCount) {
        this.RiskFileCount = RiskFileCount;
    }

    /**
     * Get New risky files today 
     * @return AddRiskFileCount New risky files today
     */
    public Long getAddRiskFileCount() {
        return this.AddRiskFileCount;
    }

    /**
     * Set New risky files today
     * @param AddRiskFileCount New risky files today
     */
    public void setAddRiskFileCount(Long AddRiskFileCount) {
        this.AddRiskFileCount = AddRiskFileCount;
    }

    /**
     * Get Number of affected servers 
     * @return ServersCount Number of affected servers
     */
    public Long getServersCount() {
        return this.ServersCount;
    }

    /**
     * Set Number of affected servers
     * @param ServersCount Number of affected servers
     */
    public void setServersCount(Long ServersCount) {
        this.ServersCount = ServersCount;
    }

    /**
     * Get Whether it is in trial. true: yes; false: no. 
     * @return IsFirstCheck Whether it is in trial. true: yes; false: no.
     */
    public Boolean getIsFirstCheck() {
        return this.IsFirstCheck;
    }

    /**
     * Set Whether it is in trial. true: yes; false: no.
     * @param IsFirstCheck Whether it is in trial. true: yes; false: no.
     */
    public void setIsFirstCheck(Boolean IsFirstCheck) {
        this.IsFirstCheck = IsFirstCheck;
    }

    /**
     * Get Last Trojan detection time 
     * @return ScanTime Last Trojan detection time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Last Trojan detection time
     * @param ScanTime Last Trojan detection time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
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

    public DescribeServersAndRiskAndFirstInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServersAndRiskAndFirstInfoResponse(DescribeServersAndRiskAndFirstInfoResponse source) {
        if (source.RiskFileCount != null) {
            this.RiskFileCount = new Long(source.RiskFileCount);
        }
        if (source.AddRiskFileCount != null) {
            this.AddRiskFileCount = new Long(source.AddRiskFileCount);
        }
        if (source.ServersCount != null) {
            this.ServersCount = new Long(source.ServersCount);
        }
        if (source.IsFirstCheck != null) {
            this.IsFirstCheck = new Boolean(source.IsFirstCheck);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskFileCount", this.RiskFileCount);
        this.setParamSimple(map, prefix + "AddRiskFileCount", this.AddRiskFileCount);
        this.setParamSimple(map, prefix + "ServersCount", this.ServersCount);
        this.setParamSimple(map, prefix + "IsFirstCheck", this.IsFirstCheck);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

