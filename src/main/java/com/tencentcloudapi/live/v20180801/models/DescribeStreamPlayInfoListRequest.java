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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPlayInfoListRequest extends AbstractModel{

    /**
    * Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The start time and end time cannot be more than 24 hours apart and must be within the past month.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Playback domain name,
If this parameter is left empty, data of live streams of all playback domain names will be queried.
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * Stream name (exact match).
If this parameter is left empty, full playback data will be queried.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Push address. Its value is the same as the `AppName` in playback address. It supports exact match, and takes effect only when `StreamName` is passed at the same time.
If it is left empty, the full playback data will be queried.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS 
     * @return StartTime Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS
     * @param StartTime Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The start time and end time cannot be more than 24 hours apart and must be within the past month. 
     * @return EndTime The end time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The start time and end time cannot be more than 24 hours apart and must be within the past month.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The start time and end time cannot be more than 24 hours apart and must be within the past month.
     * @param EndTime The end time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The start time and end time cannot be more than 24 hours apart and must be within the past month.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Playback domain name,
If this parameter is left empty, data of live streams of all playback domain names will be queried. 
     * @return PlayDomain Playback domain name,
If this parameter is left empty, data of live streams of all playback domain names will be queried.
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set Playback domain name,
If this parameter is left empty, data of live streams of all playback domain names will be queried.
     * @param PlayDomain Playback domain name,
If this parameter is left empty, data of live streams of all playback domain names will be queried.
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get Stream name (exact match).
If this parameter is left empty, full playback data will be queried. 
     * @return StreamName Stream name (exact match).
If this parameter is left empty, full playback data will be queried.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name (exact match).
If this parameter is left empty, full playback data will be queried.
     * @param StreamName Stream name (exact match).
If this parameter is left empty, full playback data will be queried.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Push address. Its value is the same as the `AppName` in playback address. It supports exact match, and takes effect only when `StreamName` is passed at the same time.
If it is left empty, the full playback data will be queried.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect. 
     * @return AppName Push address. Its value is the same as the `AppName` in playback address. It supports exact match, and takes effect only when `StreamName` is passed at the same time.
If it is left empty, the full playback data will be queried.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push address. Its value is the same as the `AppName` in playback address. It supports exact match, and takes effect only when `StreamName` is passed at the same time.
If it is left empty, the full playback data will be queried.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect.
     * @param AppName Push address. Its value is the same as the `AppName` in playback address. It supports exact match, and takes effect only when `StreamName` is passed at the same time.
If it is left empty, the full playback data will be queried.
Note: to query by `AppName`, you need to submit a ticket first. After your application succeeds, it will take about 5 business days (subject to the time in the reply) for the configuration to take effect.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried. 
     * @return ServiceName Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
     * @param ServiceName Service name. Valid values: LVB, LEB. If this parameter is left empty, all data of LVB and LEB will be queried.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public DescribeStreamPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPlayInfoListRequest(DescribeStreamPlayInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

