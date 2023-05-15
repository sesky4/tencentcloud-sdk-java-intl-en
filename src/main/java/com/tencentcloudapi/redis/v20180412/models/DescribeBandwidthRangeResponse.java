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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthRangeResponse extends AbstractModel{

    /**
    * Standard bandwidth, which is the bandwidth allocated by the system to each node when an instance is purchased.
    */
    @SerializedName("BaseBandwidth")
    @Expose
    private Long BaseBandwidth;

    /**
    * The additional bandwidth of the instance. If the standard bandwidth does not meet your needs, you can increase the bandwidth on your own. <ul><li>If read-only replica is enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity * Max ([read-only replica quantity, 1]). The shard quantity in the standard architecture is 1. </li><li>If read-only replica is not enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity. The shard quantity in the standard architecture is 1.</li></ul>
    */
    @SerializedName("AddBandwidth")
    @Expose
    private Long AddBandwidth;

    /**
    * The lower limit for additional bandwidth
    */
    @SerializedName("MinAddBandwidth")
    @Expose
    private Long MinAddBandwidth;

    /**
    * The upper limit for additional bandwidth
    */
    @SerializedName("MaxAddBandwidth")
    @Expose
    private Long MaxAddBandwidth;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Standard bandwidth, which is the bandwidth allocated by the system to each node when an instance is purchased. 
     * @return BaseBandwidth Standard bandwidth, which is the bandwidth allocated by the system to each node when an instance is purchased.
     */
    public Long getBaseBandwidth() {
        return this.BaseBandwidth;
    }

    /**
     * Set Standard bandwidth, which is the bandwidth allocated by the system to each node when an instance is purchased.
     * @param BaseBandwidth Standard bandwidth, which is the bandwidth allocated by the system to each node when an instance is purchased.
     */
    public void setBaseBandwidth(Long BaseBandwidth) {
        this.BaseBandwidth = BaseBandwidth;
    }

    /**
     * Get The additional bandwidth of the instance. If the standard bandwidth does not meet your needs, you can increase the bandwidth on your own. <ul><li>If read-only replica is enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity * Max ([read-only replica quantity, 1]). The shard quantity in the standard architecture is 1. </li><li>If read-only replica is not enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity. The shard quantity in the standard architecture is 1.</li></ul> 
     * @return AddBandwidth The additional bandwidth of the instance. If the standard bandwidth does not meet your needs, you can increase the bandwidth on your own. <ul><li>If read-only replica is enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity * Max ([read-only replica quantity, 1]). The shard quantity in the standard architecture is 1. </li><li>If read-only replica is not enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity. The shard quantity in the standard architecture is 1.</li></ul>
     */
    public Long getAddBandwidth() {
        return this.AddBandwidth;
    }

    /**
     * Set The additional bandwidth of the instance. If the standard bandwidth does not meet your needs, you can increase the bandwidth on your own. <ul><li>If read-only replica is enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity * Max ([read-only replica quantity, 1]). The shard quantity in the standard architecture is 1. </li><li>If read-only replica is not enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity. The shard quantity in the standard architecture is 1.</li></ul>
     * @param AddBandwidth The additional bandwidth of the instance. If the standard bandwidth does not meet your needs, you can increase the bandwidth on your own. <ul><li>If read-only replica is enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity * Max ([read-only replica quantity, 1]). The shard quantity in the standard architecture is 1. </li><li>If read-only replica is not enabled, the total instance bandwidth = additional bandwidth * shard quantity + standard bandwidth * shard quantity. The shard quantity in the standard architecture is 1.</li></ul>
     */
    public void setAddBandwidth(Long AddBandwidth) {
        this.AddBandwidth = AddBandwidth;
    }

    /**
     * Get The lower limit for additional bandwidth 
     * @return MinAddBandwidth The lower limit for additional bandwidth
     */
    public Long getMinAddBandwidth() {
        return this.MinAddBandwidth;
    }

    /**
     * Set The lower limit for additional bandwidth
     * @param MinAddBandwidth The lower limit for additional bandwidth
     */
    public void setMinAddBandwidth(Long MinAddBandwidth) {
        this.MinAddBandwidth = MinAddBandwidth;
    }

    /**
     * Get The upper limit for additional bandwidth 
     * @return MaxAddBandwidth The upper limit for additional bandwidth
     */
    public Long getMaxAddBandwidth() {
        return this.MaxAddBandwidth;
    }

    /**
     * Set The upper limit for additional bandwidth
     * @param MaxAddBandwidth The upper limit for additional bandwidth
     */
    public void setMaxAddBandwidth(Long MaxAddBandwidth) {
        this.MaxAddBandwidth = MaxAddBandwidth;
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

    public DescribeBandwidthRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBandwidthRangeResponse(DescribeBandwidthRangeResponse source) {
        if (source.BaseBandwidth != null) {
            this.BaseBandwidth = new Long(source.BaseBandwidth);
        }
        if (source.AddBandwidth != null) {
            this.AddBandwidth = new Long(source.AddBandwidth);
        }
        if (source.MinAddBandwidth != null) {
            this.MinAddBandwidth = new Long(source.MinAddBandwidth);
        }
        if (source.MaxAddBandwidth != null) {
            this.MaxAddBandwidth = new Long(source.MaxAddBandwidth);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaseBandwidth", this.BaseBandwidth);
        this.setParamSimple(map, prefix + "AddBandwidth", this.AddBandwidth);
        this.setParamSimple(map, prefix + "MinAddBandwidth", this.MinAddBandwidth);
        this.setParamSimple(map, prefix + "MaxAddBandwidth", this.MaxAddBandwidth);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
