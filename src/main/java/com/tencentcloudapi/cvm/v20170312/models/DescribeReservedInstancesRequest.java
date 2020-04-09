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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedInstancesRequest extends AbstractModel{

    /**
    * Dry run. The default is false.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>availability zones</strong>** in which reserved instances can be purchased. For example, "ap-guangzhou-1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/6091">list of availability zones</a></p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filters by reserved instance **<strong>validity</strong>** (in seconds). For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer</p><p style="padding-left: 30px;">Unit: second</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years)</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>specifications of reserved instances</strong>**. For example, "S3.MEDIUM4".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/11518">list of reserved instance specifiations</a></p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>payment method</strong>**. For example, "All Upfront".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: All Upfront</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>operating system</strong>** of the reserved instance. For example, "linux".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: linux</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance ID</strong>. Reserved instance IDs take the form "650c138f-ae7e-4750-952a-96841d6e9fc1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance status</strong>. For example, "active".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required</p><p style="padding-left: 30px;">Valid values: "active" (created) | "pending" (waiting to be created) | "retired" (expired)</p>
Each request can have up to 10 `Filters` and 5 `Filters.Values`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Dry run. The default is false. 
     * @return DryRun Dry run. The default is false.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Dry run. The default is false.
     * @param DryRun Dry run. The default is false.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). 
     * @return Offset Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     * @param Offset Offset. The default value is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). 
     * @return Limit Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     * @param Limit Number of returned results. The default value is 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>availability zones</strong>** in which reserved instances can be purchased. For example, "ap-guangzhou-1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/6091">list of availability zones</a></p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filters by reserved instance **<strong>validity</strong>** (in seconds). For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer</p><p style="padding-left: 30px;">Unit: second</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years)</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>specifications of reserved instances</strong>**. For example, "S3.MEDIUM4".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/11518">list of reserved instance specifiations</a></p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>payment method</strong>**. For example, "All Upfront".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: All Upfront</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>operating system</strong>** of the reserved instance. For example, "linux".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: linux</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance ID</strong>. Reserved instance IDs take the form "650c138f-ae7e-4750-952a-96841d6e9fc1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance status</strong>. For example, "active".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required</p><p style="padding-left: 30px;">Valid values: "active" (created) | "pending" (waiting to be created) | "retired" (expired)</p>
Each request can have up to 10 `Filters` and 5 `Filters.Values`. 
     * @return Filters <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>availability zones</strong>** in which reserved instances can be purchased. For example, "ap-guangzhou-1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/6091">list of availability zones</a></p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filters by reserved instance **<strong>validity</strong>** (in seconds). For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer</p><p style="padding-left: 30px;">Unit: second</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years)</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>specifications of reserved instances</strong>**. For example, "S3.MEDIUM4".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/11518">list of reserved instance specifiations</a></p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>payment method</strong>**. For example, "All Upfront".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: All Upfront</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>operating system</strong>** of the reserved instance. For example, "linux".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: linux</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance ID</strong>. Reserved instance IDs take the form "650c138f-ae7e-4750-952a-96841d6e9fc1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance status</strong>. For example, "active".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required</p><p style="padding-left: 30px;">Valid values: "active" (created) | "pending" (waiting to be created) | "retired" (expired)</p>
Each request can have up to 10 `Filters` and 5 `Filters.Values`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>availability zones</strong>** in which reserved instances can be purchased. For example, "ap-guangzhou-1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/6091">list of availability zones</a></p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filters by reserved instance **<strong>validity</strong>** (in seconds). For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer</p><p style="padding-left: 30px;">Unit: second</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years)</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>specifications of reserved instances</strong>**. For example, "S3.MEDIUM4".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/11518">list of reserved instance specifiations</a></p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>payment method</strong>**. For example, "All Upfront".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: All Upfront</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>operating system</strong>** of the reserved instance. For example, "linux".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: linux</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance ID</strong>. Reserved instance IDs take the form "650c138f-ae7e-4750-952a-96841d6e9fc1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance status</strong>. For example, "active".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required</p><p style="padding-left: 30px;">Valid values: "active" (created) | "pending" (waiting to be created) | "retired" (expired)</p>
Each request can have up to 10 `Filters` and 5 `Filters.Values`.
     * @param Filters <li><strong>zone</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>availability zones</strong>** in which reserved instances can be purchased. For example, "ap-guangzhou-1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/6091">list of availability zones</a></p>
<li><strong>duration</strong></li>
<p style="padding-left: 30px;">Filters by reserved instance **<strong>validity</strong>** (in seconds). For example, 31536000.</p><p style="padding-left: 30px;">Type: Integer</p><p style="padding-left: 30px;">Unit: second</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: 31536000 (1 year) | 94608000 (3 years)</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>specifications of reserved instances</strong>**. For example, "S3.MEDIUM4".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid values: <a href="https://cloud.tencent.com/document/product/213/11518">list of reserved instance specifiations</a></p>
<li><strong>offering-type</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>payment method</strong>**. For example, "All Upfront".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: All Upfront</p>
<li><strong>product-description</strong></li>
<p style="padding-left: 30px;">Filters by the **<strong>operating system</strong>** of the reserved instance. For example, "linux".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p><p style="padding-left: 30px;">Valid value: linux</p>
<li><strong>reserved-instances-id</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance ID</strong>. Reserved instance IDs take the form "650c138f-ae7e-4750-952a-96841d6e9fc1".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required: no</p>
<li><strong>state</strong></li>
<p style="padding-left: 30px;">Filters by **<strong>reserved instance status</strong>. For example, "active".</p><p style="padding-left: 30px;">Type: String</p><p style="padding-left: 30px;">Required</p><p style="padding-left: 30px;">Valid values: "active" (created) | "pending" (waiting to be created) | "retired" (expired)</p>
Each request can have up to 10 `Filters` and 5 `Filters.Values`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

