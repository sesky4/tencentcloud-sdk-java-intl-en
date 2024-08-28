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

public class ExportAssetJarListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>Name- string - required: no - package name</li>
<li>Type- uint - required: no - type	
1: Application
2: System library
3: Web service built-in library
4: Other dependent packages</li>
<li>Status- string - required: no - whether executable: 0 - no; 1 yes</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

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
     * Get Filter criteria
<li>Name- string - required: no - package name</li>
<li>Type- uint - required: no - type	
1: Application
2: System library
3: Web service built-in library
4: Other dependent packages</li>
<li>Status- string - required: no - whether executable: 0 - no; 1 yes</li> 
     * @return Filters Filter criteria
<li>Name- string - required: no - package name</li>
<li>Type- uint - required: no - type	
1: Application
2: System library
3: Web service built-in library
4: Other dependent packages</li>
<li>Status- string - required: no - whether executable: 0 - no; 1 yes</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Name- string - required: no - package name</li>
<li>Type- uint - required: no - type	
1: Application
2: System library
3: Web service built-in library
4: Other dependent packages</li>
<li>Status- string - required: no - whether executable: 0 - no; 1 yes</li>
     * @param Filters Filter criteria
<li>Name- string - required: no - package name</li>
<li>Type- uint - required: no - type	
1: Application
2: System library
3: Web service built-in library
4: Other dependent packages</li>
<li>Status- string - required: no - whether executable: 0 - no; 1 yes</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

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

    public ExportAssetJarListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetJarListRequest(ExportAssetJarListRequest source) {
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

