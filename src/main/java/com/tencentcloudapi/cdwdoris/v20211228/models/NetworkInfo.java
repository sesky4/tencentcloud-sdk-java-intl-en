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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInfo extends AbstractModel {

    /**
    * Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The number of available IP addresses in the current subnet
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetIpNum")
    @Expose
    private Long SubnetIpNum;

    /**
     * Get Availability zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Availability zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The number of available IP addresses in the current subnet
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetIpNum The number of available IP addresses in the current subnet
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSubnetIpNum() {
        return this.SubnetIpNum;
    }

    /**
     * Set The number of available IP addresses in the current subnet
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetIpNum The number of available IP addresses in the current subnet
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetIpNum(Long SubnetIpNum) {
        this.SubnetIpNum = SubnetIpNum;
    }

    public NetworkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInfo(NetworkInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetIpNum != null) {
            this.SubnetIpNum = new Long(source.SubnetIpNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetIpNum", this.SubnetIpNum);

    }
}

