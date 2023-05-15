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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUnusualEventResponse extends AbstractModel{

    /**
    * The number of records returned.
Value range: 0-20.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The information of the abnormal user experiences.
    */
    @SerializedName("AbnormalExperienceList")
    @Expose
    private AbnormalExperience [] AbnormalExperienceList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of records returned.
Value range: 0-20. 
     * @return Total The number of records returned.
Value range: 0-20.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The number of records returned.
Value range: 0-20.
     * @param Total The number of records returned.
Value range: 0-20.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The information of the abnormal user experiences. 
     * @return AbnormalExperienceList The information of the abnormal user experiences.
     */
    public AbnormalExperience [] getAbnormalExperienceList() {
        return this.AbnormalExperienceList;
    }

    /**
     * Set The information of the abnormal user experiences.
     * @param AbnormalExperienceList The information of the abnormal user experiences.
     */
    public void setAbnormalExperienceList(AbnormalExperience [] AbnormalExperienceList) {
        this.AbnormalExperienceList = AbnormalExperienceList;
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

    public DescribeUnusualEventResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnusualEventResponse(DescribeUnusualEventResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AbnormalExperienceList != null) {
            this.AbnormalExperienceList = new AbnormalExperience[source.AbnormalExperienceList.length];
            for (int i = 0; i < source.AbnormalExperienceList.length; i++) {
                this.AbnormalExperienceList[i] = new AbnormalExperience(source.AbnormalExperienceList[i]);
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
        this.setParamArrayObj(map, prefix + "AbnormalExperienceList.", this.AbnormalExperienceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

