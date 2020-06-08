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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogSearchRequest extends AbstractModel{

    /**
    * Log start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Exact search by `apiid` or `reqid`
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of logs returned at a time. Up to 100 logs can be returned at a time
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
    */
    @SerializedName("ConText")
    @Expose
    private String ConText;

    /**
    * Log sorting by time in ascending order (asc) or descending order (desc). The default value is `desc`
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Fuzzy search of logs by keyword
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get Log start time 
     * @return StartTime Log start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time
     * @param StartTime Log start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time 
     * @return EndTime Log end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time
     * @param EndTime Log end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Exact search by `apiid` or `reqid` 
     * @return Filters Exact search by `apiid` or `reqid`
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Exact search by `apiid` or `reqid`
     * @param Filters Exact search by `apiid` or `reqid`
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of logs returned at a time. Up to 100 logs can be returned at a time 
     * @return Limit Number of logs returned at a time. Up to 100 logs can be returned at a time
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of logs returned at a time. Up to 100 logs can be returned at a time
     * @param Limit Number of logs returned at a time. Up to 100 logs can be returned at a time
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained 
     * @return ConText Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
     */
    public String getConText() {
        return this.ConText;
    }

    /**
     * Set Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
     * @param ConText Subsequent content can be obtained based on the `ConText` returned last time. Up to 10,000 data entries can be obtained
     */
    public void setConText(String ConText) {
        this.ConText = ConText;
    }

    /**
     * Get Log sorting by time in ascending order (asc) or descending order (desc). The default value is `desc` 
     * @return Sort Log sorting by time in ascending order (asc) or descending order (desc). The default value is `desc`
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Log sorting by time in ascending order (asc) or descending order (desc). The default value is `desc`
     * @param Sort Log sorting by time in ascending order (asc) or descending order (desc). The default value is `desc`
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Fuzzy search of logs by keyword 
     * @return Query Fuzzy search of logs by keyword
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Fuzzy search of logs by keyword
     * @param Query Fuzzy search of logs by keyword
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConText", this.ConText);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

