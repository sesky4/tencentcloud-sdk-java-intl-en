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

public class DescribeAssetEnvListRequest extends AbstractModel {

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * This field has been deprecated and replaced with Filters.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Name - string - required: no - environment variable name</li>
<li>Type - int - required: no - type: 0: user variable; 1: system variable</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Offset, which defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items to be returned. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting method: [FirstTime]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get This field has been deprecated and replaced with Filters. 
     * @return Type This field has been deprecated and replaced with Filters.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set This field has been deprecated and replaced with Filters.
     * @param Type This field has been deprecated and replaced with Filters.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Name - string - required: no - environment variable name</li>
<li>Type - int - required: no - type: 0: user variable; 1: system variable</li> 
     * @return Filters Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Name - string - required: no - environment variable name</li>
<li>Type - int - required: no - type: 0: user variable; 1: system variable</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Name - string - required: no - environment variable name</li>
<li>Type - int - required: no - type: 0: user variable; 1: system variable</li>
     * @param Filters Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Name - string - required: no - environment variable name</li>
<li>Type - int - required: no - type: 0: user variable; 1: system variable</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset, which defaults to 0 
     * @return Offset Offset, which defaults to 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0
     * @param Offset Offset, which defaults to 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items to be returned. It is 10 by default, and the maximum value is 100. 
     * @return Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. It is 10 by default, and the maximum value is 100.
     * @param Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting method: asc for ascending order or desc for descending order 
     * @return Order Sorting method: asc for ascending order or desc for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: asc for ascending order or desc for descending order
     * @param Order Sorting method: asc for ascending order or desc for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting method: [FirstTime] 
     * @return By Sorting method: [FirstTime]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting method: [FirstTime]
     * @param By Sorting method: [FirstTime]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAssetEnvListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetEnvListRequest(DescribeAssetEnvListRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

