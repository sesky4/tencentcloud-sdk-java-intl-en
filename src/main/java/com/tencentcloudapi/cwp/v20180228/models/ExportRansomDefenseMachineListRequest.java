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

public class ExportRansomDefenseMachineListRequest extends AbstractModel {

    /**
    * Filtering criteria
<li>Ips - String - required: no - IP address for querying</li>
<li>MachineNames - String - required: no - instance name for querying</li>
<li>Names - String - required: no - instance name for querying</li>
<li>Status - String - required: no - policy status: 0: backup in progress; 1: backup succeeded; 2: backup failed</li>
<li>LastBackupTimeBegin - String - required: no - start of the last backup time</li>
<li>LastBackupTimeEnd - String - required: no - end of the last backup time</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting method: ASC / DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting fields, supporting CreateTime and MachineCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filtering criteria
<li>Ips - String - required: no - IP address for querying</li>
<li>MachineNames - String - required: no - instance name for querying</li>
<li>Names - String - required: no - instance name for querying</li>
<li>Status - String - required: no - policy status: 0: backup in progress; 1: backup succeeded; 2: backup failed</li>
<li>LastBackupTimeBegin - String - required: no - start of the last backup time</li>
<li>LastBackupTimeEnd - String - required: no - end of the last backup time</li> 
     * @return Filters Filtering criteria
<li>Ips - String - required: no - IP address for querying</li>
<li>MachineNames - String - required: no - instance name for querying</li>
<li>Names - String - required: no - instance name for querying</li>
<li>Status - String - required: no - policy status: 0: backup in progress; 1: backup succeeded; 2: backup failed</li>
<li>LastBackupTimeBegin - String - required: no - start of the last backup time</li>
<li>LastBackupTimeEnd - String - required: no - end of the last backup time</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>Ips - String - required: no - IP address for querying</li>
<li>MachineNames - String - required: no - instance name for querying</li>
<li>Names - String - required: no - instance name for querying</li>
<li>Status - String - required: no - policy status: 0: backup in progress; 1: backup succeeded; 2: backup failed</li>
<li>LastBackupTimeBegin - String - required: no - start of the last backup time</li>
<li>LastBackupTimeEnd - String - required: no - end of the last backup time</li>
     * @param Filters Filtering criteria
<li>Ips - String - required: no - IP address for querying</li>
<li>MachineNames - String - required: no - instance name for querying</li>
<li>Names - String - required: no - instance name for querying</li>
<li>Status - String - required: no - policy status: 0: backup in progress; 1: backup succeeded; 2: backup failed</li>
<li>LastBackupTimeBegin - String - required: no - start of the last backup time</li>
<li>LastBackupTimeEnd - String - required: no - end of the last backup time</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: ASC / DESC 
     * @return Order Sorting method: ASC / DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: ASC / DESC
     * @param Order Sorting method: ASC / DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting fields, supporting CreateTime and MachineCount 
     * @return By Sorting fields, supporting CreateTime and MachineCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting fields, supporting CreateTime and MachineCount
     * @param By Sorting fields, supporting CreateTime and MachineCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportRansomDefenseMachineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRansomDefenseMachineListRequest(ExportRansomDefenseMachineListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

