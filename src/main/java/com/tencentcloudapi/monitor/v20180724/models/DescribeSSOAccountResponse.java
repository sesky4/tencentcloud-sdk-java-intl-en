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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSOAccountResponse extends AbstractModel{

    /**
    * List of authorized accounts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountSet")
    @Expose
    private GrafanaAccountInfo [] AccountSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of authorized accounts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccountSet List of authorized accounts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GrafanaAccountInfo [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set List of authorized accounts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccountSet List of authorized accounts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccountSet(GrafanaAccountInfo [] AccountSet) {
        this.AccountSet = AccountSet;
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

    public DescribeSSOAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSSOAccountResponse(DescribeSSOAccountResponse source) {
        if (source.AccountSet != null) {
            this.AccountSet = new GrafanaAccountInfo[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new GrafanaAccountInfo(source.AccountSet[i]);
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
        this.setParamArrayObj(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

