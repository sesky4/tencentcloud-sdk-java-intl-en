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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUsersConfigRequest extends AbstractModel {

    /**
    * Configuration name
<li>license_monitor new authorization monitoring configuration: 0 - disable, 1 - enable</li>
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration value
    */
    @SerializedName("ConfigValue")
    @Expose
    private String ConfigValue;

    /**
     * Get Configuration name
<li>license_monitor new authorization monitoring configuration: 0 - disable, 1 - enable</li> 
     * @return ConfigName Configuration name
<li>license_monitor new authorization monitoring configuration: 0 - disable, 1 - enable</li>
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration name
<li>license_monitor new authorization monitoring configuration: 0 - disable, 1 - enable</li>
     * @param ConfigName Configuration name
<li>license_monitor new authorization monitoring configuration: 0 - disable, 1 - enable</li>
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Configuration value 
     * @return ConfigValue Configuration value
     */
    public String getConfigValue() {
        return this.ConfigValue;
    }

    /**
     * Set Configuration value
     * @param ConfigValue Configuration value
     */
    public void setConfigValue(String ConfigValue) {
        this.ConfigValue = ConfigValue;
    }

    public ModifyUsersConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUsersConfigRequest(ModifyUsersConfigRequest source) {
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigValue != null) {
            this.ConfigValue = new String(source.ConfigValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigValue", this.ConfigValue);

    }
}

