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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Zone extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * List of name servers used by the site
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * The list of name servers assigned by Tencent Cloud.
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * The site status. Values:
<li>`active`: The name server is switched.</li>
<li>`pending`: The name server is not switched.</li>
<li>`moved`: The name server is moved.</li>
<li>`deactivated`: The site is blocked.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The site access method. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether the site is disabled.
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * Whether CNAME flattening is enabled. Valid values:
<li>`enabled`: Enabled.</li>
<li>`disabled`: Disabled.</li>
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * The list of resource tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The list of billable resources.
    */
    @SerializedName("Resources")
    @Expose
    private Resource [] Resources;

    /**
    * The creation time of the site.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The modification date of the site.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * The site access region. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The custom name server information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * The custom name server IP information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get List of name servers used by the site 
     * @return OriginalNameServers List of name servers used by the site
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set List of name servers used by the site
     * @param OriginalNameServers List of name servers used by the site
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get The list of name servers assigned by Tencent Cloud. 
     * @return NameServers The list of name servers assigned by Tencent Cloud.
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set The list of name servers assigned by Tencent Cloud.
     * @param NameServers The list of name servers assigned by Tencent Cloud.
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get The site status. Values:
<li>`active`: The name server is switched.</li>
<li>`pending`: The name server is not switched.</li>
<li>`moved`: The name server is moved.</li>
<li>`deactivated`: The site is blocked.</li> 
     * @return Status The site status. Values:
<li>`active`: The name server is switched.</li>
<li>`pending`: The name server is not switched.</li>
<li>`moved`: The name server is moved.</li>
<li>`deactivated`: The site is blocked.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The site status. Values:
<li>`active`: The name server is switched.</li>
<li>`pending`: The name server is not switched.</li>
<li>`moved`: The name server is moved.</li>
<li>`deactivated`: The site is blocked.</li>
     * @param Status The site status. Values:
<li>`active`: The name server is switched.</li>
<li>`pending`: The name server is not switched.</li>
<li>`moved`: The name server is moved.</li>
<li>`deactivated`: The site is blocked.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The site access method. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li> 
     * @return Type The site access method. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The site access method. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>
     * @param Type The site access method. Values:
<li>`full`: Access through a name server.</li>
<li>`partial`: Access through a CNAME record.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether the site is disabled. 
     * @return Paused Whether the site is disabled.
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Whether the site is disabled.
     * @param Paused Whether the site is disabled.
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get Whether CNAME flattening is enabled. Valid values:
<li>`enabled`: Enabled.</li>
<li>`disabled`: Disabled.</li> 
     * @return CnameSpeedUp Whether CNAME flattening is enabled. Valid values:
<li>`enabled`: Enabled.</li>
<li>`disabled`: Disabled.</li>
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set Whether CNAME flattening is enabled. Valid values:
<li>`enabled`: Enabled.</li>
<li>`disabled`: Disabled.</li>
     * @param CnameSpeedUp Whether CNAME flattening is enabled. Valid values:
<li>`enabled`: Enabled.</li>
<li>`disabled`: Disabled.</li>
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li> 
     * @return CnameStatus CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
     * @param CnameStatus CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get The list of resource tags. 
     * @return Tags The list of resource tags.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The list of resource tags.
     * @param Tags The list of resource tags.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The list of billable resources. 
     * @return Resources The list of billable resources.
     */
    public Resource [] getResources() {
        return this.Resources;
    }

    /**
     * Set The list of billable resources.
     * @param Resources The list of billable resources.
     */
    public void setResources(Resource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get The creation time of the site. 
     * @return CreatedOn The creation time of the site.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time of the site.
     * @param CreatedOn The creation time of the site.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The modification date of the site. 
     * @return ModifiedOn The modification date of the site.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set The modification date of the site.
     * @param ModifiedOn The modification date of the site.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get The site access region. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li> 
     * @return Area The site access region. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The site access region. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
     * @param Area The site access region. Values:
<li>`global`: Global.</li>
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The custom name server information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VanityNameServers The custom name server information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set The custom name server information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VanityNameServers The custom name server information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get The custom name server IP information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VanityNameServersIps The custom name server IP information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set The custom name server IP information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VanityNameServersIps The custom name server IP information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    public Zone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Zone(Zone source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new String(source.CnameStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new Resource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new Resource(source.Resources[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.VanityNameServersIps != null) {
            this.VanityNameServersIps = new VanityNameServersIps[source.VanityNameServersIps.length];
            for (int i = 0; i < source.VanityNameServersIps.length; i++) {
                this.VanityNameServersIps[i] = new VanityNameServersIps(source.VanityNameServersIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);

    }
}
