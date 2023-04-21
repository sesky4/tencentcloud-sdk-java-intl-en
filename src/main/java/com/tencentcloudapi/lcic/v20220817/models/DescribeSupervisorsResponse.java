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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupervisorsResponse extends AbstractModel{

    /**
    * The total number of spectators.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The current page number.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The number of records on the current page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * A list of the spectators.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of spectators. 
     * @return Total The total number of spectators.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of spectators.
     * @param Total The total number of spectators.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The current page number. 
     * @return Page The current page number.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The current page number.
     * @param Page The current page number.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The number of records on the current page. 
     * @return Limit The number of records on the current page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records on the current page.
     * @param Limit The number of records on the current page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get A list of the spectators. 
     * @return UserIds A list of the spectators.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set A list of the spectators.
     * @param UserIds A list of the spectators.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
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

    public DescribeSupervisorsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupervisorsResponse(DescribeSupervisorsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

