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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHistoryAccountsResponse extends AbstractModel{

    /**
    * Total number of records in account change history list.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Account change history data array.
    */
    @SerializedName("HistoryAccounts")
    @Expose
    private HistoryAccount [] HistoryAccounts;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records in account change history list. 
     * @return TotalCount Total number of records in account change history list.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records in account change history list.
     * @param TotalCount Total number of records in account change history list.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Account change history data array. 
     * @return HistoryAccounts Account change history data array.
     */
    public HistoryAccount [] getHistoryAccounts() {
        return this.HistoryAccounts;
    }

    /**
     * Set Account change history data array.
     * @param HistoryAccounts Account change history data array.
     */
    public void setHistoryAccounts(HistoryAccount [] HistoryAccounts) {
        this.HistoryAccounts = HistoryAccounts;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "HistoryAccounts.", this.HistoryAccounts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

