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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGrafanaEnvironmentsRequest extends AbstractModel{

    /**
    * Instance name
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Environment variable string
    */
    @SerializedName("Envs")
    @Expose
    private String Envs;

    /**
     * Get Instance name 
     * @return InstanceId Instance name
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name
     * @param InstanceId Instance name
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Environment variable string 
     * @return Envs Environment variable string
     */
    public String getEnvs() {
        return this.Envs;
    }

    /**
     * Set Environment variable string
     * @param Envs Environment variable string
     */
    public void setEnvs(String Envs) {
        this.Envs = Envs;
    }

    public UpdateGrafanaEnvironmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGrafanaEnvironmentsRequest(UpdateGrafanaEnvironmentsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Envs != null) {
            this.Envs = new String(source.Envs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Envs", this.Envs);

    }
}

