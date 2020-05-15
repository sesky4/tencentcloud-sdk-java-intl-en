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

public class BillDataInfo extends AbstractModel{

    /**
    * Time point in the format of yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Bandwidth in Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * Traffic in MB.
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 
    */
    @SerializedName("PeakTime")
    @Expose
    private String PeakTime;

    /**
     * Get Time point in the format of yyyy-mm-dd HH:MM:SS. 
     * @return Time Time point in the format of yyyy-mm-dd HH:MM:SS.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time point in the format of yyyy-mm-dd HH:MM:SS.
     * @param Time Time point in the format of yyyy-mm-dd HH:MM:SS.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Bandwidth in Mbps. 
     * @return Bandwidth Bandwidth in Mbps.
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth in Mbps.
     * @param Bandwidth Bandwidth in Mbps.
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Traffic in MB. 
     * @return Flux Traffic in MB.
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set Traffic in MB.
     * @param Flux Traffic in MB.
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get  
     * @return PeakTime 
     */
    public String getPeakTime() {
        return this.PeakTime;
    }

    /**
     * Set 
     * @param PeakTime 
     */
    public void setPeakTime(String PeakTime) {
        this.PeakTime = PeakTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "PeakTime", this.PeakTime);

    }
}

