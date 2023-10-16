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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceHAConfigResponse extends AbstractModel{

    /**
    * Primary-standby sync mode. Valid values:
<li>`Semi-sync`
<li>`Async`
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * Maximum data lag for high-availability standby server. The standby node can be promoted to the primary node when its data lag and the delay time are both less than the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: byte
<li>Value range: 1073741824-322122547200
    */
    @SerializedName("MaxStandbyLatency")
    @Expose
    private Long MaxStandbyLatency;

    /**
    * The maximum delay for high-availability standby server The standby node can be promoted to the primary node when its data lag and the delay time are both less than or equals to the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: s
<li>Value range: 5-10
    */
    @SerializedName("MaxStandbyLag")
    @Expose
    private Long MaxStandbyLag;

    /**
    * Maximum data sync lag for u200du200dstandby server. If data lag of the standby node and the delay time are both less than or equals to the values of `MaxSyncStandbyLatency` and `MaxSyncStandbyLag` respectively, the standby server adopts semi-sync replication; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field returns null for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxSyncStandbyLatency")
    @Expose
    private Long MaxSyncStandbyLatency;

    /**
    * Maximum sync delay time for u200dstandby server. If the delay time for u200dstandby server and the data lag are both less than or equals to the values of `MaxSyncStandbyLag` and `MaxSyncStandbyLatency` respectively, the standby server adopts sync replication mode; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field will not return for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxSyncStandbyLag")
    @Expose
    private Long MaxSyncStandbyLag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Primary-standby sync mode. Valid values:
<li>`Semi-sync`
<li>`Async` 
     * @return SyncMode Primary-standby sync mode. Valid values:
<li>`Semi-sync`
<li>`Async`
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Primary-standby sync mode. Valid values:
<li>`Semi-sync`
<li>`Async`
     * @param SyncMode Primary-standby sync mode. Valid values:
<li>`Semi-sync`
<li>`Async`
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get Maximum data lag for high-availability standby server. The standby node can be promoted to the primary node when its data lag and the delay time are both less than the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: byte
<li>Value range: 1073741824-322122547200 
     * @return MaxStandbyLatency Maximum data lag for high-availability standby server. The standby node can be promoted to the primary node when its data lag and the delay time are both less than the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: byte
<li>Value range: 1073741824-322122547200
     */
    public Long getMaxStandbyLatency() {
        return this.MaxStandbyLatency;
    }

    /**
     * Set Maximum data lag for high-availability standby server. The standby node can be promoted to the primary node when its data lag and the delay time are both less than the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: byte
<li>Value range: 1073741824-322122547200
     * @param MaxStandbyLatency Maximum data lag for high-availability standby server. The standby node can be promoted to the primary node when its data lag and the delay time are both less than the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: byte
<li>Value range: 1073741824-322122547200
     */
    public void setMaxStandbyLatency(Long MaxStandbyLatency) {
        this.MaxStandbyLatency = MaxStandbyLatency;
    }

    /**
     * Get The maximum delay for high-availability standby server The standby node can be promoted to the primary node when its data lag and the delay time are both less than or equals to the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: s
<li>Value range: 5-10 
     * @return MaxStandbyLag The maximum delay for high-availability standby server The standby node can be promoted to the primary node when its data lag and the delay time are both less than or equals to the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: s
<li>Value range: 5-10
     */
    public Long getMaxStandbyLag() {
        return this.MaxStandbyLag;
    }

    /**
     * Set The maximum delay for high-availability standby server The standby node can be promoted to the primary node when its data lag and the delay time are both less than or equals to the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: s
<li>Value range: 5-10
     * @param MaxStandbyLag The maximum delay for high-availability standby server The standby node can be promoted to the primary node when its data lag and the delay time are both less than or equals to the value of `MaxStandbyLatency` and `MaxStandbyLag` respectively.
<li>Unit: s
<li>Value range: 5-10
     */
    public void setMaxStandbyLag(Long MaxStandbyLag) {
        this.MaxStandbyLag = MaxStandbyLag;
    }

    /**
     * Get Maximum data sync lag for u200du200dstandby server. If data lag of the standby node and the delay time are both less than or equals to the values of `MaxSyncStandbyLatency` and `MaxSyncStandbyLag` respectively, the standby server adopts semi-sync replication; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field returns null for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MaxSyncStandbyLatency Maximum data sync lag for u200du200dstandby server. If data lag of the standby node and the delay time are both less than or equals to the values of `MaxSyncStandbyLatency` and `MaxSyncStandbyLag` respectively, the standby server adopts semi-sync replication; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field returns null for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxSyncStandbyLatency() {
        return this.MaxSyncStandbyLatency;
    }

    /**
     * Set Maximum data sync lag for u200du200dstandby server. If data lag of the standby node and the delay time are both less than or equals to the values of `MaxSyncStandbyLatency` and `MaxSyncStandbyLag` respectively, the standby server adopts semi-sync replication; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field returns null for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MaxSyncStandbyLatency Maximum data sync lag for u200du200dstandby server. If data lag of the standby node and the delay time are both less than or equals to the values of `MaxSyncStandbyLatency` and `MaxSyncStandbyLag` respectively, the standby server adopts semi-sync replication; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field returns null for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxSyncStandbyLatency(Long MaxSyncStandbyLatency) {
        this.MaxSyncStandbyLatency = MaxSyncStandbyLatency;
    }

    /**
     * Get Maximum sync delay time for u200dstandby server. If the delay time for u200dstandby server and the data lag are both less than or equals to the values of `MaxSyncStandbyLag` and `MaxSyncStandbyLatency` respectively, the standby server adopts sync replication mode; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field will not return for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MaxSyncStandbyLag Maximum sync delay time for u200dstandby server. If the delay time for u200dstandby server and the data lag are both less than or equals to the values of `MaxSyncStandbyLag` and `MaxSyncStandbyLatency` respectively, the standby server adopts sync replication mode; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field will not return for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxSyncStandbyLag() {
        return this.MaxSyncStandbyLag;
    }

    /**
     * Set Maximum sync delay time for u200dstandby server. If the delay time for u200dstandby server and the data lag are both less than or equals to the values of `MaxSyncStandbyLag` and `MaxSyncStandbyLatency` respectively, the standby server adopts sync replication mode; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field will not return for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MaxSyncStandbyLag Maximum sync delay time for u200dstandby server. If the delay time for u200dstandby server and the data lag are both less than or equals to the values of `MaxSyncStandbyLag` and `MaxSyncStandbyLatency` respectively, the standby server adopts sync replication mode; if not, it adopts async replication.
This value is only valid for the instance with `SyncMode` set to `Semi-sync`.
This field will not return for async instance
and semi-sync (non-downgradable to async) instance.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxSyncStandbyLag(Long MaxSyncStandbyLag) {
        this.MaxSyncStandbyLag = MaxSyncStandbyLag;
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

    public DescribeDBInstanceHAConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceHAConfigResponse(DescribeDBInstanceHAConfigResponse source) {
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.MaxStandbyLatency != null) {
            this.MaxStandbyLatency = new Long(source.MaxStandbyLatency);
        }
        if (source.MaxStandbyLag != null) {
            this.MaxStandbyLag = new Long(source.MaxStandbyLag);
        }
        if (source.MaxSyncStandbyLatency != null) {
            this.MaxSyncStandbyLatency = new Long(source.MaxSyncStandbyLatency);
        }
        if (source.MaxSyncStandbyLag != null) {
            this.MaxSyncStandbyLag = new Long(source.MaxSyncStandbyLag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "MaxStandbyLatency", this.MaxStandbyLatency);
        this.setParamSimple(map, prefix + "MaxStandbyLag", this.MaxStandbyLag);
        this.setParamSimple(map, prefix + "MaxSyncStandbyLatency", this.MaxSyncStandbyLatency);
        this.setParamSimple(map, prefix + "MaxSyncStandbyLag", this.MaxSyncStandbyLag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

