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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParameterTemplateAttributesResponse extends AbstractModel {

    /**
    * Parameter template ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Number of parameters contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Parameter information contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamInfoSet")
    @Expose
    private ParamInfo [] ParamInfoSet;

    /**
    * Parameter template name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Database version applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Database engine applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * Parameter template description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Parameter template ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateId Parameter template ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Parameter template ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateId Parameter template ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Number of parameters contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of parameters contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of parameters contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of parameters contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Parameter information contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamInfoSet Parameter information contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo [] getParamInfoSet() {
        return this.ParamInfoSet;
    }

    /**
     * Set Parameter information contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamInfoSet Parameter information contained in the parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamInfoSet(ParamInfo [] ParamInfoSet) {
        this.ParamInfoSet = ParamInfoSet;
    }

    /**
     * Get Parameter template name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateName Parameter template name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Parameter template name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateName Parameter template name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Database version applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBMajorVersion Database version applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set Database version applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBMajorVersion Database version applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Database engine applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBEngine Database engine applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engine applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBEngine Database engine applicable to a parameter template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get Parameter template description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateDescription Parameter template description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Parameter template description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateDescription Parameter template description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeParameterTemplateAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParameterTemplateAttributesResponse(DescribeParameterTemplateAttributesResponse source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ParamInfoSet != null) {
            this.ParamInfoSet = new ParamInfo[source.ParamInfoSet.length];
            for (int i = 0; i < source.ParamInfoSet.length; i++) {
                this.ParamInfoSet[i] = new ParamInfo(source.ParamInfoSet[i]);
            }
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ParamInfoSet.", this.ParamInfoSet);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

