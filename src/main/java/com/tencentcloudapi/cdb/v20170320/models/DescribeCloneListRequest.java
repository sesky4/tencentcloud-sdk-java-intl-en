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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloneListRequest extends AbstractModel{

    /**
    * ID of the original instance. This parameter is used to query the clone task list of a specific original instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Paginated query offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results per page in paginated queries
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ID of the original instance. This parameter is used to query the clone task list of a specific original instance. 
     * @return InstanceId ID of the original instance. This parameter is used to query the clone task list of a specific original instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the original instance. This parameter is used to query the clone task list of a specific original instance.
     * @param InstanceId ID of the original instance. This parameter is used to query the clone task list of a specific original instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Paginated query offset 
     * @return Offset Paginated query offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset
     * @param Offset Paginated query offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of results per page in paginated queries 
     * @return Limit The number of results per page in paginated queries
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results per page in paginated queries
     * @param Limit The number of results per page in paginated queries
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

