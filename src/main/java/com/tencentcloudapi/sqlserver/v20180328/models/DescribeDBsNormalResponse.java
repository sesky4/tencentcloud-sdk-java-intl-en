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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBsNormalResponse extends AbstractModel{

    /**
    * Total number of databases of the instance
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Detailed database configurations, such as whether CDC or CT is enabled for the database
    */
    @SerializedName("DBList")
    @Expose
    private DbNormalDetail [] DBList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of databases of the instance 
     * @return TotalCount Total number of databases of the instance
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of databases of the instance
     * @param TotalCount Total number of databases of the instance
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Detailed database configurations, such as whether CDC or CT is enabled for the database 
     * @return DBList Detailed database configurations, such as whether CDC or CT is enabled for the database
     */
    public DbNormalDetail [] getDBList() {
        return this.DBList;
    }

    /**
     * Set Detailed database configurations, such as whether CDC or CT is enabled for the database
     * @param DBList Detailed database configurations, such as whether CDC or CT is enabled for the database
     */
    public void setDBList(DbNormalDetail [] DBList) {
        this.DBList = DBList;
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

    public DescribeDBsNormalResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBsNormalResponse(DescribeDBsNormalResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DBList != null) {
            this.DBList = new DbNormalDetail[source.DBList.length];
            for (int i = 0; i < source.DBList.length; i++) {
                this.DBList[i] = new DbNormalDetail(source.DBList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DBList.", this.DBList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

