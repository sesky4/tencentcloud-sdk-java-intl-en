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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterAttributeResponse extends AbstractModel{

    /**
    * Project of the Cluster
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * Cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * Auto-upgrades cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private AutoUpgradeClusterLevel AutoUpgradeClusterLevel;

    /**
    * Whether to enable qGPU Sharing
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Project of the Cluster
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project of the Cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project of the Cluster
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project of the Cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cluster name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterName Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterDesc Cluster description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set Cluster description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterDesc Cluster description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get Cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterLevel Cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set Cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterLevel Cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get Auto-upgrades cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoUpgradeClusterLevel Auto-upgrades cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AutoUpgradeClusterLevel getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set Auto-upgrades cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AutoUpgradeClusterLevel Auto-upgrades cluster specification
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoUpgradeClusterLevel(AutoUpgradeClusterLevel AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get Whether to enable qGPU Sharing
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return QGPUShareEnable Whether to enable qGPU Sharing
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set Whether to enable qGPU Sharing
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param QGPUShareEnable Whether to enable qGPU Sharing
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
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

    public ModifyClusterAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAttributeResponse(ModifyClusterAttributeResponse source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new AutoUpgradeClusterLevel(source.AutoUpgradeClusterLevel);
        }
        if (source.QGPUShareEnable != null) {
            this.QGPUShareEnable = new Boolean(source.QGPUShareEnable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamObj(map, prefix + "AutoUpgradeClusterLevel.", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "QGPUShareEnable", this.QGPUShareEnable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

