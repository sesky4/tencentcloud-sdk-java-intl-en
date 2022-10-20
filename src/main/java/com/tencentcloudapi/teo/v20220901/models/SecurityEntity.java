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

public class SecurityEntity extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name/layer-4 proxy
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * The type. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy name</li>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

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
     * Get The subdomain name/layer-4 proxy 
     * @return Entity The subdomain name/layer-4 proxy
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name/layer-4 proxy
     * @param Entity The subdomain name/layer-4 proxy
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get The type. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy name</li> 
     * @return EntityType The type. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy name</li>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set The type. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy name</li>
     * @param EntityType The type. Values:
<li>`domain`: Layer-7 subdomain name</li>
<li>`application`: Layer-4 proxy name</li>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    public SecurityEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityEntity(SecurityEntity source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);

    }
}

