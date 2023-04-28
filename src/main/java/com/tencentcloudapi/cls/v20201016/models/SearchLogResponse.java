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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel{

    /**
    * You can pass through the `Context` value (validity: 1 hour) returned by this API to continue to get more logs.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Whether to return all raw log query results. If not, you can use `Context` to continue to get logs.
Note: This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * Whether the returned data is the analysis (SQL) result
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * Raw logs that meet the search conditions
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * Column names of log analysis
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * Log analysis result
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AnalysisResults")
    @Expose
    private LogItems [] AnalysisResults;

    /**
    * Log analysis result
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AnalysisRecords")
    @Expose
    private String [] AnalysisRecords;

    /**
    * Column attributes of log analysis
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * Sample rate used in this statistical analysis
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get You can pass through the `Context` value (validity: 1 hour) returned by this API to continue to get more logs. 
     * @return Context You can pass through the `Context` value (validity: 1 hour) returned by this API to continue to get more logs.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set You can pass through the `Context` value (validity: 1 hour) returned by this API to continue to get more logs.
     * @param Context You can pass through the `Context` value (validity: 1 hour) returned by this API to continue to get more logs.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Whether to return all raw log query results. If not, you can use `Context` to continue to get logs.
Note: This parameter is valid only when the query statement (`Query`) does not contain an SQL statement. 
     * @return ListOver Whether to return all raw log query results. If not, you can use `Context` to continue to get logs.
Note: This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set Whether to return all raw log query results. If not, you can use `Context` to continue to get logs.
Note: This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
     * @param ListOver Whether to return all raw log query results. If not, you can use `Context` to continue to get logs.
Note: This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get Whether the returned data is the analysis (SQL) result 
     * @return Analysis Whether the returned data is the analysis (SQL) result
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set Whether the returned data is the analysis (SQL) result
     * @param Analysis Whether the returned data is the analysis (SQL) result
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get Raw logs that meet the search conditions
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Results Raw logs that meet the search conditions
Note: This field may return `null`, indicating that no valid value was found.
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set Raw logs that meet the search conditions
Note: This field may return `null`, indicating that no valid value was found.
     * @param Results Raw logs that meet the search conditions
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setResults(LogInfo [] Results) {
        this.Results = Results;
    }

    /**
     * Get Column names of log analysis
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ColNames Column names of log analysis
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set Column names of log analysis
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param ColNames Column names of log analysis
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get Log analysis result
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AnalysisResults Log analysis result
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public LogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set Log analysis result
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param AnalysisResults Log analysis result
This parameter is valid only when `UseNewAnalysis` is `false`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAnalysisResults(LogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    /**
     * Get Log analysis result
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AnalysisRecords Log analysis result
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getAnalysisRecords() {
        return this.AnalysisRecords;
    }

    /**
     * Set Log analysis result
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param AnalysisRecords Log analysis result
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAnalysisRecords(String [] AnalysisRecords) {
        this.AnalysisRecords = AnalysisRecords;
    }

    /**
     * Get Column attributes of log analysis
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Columns Column attributes of log analysis
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Column attributes of log analysis
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Columns Column attributes of log analysis
This parameter is valid only when `UseNewAnalysis` is `true`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Sample rate used in this statistical analysis
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SamplingRate Sample rate used in this statistical analysis
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set Sample rate used in this statistical analysis
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SamplingRate Sample rate used in this statistical analysis
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
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

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Analysis != null) {
            this.Analysis = new Boolean(source.Analysis);
        }
        if (source.Results != null) {
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
            }
        }
        if (source.ColNames != null) {
            this.ColNames = new String[source.ColNames.length];
            for (int i = 0; i < source.ColNames.length; i++) {
                this.ColNames[i] = new String(source.ColNames[i]);
            }
        }
        if (source.AnalysisResults != null) {
            this.AnalysisResults = new LogItems[source.AnalysisResults.length];
            for (int i = 0; i < source.AnalysisResults.length; i++) {
                this.AnalysisResults[i] = new LogItems(source.AnalysisResults[i]);
            }
        }
        if (source.AnalysisRecords != null) {
            this.AnalysisRecords = new String[source.AnalysisRecords.length];
            for (int i = 0; i < source.AnalysisRecords.length; i++) {
                this.AnalysisRecords[i] = new String(source.AnalysisRecords[i]);
            }
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Float(source.SamplingRate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "Analysis", this.Analysis);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArraySimple(map, prefix + "ColNames.", this.ColNames);
        this.setParamArrayObj(map, prefix + "AnalysisResults.", this.AnalysisResults);
        this.setParamArraySimple(map, prefix + "AnalysisRecords.", this.AnalysisRecords);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

