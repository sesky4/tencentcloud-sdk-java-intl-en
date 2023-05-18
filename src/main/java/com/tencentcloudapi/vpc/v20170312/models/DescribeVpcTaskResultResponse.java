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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcTaskResultResponse extends AbstractModel{

    /**
    * The execution results of an async task. Valid values: `SUCCESS`(task executed successfully), `FAILED` (task execution failed), and `RUNNING` (task in progress). 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Output of the async task execution result
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Detailed result of an async task, such as the result of batch deleting ENIs.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private VpcTaskResultDetailInfo [] Result;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The execution results of an async task. Valid values: `SUCCESS`(task executed successfully), `FAILED` (task execution failed), and `RUNNING` (task in progress).  
     * @return Status The execution results of an async task. Valid values: `SUCCESS`(task executed successfully), `FAILED` (task execution failed), and `RUNNING` (task in progress). 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The execution results of an async task. Valid values: `SUCCESS`(task executed successfully), `FAILED` (task execution failed), and `RUNNING` (task in progress). 
     * @param Status The execution results of an async task. Valid values: `SUCCESS`(task executed successfully), `FAILED` (task execution failed), and `RUNNING` (task in progress). 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Output of the async task execution result 
     * @return Output Output of the async task execution result
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Output of the async task execution result
     * @param Output Output of the async task execution result
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Detailed result of an async task, such as the result of batch deleting ENIs.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Result Detailed result of an async task, such as the result of batch deleting ENIs.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public VpcTaskResultDetailInfo [] getResult() {
        return this.Result;
    }

    /**
     * Set Detailed result of an async task, such as the result of batch deleting ENIs.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Result Detailed result of an async task, such as the result of batch deleting ENIs.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setResult(VpcTaskResultDetailInfo [] Result) {
        this.Result = Result;
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

    public DescribeVpcTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcTaskResultResponse(DescribeVpcTaskResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.Result != null) {
            this.Result = new VpcTaskResultDetailInfo[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new VpcTaskResultDetailInfo(source.Result[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

