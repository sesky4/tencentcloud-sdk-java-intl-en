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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkSessionBatchSqlLogResponse extends AbstractModel{

    /**
    * The status. Valid values: `0` (initializing), `1` (successful), `2` (failed), `3` (canceled), and `4` (exception).
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * The log information list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogSet")
    @Expose
    private SparkSessionBatchLog [] LogSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The status. Valid values: `0` (initializing), `1` (successful), `2` (failed), `3` (canceled), and `4` (exception). 
     * @return State The status. Valid values: `0` (initializing), `1` (successful), `2` (failed), `3` (canceled), and `4` (exception).
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set The status. Valid values: `0` (initializing), `1` (successful), `2` (failed), `3` (canceled), and `4` (exception).
     * @param State The status. Valid values: `0` (initializing), `1` (successful), `2` (failed), `3` (canceled), and `4` (exception).
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get The log information list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogSet The log information list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SparkSessionBatchLog [] getLogSet() {
        return this.LogSet;
    }

    /**
     * Set The log information list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogSet The log information list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogSet(SparkSessionBatchLog [] LogSet) {
        this.LogSet = LogSet;
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

    public DescribeSparkSessionBatchSqlLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkSessionBatchSqlLogResponse(DescribeSparkSessionBatchSqlLogResponse source) {
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.LogSet != null) {
            this.LogSet = new SparkSessionBatchLog[source.LogSet.length];
            for (int i = 0; i < source.LogSet.length; i++) {
                this.LogSet[i] = new SparkSessionBatchLog(source.LogSet[i]);
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
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "LogSet.", this.LogSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

