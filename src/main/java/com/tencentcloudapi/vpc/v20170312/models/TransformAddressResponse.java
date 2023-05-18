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

public class TransformAddressResponse extends AbstractModel{

    /**
    * The async task ID. You can use the [DescribeTaskResult](https://intl.cloud.tencent.com/document/api/215/36271?from_cn_redirect=1) API to query the task status.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * The unique ID after converting to EIP
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The async task ID. You can use the [DescribeTaskResult](https://intl.cloud.tencent.com/document/api/215/36271?from_cn_redirect=1) API to query the task status. 
     * @return TaskId The async task ID. You can use the [DescribeTaskResult](https://intl.cloud.tencent.com/document/api/215/36271?from_cn_redirect=1) API to query the task status.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The async task ID. You can use the [DescribeTaskResult](https://intl.cloud.tencent.com/document/api/215/36271?from_cn_redirect=1) API to query the task status.
     * @param TaskId The async task ID. You can use the [DescribeTaskResult](https://intl.cloud.tencent.com/document/api/215/36271?from_cn_redirect=1) API to query the task status.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The unique ID after converting to EIP 
     * @return AddressId The unique ID after converting to EIP
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set The unique ID after converting to EIP
     * @param AddressId The unique ID after converting to EIP
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
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

    public TransformAddressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransformAddressResponse(TransformAddressResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

