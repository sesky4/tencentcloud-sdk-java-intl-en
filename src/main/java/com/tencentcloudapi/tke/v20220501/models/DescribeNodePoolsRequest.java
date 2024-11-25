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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodePoolsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Query filter criteria:
·  NodePoolsName
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  NodePoolsId
    Filter by [Node Pool id].
    Type: String
        Required: No



·  tags
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No



·  tag:tag-key
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: 20; maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Query filter criteria:
·  NodePoolsName
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  NodePoolsId
    Filter by [Node Pool id].
    Type: String
        Required: No



·  tags
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No



·  tag:tag-key
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No 
     * @return Filters Query filter criteria:
·  NodePoolsName
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  NodePoolsId
    Filter by [Node Pool id].
    Type: String
        Required: No



·  tags
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No



·  tag:tag-key
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query filter criteria:
·  NodePoolsName
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  NodePoolsId
    Filter by [Node Pool id].
    Type: String
        Required: No



·  tags
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No



·  tag:tag-key
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No
     * @param Filters Query filter criteria:
·  NodePoolsName
    Filter by [Node Pool Name].
    Type: String
        Required: No



·  NodePoolsId
    Filter by [Node Pool id].
    Type: String
        Required: No



·  tags
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No



·  tag:tag-key
    Filter by [Tag Key-value Pairs].
    Type: String
        Required: No
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: 20; maximum value: 100. 
     * @return Limit Maximum number of output entries. Default value: 20; maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: 20; maximum value: 100.
     * @param Limit Maximum number of output entries. Default value: 20; maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNodePoolsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodePoolsRequest(DescribeNodePoolsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

