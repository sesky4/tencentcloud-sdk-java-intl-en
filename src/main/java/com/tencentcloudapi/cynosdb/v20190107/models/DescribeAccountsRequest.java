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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountsRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of accounts to be filtered
    */
    @SerializedName("AccountNames")
    @Expose
    private String [] AccountNames;

    /**
    * Database type. Valid values: 
<li> MYSQL </li>
This parameter has been disused.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * List of accounts to be filtered
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Maximum entries returned per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get List of accounts to be filtered 
     * @return AccountNames List of accounts to be filtered
     */
    public String [] getAccountNames() {
        return this.AccountNames;
    }

    /**
     * Set List of accounts to be filtered
     * @param AccountNames List of accounts to be filtered
     */
    public void setAccountNames(String [] AccountNames) {
        this.AccountNames = AccountNames;
    }

    /**
     * Get Database type. Valid values: 
<li> MYSQL </li>
This parameter has been disused. 
     * @return DbType Database type. Valid values: 
<li> MYSQL </li>
This parameter has been disused.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type. Valid values: 
<li> MYSQL </li>
This parameter has been disused.
     * @param DbType Database type. Valid values: 
<li> MYSQL </li>
This parameter has been disused.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get List of accounts to be filtered 
     * @return Hosts List of accounts to be filtered
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set List of accounts to be filtered
     * @param Hosts List of accounts to be filtered
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Maximum entries returned per page 
     * @return Limit Maximum entries returned per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum entries returned per page
     * @param Limit Maximum entries returned per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountNames != null) {
            this.AccountNames = new String[source.AccountNames.length];
            for (int i = 0; i < source.AccountNames.length; i++) {
                this.AccountNames[i] = new String(source.AccountNames[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "AccountNames.", this.AccountNames);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

