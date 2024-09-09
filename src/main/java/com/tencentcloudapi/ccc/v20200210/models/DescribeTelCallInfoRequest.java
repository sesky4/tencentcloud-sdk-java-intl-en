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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCallInfoRequest extends AbstractModel {

    /**
    * Start timestamp, Unix timestamp (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * End timestamp, Unix timestamp, the query time range is up to 90 days (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * Application ID list, when having multiple IDs, the returned value is the sum of all the IDs.
    */
    @SerializedName("SdkAppIdList")
    @Expose
    private Long [] SdkAppIdList;

    /**
     * Get Start timestamp, Unix timestamp (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp) 
     * @return StartTimeStamp Start timestamp, Unix timestamp (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set Start timestamp, Unix timestamp (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
     * @param StartTimeStamp Start timestamp, Unix timestamp (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get End timestamp, Unix timestamp, the query time range is up to 90 days (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp) 
     * @return EndTimeStamp End timestamp, Unix timestamp, the query time range is up to 90 days (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set End timestamp, Unix timestamp, the query time range is up to 90 days (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
     * @param EndTimeStamp End timestamp, Unix timestamp, the query time range is up to 90 days (query dimension supports only daily. For example, to query May 1st, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-01 23:59:59" timestamp. To query May 1st and May 2nd, pass startTime:"2023-05-01 00:00:00","endTime":"2023-05-02 23:59:59" timestamp)
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get Application ID list, when having multiple IDs, the returned value is the sum of all the IDs. 
     * @return SdkAppIdList Application ID list, when having multiple IDs, the returned value is the sum of all the IDs.
     */
    public Long [] getSdkAppIdList() {
        return this.SdkAppIdList;
    }

    /**
     * Set Application ID list, when having multiple IDs, the returned value is the sum of all the IDs.
     * @param SdkAppIdList Application ID list, when having multiple IDs, the returned value is the sum of all the IDs.
     */
    public void setSdkAppIdList(Long [] SdkAppIdList) {
        this.SdkAppIdList = SdkAppIdList;
    }

    public DescribeTelCallInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelCallInfoRequest(DescribeTelCallInfoRequest source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Long(source.EndTimeStamp);
        }
        if (source.SdkAppIdList != null) {
            this.SdkAppIdList = new Long[source.SdkAppIdList.length];
            for (int i = 0; i < source.SdkAppIdList.length; i++) {
                this.SdkAppIdList[i] = new Long(source.SdkAppIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamArraySimple(map, prefix + "SdkAppIdList.", this.SdkAppIdList);

    }
}

