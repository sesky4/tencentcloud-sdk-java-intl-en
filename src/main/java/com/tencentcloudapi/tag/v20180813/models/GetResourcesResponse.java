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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourcesResponse extends AbstractModel{

    /**
    * Token value obtained for the next page
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * List of resources and their associated tags (key-value pairs)
    */
    @SerializedName("ResourceTagMappingList")
    @Expose
    private ResourceTagMapping [] ResourceTagMappingList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Token value obtained for the next page 
     * @return PaginationToken Token value obtained for the next page
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set Token value obtained for the next page
     * @param PaginationToken Token value obtained for the next page
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get List of resources and their associated tags (key-value pairs) 
     * @return ResourceTagMappingList List of resources and their associated tags (key-value pairs)
     */
    public ResourceTagMapping [] getResourceTagMappingList() {
        return this.ResourceTagMappingList;
    }

    /**
     * Set List of resources and their associated tags (key-value pairs)
     * @param ResourceTagMappingList List of resources and their associated tags (key-value pairs)
     */
    public void setResourceTagMappingList(ResourceTagMapping [] ResourceTagMappingList) {
        this.ResourceTagMappingList = ResourceTagMappingList;
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

    public GetResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourcesResponse(GetResourcesResponse source) {
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.ResourceTagMappingList != null) {
            this.ResourceTagMappingList = new ResourceTagMapping[source.ResourceTagMappingList.length];
            for (int i = 0; i < source.ResourceTagMappingList.length; i++) {
                this.ResourceTagMappingList[i] = new ResourceTagMapping(source.ResourceTagMappingList[i]);
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
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamArrayObj(map, prefix + "ResourceTagMappingList.", this.ResourceTagMappingList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

