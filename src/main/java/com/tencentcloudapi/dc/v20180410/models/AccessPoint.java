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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPoint extends AbstractModel{

    /**
    * Access point name.
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * Unique ID of access point.
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * Access point status. Valid values: available, unavailable.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Access point location.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Supported ISP list of access pint.
    */
    @SerializedName("LineOperator")
    @Expose
    private String [] LineOperator;

    /**
    * Region ID where the access point resides.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AvailablePortType")
    @Expose
    private String [] AvailablePortType;

    /**
     * Get Access point name. 
     * @return AccessPointName Access point name.
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set Access point name.
     * @param AccessPointName Access point name.
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get Unique ID of access point. 
     * @return AccessPointId Unique ID of access point.
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set Unique ID of access point.
     * @param AccessPointId Unique ID of access point.
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get Access point status. Valid values: available, unavailable. 
     * @return State Access point status. Valid values: available, unavailable.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Access point status. Valid values: available, unavailable.
     * @param State Access point status. Valid values: available, unavailable.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Access point location. 
     * @return Location Access point location.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Access point location.
     * @param Location Access point location.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Supported ISP list of access pint. 
     * @return LineOperator Supported ISP list of access pint.
     */
    public String [] getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set Supported ISP list of access pint.
     * @param LineOperator Supported ISP list of access pint.
     */
    public void setLineOperator(String [] LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get Region ID where the access point resides. 
     * @return RegionId Region ID where the access point resides.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID where the access point resides.
     * @param RegionId Region ID where the access point resides.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AvailablePortType Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getAvailablePortType() {
        return this.AvailablePortType;
    }

    /**
     * Set Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AvailablePortType Available port type at the access point. Valid values: 1000BASE-T: gigabit electrical port; 1000BASE-LX: 10 km gigabit single-mode optical port; 1000BASE-ZX: 80 km gigabit single-mode optical port; 10GBASE-LR: 10 km 10-gigabit single-mode optical port; 10GBASE-ZR: 80 km 10-gigabit single-mode optical port; 10GBASE-LH: 40 km 10-gigabit single-mode optical port; 100GBASE-LR4: 10 km 100-gigabit single-mode optical portfiber optic port.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAvailablePortType(String [] AvailablePortType) {
        this.AvailablePortType = AvailablePortType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArraySimple(map, prefix + "LineOperator.", this.LineOperator);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "AvailablePortType.", this.AvailablePortType);

    }
}

