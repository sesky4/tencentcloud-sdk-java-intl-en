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
package com.tencentcloudapi.tke.v20180525;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tke.v20180525.models.*;

public class TkeClient extends AbstractClient{
    private static String endpoint = "tke.tencentcloudapi.com";
    private static String service = "tke";
    private static String version = "2018-05-25";

    public TkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkeClient(Credential credential, String region, ClientProfile profile) {
        super(TkeClient.endpoint, TkeClient.version, credential, region, profile);
    }

    /**
     *This API can be called to acquire the ClusterRole tke:admin. By setting a CAM policy, you can grant permission of this API to a sub-account that has higher permission in CAM. In this way, this sub-account can call this API directly to acquire the admin role of a Kubernetes cluster.
     * @param req AcquireClusterAdminRoleRequest
     * @return AcquireClusterAdminRoleResponse
     * @throws TencentCloudSDKException
     */
    public AcquireClusterAdminRoleResponse AcquireClusterAdminRole(AcquireClusterAdminRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcquireClusterAdminRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcquireClusterAdminRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcquireClusterAdminRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add one or more existing instances to a cluster.
     * @param req AddExistedInstancesRequest
     * @return AddExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddExistedInstancesResponse AddExistedInstances(AddExistedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddExistedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddExistedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddExistedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to move nodes in a cluster to a node pool.
     * @param req AddNodeToNodePoolRequest
     * @return AddNodeToNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeToNodePoolResponse AddNodeToNodePool(AddNodeToNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddNodeToNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddNodeToNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddNodeToNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add subnets in the container network for a VPC-CNI cluster.
     * @param req AddVpcCniSubnetsRequest
     * @return AddVpcCniSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AddVpcCniSubnetsResponse AddVpcCniSubnets(AddVpcCniSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddVpcCniSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddVpcCniSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddVpcCniSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to check if the CIDR block of a TKE Edge cluster conflicts with other CIDR blocks.
     * @param req CheckEdgeClusterCIDRRequest
     * @return CheckEdgeClusterCIDRResponse
     * @throws TencentCloudSDKException
     */
    public CheckEdgeClusterCIDRResponse CheckEdgeClusterCIDR(CheckEdgeClusterCIDRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckEdgeClusterCIDRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckEdgeClusterCIDRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckEdgeClusterCIDR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query nodes eligible for an upgrade in the given node list.
     * @param req CheckInstancesUpgradeAbleRequest
     * @return CheckInstancesUpgradeAbleResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstancesUpgradeAbleResponse CheckInstancesUpgradeAble(CheckInstancesUpgradeAbleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckInstancesUpgradeAbleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckInstancesUpgradeAbleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckInstancesUpgradeAble");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a cluster.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a cluster access endpoint.
     * @param req CreateClusterEndpointRequest
     * @return CreateClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointResponse CreateClusterEndpoint(CreateClusterEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterEndpointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Create an external network access port for the managed cluster (the old way, only the external network port for the managed cluster is supported)
     * @param req CreateClusterEndpointVipRequest
     * @return CreateClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointVipResponse CreateClusterEndpointVip(CreateClusterEndpointVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterEndpointVipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterEndpointVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterEndpointVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more nodes in a cluster.
     * @param req CreateClusterInstancesRequest
     * @return CreateClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterInstancesResponse CreateClusterInstances(CreateClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a node pool.
     * @param req CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodePoolResponse CreateClusterNodePool(CreateClusterNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a cluster route table.
     * @param req CreateClusterRouteTableRequest
     * @return CreateClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterRouteTableResponse CreateClusterRouteTable(CreateClusterRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a virtual node.
     * @param req CreateClusterVirtualNodeRequest
     * @return CreateClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterVirtualNodeResponse CreateClusterVirtualNode(CreateClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterVirtualNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterVirtualNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterVirtualNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a virtual node pool.
     * @param req CreateClusterVirtualNodePoolRequest
     * @return CreateClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterVirtualNodePoolResponse CreateClusterVirtualNodePool(CreateClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterVirtualNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterVirtualNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterVirtualNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an ECM instance.
     * @param req CreateECMInstancesRequest
     * @return CreateECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateECMInstancesResponse CreateECMInstances(CreateECMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateECMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateECMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateECMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create CVM instances in the specified TKE edge cluster.
     * @param req CreateEdgeCVMInstancesRequest
     * @return CreateEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeCVMInstancesResponse CreateEdgeCVMInstances(CreateEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeCVMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeCVMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeCVMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create log collection configuration for a TKE Edge cluster.
     * @param req CreateEdgeLogConfigRequest
     * @return CreateEdgeLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeLogConfigResponse CreateEdgeLogConfig(CreateEdgeLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeLogConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an alarm rule.
     * @param req CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertRuleResponse CreatePrometheusAlertRule(CreatePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a TKE Edge cluster.
     * @param req CreateTKEEdgeClusterRequest
     * @return CreateTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateTKEEdgeClusterResponse CreateTKEEdgeCluster(CreateTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTKEEdgeClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTKEEdgeClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTKEEdgeCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a cluster. (Cloud API v3).
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Delete a cluster scaling group
     * @param req DeleteClusterAsGroupsRequest
     * @return DeleteClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterAsGroupsResponse DeleteClusterAsGroups(DeleteClusterAsGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterAsGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterAsGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterAsGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a cluster access endpoint.
     * @param req DeleteClusterEndpointRequest
     * @return DeleteClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointResponse DeleteClusterEndpoint(DeleteClusterEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterEndpointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Delete the external network access port of the managed cluster (the old way, only the external network port of the managed cluster is supported)
     * @param req DeleteClusterEndpointVipRequest
     * @return DeleteClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointVipResponse DeleteClusterEndpointVip(DeleteClusterEndpointVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterEndpointVipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterEndpointVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterEndpointVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more nodes from a cluster.
     * @param req DeleteClusterInstancesRequest
     * @return DeleteClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterInstancesResponse DeleteClusterInstances(DeleteClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a node pool.
     * @param req DeleteClusterNodePoolRequest
     * @return DeleteClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterNodePoolResponse DeleteClusterNodePool(DeleteClusterNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a cluster route.
     * @param req DeleteClusterRouteRequest
     * @return DeleteClusterRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteResponse DeleteClusterRoute(DeleteClusterRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete cluster a route table.
     * @param req DeleteClusterRouteTableRequest
     * @return DeleteClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteTableResponse DeleteClusterRouteTable(DeleteClusterRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a virtual node.
     * @param req DeleteClusterVirtualNodeRequest
     * @return DeleteClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterVirtualNodeResponse DeleteClusterVirtualNode(DeleteClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterVirtualNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterVirtualNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterVirtualNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a virtual node pool.
     * @param req DeleteClusterVirtualNodePoolRequest
     * @return DeleteClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterVirtualNodePoolResponse DeleteClusterVirtualNodePool(DeleteClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterVirtualNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterVirtualNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterVirtualNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more ECM instances.
     * @param req DeleteECMInstancesRequest
     * @return DeleteECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteECMInstancesResponse DeleteECMInstances(DeleteECMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteECMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteECMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteECMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more edge CVM instances.
     * @param req DeleteEdgeCVMInstancesRequest
     * @return DeleteEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeCVMInstancesResponse DeleteEdgeCVMInstances(DeleteEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeCVMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeCVMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeCVMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete one or more edge compute instances.
     * @param req DeleteEdgeClusterInstancesRequest
     * @return DeleteEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeClusterInstancesResponse DeleteEdgeClusterInstances(DeleteEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alarm rule.
     * @param req DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertRuleResponse DeletePrometheusAlertRule(DeletePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a TKE Edge cluster.
     * @param req DeleteTKEEdgeClusterRequest
     * @return DeleteTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTKEEdgeClusterResponse DeleteTKEEdgeCluster(DeleteTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTKEEdgeClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTKEEdgeClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTKEEdgeCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain all versions that the cluster can upgrade to.
     * @param req DescribeAvailableClusterVersionRequest
     * @return DescribeAvailableClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableClusterVersionResponse DescribeAvailableClusterVersion(DescribeAvailableClusterVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableClusterVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableClusterVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableClusterVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to check the edge component versions and K8s versions supported by TKE Edge.
     * @param req DescribeAvailableTKEEdgeVersionRequest
     * @return DescribeAvailableTKEEdgeVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableTKEEdgeVersionResponse DescribeAvailableTKEEdgeVersion(DescribeAvailableTKEEdgeVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableTKEEdgeVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableTKEEdgeVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableTKEEdgeVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Cluster auto scaling configuration
     * @param req DescribeClusterAsGroupOptionRequest
     * @return DescribeClusterAsGroupOptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupOptionResponse DescribeClusterAsGroupOption(DescribeClusterAsGroupOptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAsGroupOptionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAsGroupOptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAsGroupOption");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Cluster-associated scaling group list
     * @param req DescribeClusterAsGroupsRequest
     * @return DescribeClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupsResponse DescribeClusterAsGroups(DescribeClusterAsGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAsGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAsGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAsGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query cluster authentication configuration.
     * @param req DescribeClusterAuthenticationOptionsRequest
     * @return DescribeClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAuthenticationOptionsResponse DescribeClusterAuthenticationOptions(DescribeClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAuthenticationOptionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAuthenticationOptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAuthenticationOptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the CommonName from the kube-apiserver client certificate that corresponding to the sub-account in RBAC authorization mode. 
     * @param req DescribeClusterCommonNamesRequest
     * @return DescribeClusterCommonNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterCommonNamesResponse DescribeClusterCommonNames(DescribeClusterCommonNamesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterCommonNamesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterCommonNamesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterCommonNames");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Query cluster access port status (intranet / extranet access is enabled for independent clusters, and intranet access is supported for managed clusters)
     * @param req DescribeClusterEndpointStatusRequest
     * @return DescribeClusterEndpointStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointStatusResponse DescribeClusterEndpointStatus(DescribeClusterEndpointStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterEndpointStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterEndpointStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterEndpointStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Query cluster open port process status (only supports external ports of the managed cluster)
     * @param req DescribeClusterEndpointVipStatusRequest
     * @return DescribeClusterEndpointVipStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointVipStatusResponse DescribeClusterEndpointVipStatus(DescribeClusterEndpointVipStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterEndpointVipStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterEndpointVipStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterEndpointVipStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query cluster access addresses, including private network address, public network address, public network domain name, and security policy for public network access.
     * @param req DescribeClusterEndpointsRequest
     * @return DescribeClusterEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointsResponse DescribeClusterEndpoints(DescribeClusterEndpointsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterEndpointsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterEndpointsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterEndpoints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query information of node instances in a cluster.
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the cluster kubeconfig file. Different sub-accounts have their own kubeconfig files. The kubeconfig file contains the kube-apiserver client certificate of the corresponding sub-account. By default, the client certificate is created when this API is called for the first time, and the certificate is valid for 20 years with no permissions granted. For the cluster owner or primary account, the cluster-admin permission is granted by default.
     * @param req DescribeClusterKubeconfigRequest
     * @return DescribeClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterKubeconfigResponse DescribeClusterKubeconfig(DescribeClusterKubeconfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterKubeconfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterKubeconfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterKubeconfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the cluster model.
     * @param req DescribeClusterLevelAttributeRequest
     * @return DescribeClusterLevelAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelAttributeResponse DescribeClusterLevelAttribute(DescribeClusterLevelAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterLevelAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterLevelAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterLevelAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the cluster model adjustment history.
     * @param req DescribeClusterLevelChangeRecordsRequest
     * @return DescribeClusterLevelChangeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelChangeRecordsResponse DescribeClusterLevelChangeRecords(DescribeClusterLevelChangeRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterLevelChangeRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterLevelChangeRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterLevelChangeRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query detailed information of a node pool.
     * @param req DescribeClusterNodePoolDetailRequest
     * @return DescribeClusterNodePoolDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolDetailResponse DescribeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterNodePoolDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterNodePoolDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterNodePoolDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the node pool list
     * @param req DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolsResponse DescribeClusterNodePools(DescribeClusterNodePoolsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterNodePoolsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterNodePoolsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterNodePools");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query one or more cluster route tables.
     * @param req DescribeClusterRouteTablesRequest
     * @return DescribeClusterRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRouteTablesResponse DescribeClusterRouteTables(DescribeClusterRouteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterRouteTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterRouteTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterRouteTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query cluster routes.
     * @param req DescribeClusterRoutesRequest
     * @return DescribeClusterRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRoutesResponse DescribeClusterRoutes(DescribeClusterRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the key information of a cluster.
     * @param req DescribeClusterSecurityRequest
     * @return DescribeClusterSecurityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSecurityResponse DescribeClusterSecurity(DescribeClusterSecurityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterSecurityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterSecurityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterSecurity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of clusters under the current account.
     * @param req DescribeClusterStatusRequest
     * @return DescribeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterStatusResponse DescribeClusterStatus(DescribeClusterStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of virtual nodes.
     * @param req DescribeClusterVirtualNodeRequest
     * @return DescribeClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterVirtualNodeResponse DescribeClusterVirtualNode(DescribeClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterVirtualNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterVirtualNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterVirtualNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of virtual node pools.
     * @param req DescribeClusterVirtualNodePoolsRequest
     * @return DescribeClusterVirtualNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterVirtualNodePoolsResponse DescribeClusterVirtualNodePools(DescribeClusterVirtualNodePoolsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterVirtualNodePoolsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterVirtualNodePoolsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterVirtualNodePools");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query clusters list.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the ECM instance information.
     * @param req DescribeECMInstancesRequest
     * @return DescribeECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeECMInstancesResponse DescribeECMInstances(DescribeECMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeECMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeECMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeECMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the custom parameters available for an edge cluster.
     * @param req DescribeEdgeAvailableExtraArgsRequest
     * @return DescribeEdgeAvailableExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAvailableExtraArgsResponse DescribeEdgeAvailableExtraArgs(DescribeEdgeAvailableExtraArgsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeAvailableExtraArgsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeAvailableExtraArgsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeAvailableExtraArgs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the edge CVM instance information.
     * @param req DescribeEdgeCVMInstancesRequest
     * @return DescribeEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeCVMInstancesResponse DescribeEdgeCVMInstances(DescribeEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeCVMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeCVMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeCVMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query custom parameters of an edge cluster.
     * @param req DescribeEdgeClusterExtraArgsRequest
     * @return DescribeEdgeClusterExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterExtraArgsResponse DescribeEdgeClusterExtraArgs(DescribeEdgeClusterExtraArgsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeClusterExtraArgsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeClusterExtraArgsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeClusterExtraArgs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the TKE Edge cluster node information.
     * @param req DescribeEdgeClusterInstancesRequest
     * @return DescribeEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterInstancesResponse DescribeEdgeClusterInstances(DescribeEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the upgrade information of an edge cluster, including the upgradeable components, the current upgrade status, and errors occur during the upgrade.
     * @param req DescribeEdgeClusterUpgradeInfoRequest
     * @return DescribeEdgeClusterUpgradeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterUpgradeInfoResponse DescribeEdgeClusterUpgradeInfo(DescribeEdgeClusterUpgradeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeClusterUpgradeInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeClusterUpgradeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeClusterUpgradeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status of events, audits and logs.
     * @param req DescribeEdgeLogSwitchesRequest
     * @return DescribeEdgeLogSwitchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeLogSwitchesResponse DescribeEdgeLogSwitches(DescribeEdgeLogSwitchesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeLogSwitchesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeLogSwitchesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeLogSwitches");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the task progress of enabling VPC-CNI mode.
     * @param req DescribeEnableVpcCniProgressRequest
     * @return DescribeEnableVpcCniProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnableVpcCniProgressResponse DescribeEnableVpcCniProgress(DescribeEnableVpcCniProgressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnableVpcCniProgressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnableVpcCniProgressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnableVpcCniProgress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query one or more existing node and determine whether they can be added to a cluster.
     * @param req DescribeExistedInstancesRequest
     * @return DescribeExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExistedInstancesResponse DescribeExistedInstances(DescribeExistedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExistedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExistedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExistedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get image information.
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the instance details.
     * @param req DescribePrometheusInstanceRequest
     * @return DescribePrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceResponse DescribePrometheusInstance(DescribePrometheusInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain all regions supported by TKE.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the cluster resource usage.
     * @param req DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageResponse DescribeResourceUsage(DescribeResourceUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of route table conflicts.
     * @param req DescribeRouteTableConflictsRequest
     * @return DescribeRouteTableConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTableConflictsResponse DescribeRouteTableConflicts(DescribeRouteTableConflictsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteTableConflictsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteTableConflictsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRouteTableConflicts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the authentication information of a TKE Edge cluster.
     * @param req DescribeTKEEdgeClusterCredentialRequest
     * @return DescribeTKEEdgeClusterCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterCredentialResponse DescribeTKEEdgeClusterCredential(DescribeTKEEdgeClusterCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeClusterCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeClusterCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeClusterCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the current status and process information of a TKE Edge cluster.
     * @param req DescribeTKEEdgeClusterStatusRequest
     * @return DescribeTKEEdgeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterStatusResponse DescribeTKEEdgeClusterStatus(DescribeTKEEdgeClusterStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeClusterStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeClusterStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeClusterStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of TKE Edge clusters.
     * @param req DescribeTKEEdgeClustersRequest
     * @return DescribeTKEEdgeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClustersResponse DescribeTKEEdgeClusters(DescribeTKEEdgeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the kubeconfig for access to a TKE Edge cluster through the public network.
     * @param req DescribeTKEEdgeExternalKubeconfigRequest
     * @return DescribeTKEEdgeExternalKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeExternalKubeconfigResponse DescribeTKEEdgeExternalKubeconfig(DescribeTKEEdgeExternalKubeconfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeExternalKubeconfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeExternalKubeconfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeExternalKubeconfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the URL of TKE edge script. You can add external nodes to a TKE Edge cluster by downloading the URL.
     * @param req DescribeTKEEdgeScriptRequest
     * @return DescribeTKEEdgeScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeScriptResponse DescribeTKEEdgeScript(DescribeTKEEdgeScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query cluster version information.
     * @param req DescribeVersionsRequest
     * @return DescribeVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionsResponse DescribeVersions(DescribeVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the maximum number of Pods in the VPC-CNI network mode supported by the models in the specified availability zone of the current user and region.
     * @param req DescribeVpcCniPodLimitsRequest
     * @return DescribeVpcCniPodLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcCniPodLimitsResponse DescribeVpcCniPodLimits(DescribeVpcCniPodLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcCniPodLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcCniPodLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcCniPodLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable cluster deletion protection.
     * @param req DisableClusterDeletionProtectionRequest
     * @return DisableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterDeletionProtectionResponse DisableClusterDeletionProtection(DisableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableClusterDeletionProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableClusterDeletionProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableClusterDeletionProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to drain a virtual node.
     * @param req DrainClusterVirtualNodeRequest
     * @return DrainClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DrainClusterVirtualNodeResponse DrainClusterVirtualNode(DrainClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DrainClusterVirtualNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DrainClusterVirtualNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DrainClusterVirtualNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable cluster deletion protection.
     * @param req EnableClusterDeletionProtectionRequest
     * @return EnableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterDeletionProtectionResponse EnableClusterDeletionProtection(EnableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableClusterDeletionProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableClusterDeletionProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableClusterDeletionProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the VPC-CNI network mode for GR clusters.
     * @param req EnableVpcCniNetworkTypeRequest
     * @return EnableVpcCniNetworkTypeResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpcCniNetworkTypeResponse EnableVpcCniNetworkType(EnableVpcCniNetworkTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableVpcCniNetworkTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableVpcCniNetworkTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableVpcCniNetworkType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to work with the add-ons of a TKE Edge cluster.
     * @param req ForwardTKEEdgeApplicationRequestV3Request
     * @return ForwardTKEEdgeApplicationRequestV3Response
     * @throws TencentCloudSDKException
     */
    public ForwardTKEEdgeApplicationRequestV3Response ForwardTKEEdgeApplicationRequestV3(ForwardTKEEdgeApplicationRequestV3Request req) throws TencentCloudSDKException{
        JsonResponseModel<ForwardTKEEdgeApplicationRequestV3Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ForwardTKEEdgeApplicationRequestV3Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForwardTKEEdgeApplicationRequestV3");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Obtaining the price of specified cluster model
     * @param req GetClusterLevelPriceRequest
     * @return GetClusterLevelPriceResponse
     * @throws TencentCloudSDKException
     */
    public GetClusterLevelPriceResponse GetClusterLevelPrice(GetClusterLevelPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetClusterLevelPriceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetClusterLevelPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetClusterLevelPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the current progress of the node upgrade.
     * @param req GetUpgradeInstanceProgressRequest
     * @return GetUpgradeInstanceProgressResponse
     * @throws TencentCloudSDKException
     */
    public GetUpgradeInstanceProgressResponse GetUpgradeInstanceProgress(GetUpgradeInstanceProgressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUpgradeInstanceProgressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUpgradeInstanceProgressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUpgradeInstanceProgress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to install the log collection add-on on TKE Edge cluster nodes.
     * @param req InstallEdgeLogAgentRequest
     * @return InstallEdgeLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallEdgeLogAgentResponse InstallEdgeLogAgent(InstallEdgeLogAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstallEdgeLogAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InstallEdgeLogAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InstallEdgeLogAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Modify cluster scaling group attributes
     * @param req ModifyClusterAsGroupAttributeRequest
     * @return ModifyClusterAsGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupAttributeResponse ModifyClusterAsGroupAttribute(ModifyClusterAsGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAsGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAsGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAsGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify cluster auto scaling attributes.
     * @param req ModifyClusterAsGroupOptionAttributeRequest
     * @return ModifyClusterAsGroupOptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupOptionAttributeResponse ModifyClusterAsGroupOptionAttribute(ModifyClusterAsGroupOptionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAsGroupOptionAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAsGroupOptionAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAsGroupOptionAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify cluster attributes.
     * @param req ModifyClusterAttributeRequest
     * @return ModifyClusterAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAttributeResponse ModifyClusterAttribute(ModifyClusterAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify cluster authentication configuration.
     * @param req ModifyClusterAuthenticationOptionsRequest
     * @return ModifyClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAuthenticationOptionsResponse ModifyClusterAuthenticationOptions(ModifyClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAuthenticationOptionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAuthenticationOptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAuthenticationOptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Modify the security policy of the external port of the managed cluster (the old way, only the external port of the managed cluster is supported)
     * @param req ModifyClusterEndpointSPRequest
     * @return ModifyClusterEndpointSPResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterEndpointSPResponse ModifyClusterEndpointSP(ModifyClusterEndpointSPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterEndpointSPResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterEndpointSPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterEndpointSP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to edit a node pool.
     * @param req ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNodePoolResponse ModifyClusterNodePool(ModifyClusterNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a virtual node pool.
     * @param req ModifyClusterVirtualNodePoolRequest
     * @return ModifyClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterVirtualNodePoolResponse ModifyClusterVirtualNodePool(ModifyClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterVirtualNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterVirtualNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterVirtualNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the model of instances in a node pool.
     * @param req ModifyNodePoolInstanceTypesRequest
     * @return ModifyNodePoolInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolInstanceTypesResponse ModifyNodePoolInstanceTypes(ModifyNodePoolInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNodePoolInstanceTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNodePoolInstanceTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNodePoolInstanceTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an alert rule.
     * @param req ModifyPrometheusAlertRuleRequest
     * @return ModifyPrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertRuleResponse ModifyPrometheusAlertRule(ModifyPrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a node from a node pool but retain it in the cluster.
     * @param req RemoveNodeFromNodePoolRequest
     * @return RemoveNodeFromNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public RemoveNodeFromNodePoolResponse RemoveNodeFromNodePool(RemoveNodeFromNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveNodeFromNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveNodeFromNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveNodeFromNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable removal protection for the nodes automatically created by the scaling group in a node pool.
     * @param req SetNodePoolNodeProtectionRequest
     * @return SetNodePoolNodeProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetNodePoolNodeProtectionResponse SetNodePoolNodeProtection(SetNodePoolNodeProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetNodePoolNodeProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetNodePoolNodeProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetNodePoolNodeProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to uninstall the log collection add-on from TKE Edge cluster nodes.
     * @param req UninstallEdgeLogAgentRequest
     * @return UninstallEdgeLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallEdgeLogAgentResponse UninstallEdgeLogAgent(UninstallEdgeLogAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UninstallEdgeLogAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UninstallEdgeLogAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UninstallEdgeLogAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade the master component of the cluster to the specified version.
     * @param req UpdateClusterVersionRequest
     * @return UpdateClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterVersionResponse UpdateClusterVersion(UpdateClusterVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateClusterVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateClusterVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateClusterVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade an edge cluster component to a TKE Edge version.
     * @param req UpdateEdgeClusterVersionRequest
     * @return UpdateEdgeClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEdgeClusterVersionResponse UpdateEdgeClusterVersion(UpdateEdgeClusterVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEdgeClusterVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEdgeClusterVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEdgeClusterVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade work nodes in a cluster.
     * @param req UpgradeClusterInstancesRequest
     * @return UpgradeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterInstancesResponse UpgradeClusterInstances(UpgradeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
