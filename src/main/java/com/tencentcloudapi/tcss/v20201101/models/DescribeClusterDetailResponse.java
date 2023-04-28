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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDetailResponse extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Progress of the current cluster scan task. `100` indicates that the scan is completed.
    */
    @SerializedName("ScanTaskProgress")
    @Expose
    private Long ScanTaskProgress;

    /**
    * Cluster version
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Runtime component
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * Number of nodes in the cluster
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * Cluster status. Valid values: `Running`, `Creating`, `Abnormal`.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * Cluster type. Valid values: `MANAGED_CLUSTER` (managed cluster); `INDEPENDENT_CLUSTER` (self-deployed cluster).
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Number of critical check items
    */
    @SerializedName("SeriousRiskCount")
    @Expose
    private Long SeriousRiskCount;

    /**
    * Number of high-risk check items
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * Number of medium-risk check items
    */
    @SerializedName("MiddleRiskCount")
    @Expose
    private Long MiddleRiskCount;

    /**
    * Number of prompt-risk check items
    */
    @SerializedName("HintRiskCount")
    @Expose
    private Long HintRiskCount;

    /**
    * Status of the check task
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * Status of the defender
    */
    @SerializedName("DefenderStatus")
    @Expose
    private String DefenderStatus;

    /**
    * Creation time of the scan task
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * Network type. Valid values: `PublicNetwork` (public network); `VPCNetwork` (VPC).
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * API server address
    */
    @SerializedName("ApiServerAddress")
    @Expose
    private String ApiServerAddress;

    /**
    * Number of nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Number of namespaces
    */
    @SerializedName("NamespaceCount")
    @Expose
    private Long NamespaceCount;

    /**
    * Number of workloads
    */
    @SerializedName("WorkloadCount")
    @Expose
    private Long WorkloadCount;

    /**
    * Number of Pods
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * Number of Services
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Number of Ingresses
    */
    @SerializedName("IngressCount")
    @Expose
    private Long IngressCount;

    /**
    * IPs of the primary nodes
    */
    @SerializedName("MasterIps")
    @Expose
    private String MasterIps;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Progress of the current cluster scan task. `100` indicates that the scan is completed. 
     * @return ScanTaskProgress Progress of the current cluster scan task. `100` indicates that the scan is completed.
     */
    public Long getScanTaskProgress() {
        return this.ScanTaskProgress;
    }

    /**
     * Set Progress of the current cluster scan task. `100` indicates that the scan is completed.
     * @param ScanTaskProgress Progress of the current cluster scan task. `100` indicates that the scan is completed.
     */
    public void setScanTaskProgress(Long ScanTaskProgress) {
        this.ScanTaskProgress = ScanTaskProgress;
    }

    /**
     * Get Cluster version 
     * @return ClusterVersion Cluster version
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version
     * @param ClusterVersion Cluster version
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Runtime component 
     * @return ContainerRuntime Runtime component
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set Runtime component
     * @param ContainerRuntime Runtime component
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get Number of nodes in the cluster 
     * @return ClusterNodeNum Number of nodes in the cluster
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set Number of nodes in the cluster
     * @param ClusterNodeNum Number of nodes in the cluster
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get Cluster status. Valid values: `Running`, `Creating`, `Abnormal`. 
     * @return ClusterStatus Cluster status. Valid values: `Running`, `Creating`, `Abnormal`.
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status. Valid values: `Running`, `Creating`, `Abnormal`.
     * @param ClusterStatus Cluster status. Valid values: `Running`, `Creating`, `Abnormal`.
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Cluster type. Valid values: `MANAGED_CLUSTER` (managed cluster); `INDEPENDENT_CLUSTER` (self-deployed cluster). 
     * @return ClusterType Cluster type. Valid values: `MANAGED_CLUSTER` (managed cluster); `INDEPENDENT_CLUSTER` (self-deployed cluster).
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values: `MANAGED_CLUSTER` (managed cluster); `INDEPENDENT_CLUSTER` (self-deployed cluster).
     * @param ClusterType Cluster type. Valid values: `MANAGED_CLUSTER` (managed cluster); `INDEPENDENT_CLUSTER` (self-deployed cluster).
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster region 
     * @return Region Cluster region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
     * @param Region Cluster region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Number of critical check items 
     * @return SeriousRiskCount Number of critical check items
     */
    public Long getSeriousRiskCount() {
        return this.SeriousRiskCount;
    }

    /**
     * Set Number of critical check items
     * @param SeriousRiskCount Number of critical check items
     */
    public void setSeriousRiskCount(Long SeriousRiskCount) {
        this.SeriousRiskCount = SeriousRiskCount;
    }

    /**
     * Get Number of high-risk check items 
     * @return HighRiskCount Number of high-risk check items
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set Number of high-risk check items
     * @param HighRiskCount Number of high-risk check items
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get Number of medium-risk check items 
     * @return MiddleRiskCount Number of medium-risk check items
     */
    public Long getMiddleRiskCount() {
        return this.MiddleRiskCount;
    }

    /**
     * Set Number of medium-risk check items
     * @param MiddleRiskCount Number of medium-risk check items
     */
    public void setMiddleRiskCount(Long MiddleRiskCount) {
        this.MiddleRiskCount = MiddleRiskCount;
    }

    /**
     * Get Number of prompt-risk check items 
     * @return HintRiskCount Number of prompt-risk check items
     */
    public Long getHintRiskCount() {
        return this.HintRiskCount;
    }

    /**
     * Set Number of prompt-risk check items
     * @param HintRiskCount Number of prompt-risk check items
     */
    public void setHintRiskCount(Long HintRiskCount) {
        this.HintRiskCount = HintRiskCount;
    }

    /**
     * Get Status of the check task 
     * @return CheckStatus Status of the check task
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set Status of the check task
     * @param CheckStatus Status of the check task
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get Status of the defender 
     * @return DefenderStatus Status of the defender
     */
    public String getDefenderStatus() {
        return this.DefenderStatus;
    }

    /**
     * Set Status of the defender
     * @param DefenderStatus Status of the defender
     */
    public void setDefenderStatus(String DefenderStatus) {
        this.DefenderStatus = DefenderStatus;
    }

    /**
     * Get Creation time of the scan task 
     * @return TaskCreateTime Creation time of the scan task
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set Creation time of the scan task
     * @param TaskCreateTime Creation time of the scan task
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get Network type. Valid values: `PublicNetwork` (public network); `VPCNetwork` (VPC). 
     * @return NetworkType Network type. Valid values: `PublicNetwork` (public network); `VPCNetwork` (VPC).
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type. Valid values: `PublicNetwork` (public network); `VPCNetwork` (VPC).
     * @param NetworkType Network type. Valid values: `PublicNetwork` (public network); `VPCNetwork` (VPC).
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get API server address 
     * @return ApiServerAddress API server address
     */
    public String getApiServerAddress() {
        return this.ApiServerAddress;
    }

    /**
     * Set API server address
     * @param ApiServerAddress API server address
     */
    public void setApiServerAddress(String ApiServerAddress) {
        this.ApiServerAddress = ApiServerAddress;
    }

    /**
     * Get Number of nodes 
     * @return NodeCount Number of nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes
     * @param NodeCount Number of nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Number of namespaces 
     * @return NamespaceCount Number of namespaces
     */
    public Long getNamespaceCount() {
        return this.NamespaceCount;
    }

    /**
     * Set Number of namespaces
     * @param NamespaceCount Number of namespaces
     */
    public void setNamespaceCount(Long NamespaceCount) {
        this.NamespaceCount = NamespaceCount;
    }

    /**
     * Get Number of workloads 
     * @return WorkloadCount Number of workloads
     */
    public Long getWorkloadCount() {
        return this.WorkloadCount;
    }

    /**
     * Set Number of workloads
     * @param WorkloadCount Number of workloads
     */
    public void setWorkloadCount(Long WorkloadCount) {
        this.WorkloadCount = WorkloadCount;
    }

    /**
     * Get Number of Pods 
     * @return PodCount Number of Pods
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set Number of Pods
     * @param PodCount Number of Pods
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get Number of Services 
     * @return ServiceCount Number of Services
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Number of Services
     * @param ServiceCount Number of Services
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Number of Ingresses 
     * @return IngressCount Number of Ingresses
     */
    public Long getIngressCount() {
        return this.IngressCount;
    }

    /**
     * Set Number of Ingresses
     * @param IngressCount Number of Ingresses
     */
    public void setIngressCount(Long IngressCount) {
        this.IngressCount = IngressCount;
    }

    /**
     * Get IPs of the primary nodes 
     * @return MasterIps IPs of the primary nodes
     */
    public String getMasterIps() {
        return this.MasterIps;
    }

    /**
     * Set IPs of the primary nodes
     * @param MasterIps IPs of the primary nodes
     */
    public void setMasterIps(String MasterIps) {
        this.MasterIps = MasterIps;
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

    public DescribeClusterDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDetailResponse(DescribeClusterDetailResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ScanTaskProgress != null) {
            this.ScanTaskProgress = new Long(source.ScanTaskProgress);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SeriousRiskCount != null) {
            this.SeriousRiskCount = new Long(source.SeriousRiskCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.MiddleRiskCount != null) {
            this.MiddleRiskCount = new Long(source.MiddleRiskCount);
        }
        if (source.HintRiskCount != null) {
            this.HintRiskCount = new Long(source.HintRiskCount);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.DefenderStatus != null) {
            this.DefenderStatus = new String(source.DefenderStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.ApiServerAddress != null) {
            this.ApiServerAddress = new String(source.ApiServerAddress);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NamespaceCount != null) {
            this.NamespaceCount = new Long(source.NamespaceCount);
        }
        if (source.WorkloadCount != null) {
            this.WorkloadCount = new Long(source.WorkloadCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.IngressCount != null) {
            this.IngressCount = new Long(source.IngressCount);
        }
        if (source.MasterIps != null) {
            this.MasterIps = new String(source.MasterIps);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ScanTaskProgress", this.ScanTaskProgress);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SeriousRiskCount", this.SeriousRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MiddleRiskCount", this.MiddleRiskCount);
        this.setParamSimple(map, prefix + "HintRiskCount", this.HintRiskCount);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "DefenderStatus", this.DefenderStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ApiServerAddress", this.ApiServerAddress);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "NamespaceCount", this.NamespaceCount);
        this.setParamSimple(map, prefix + "WorkloadCount", this.WorkloadCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "IngressCount", this.IngressCount);
        this.setParamSimple(map, prefix + "MasterIps", this.MasterIps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

