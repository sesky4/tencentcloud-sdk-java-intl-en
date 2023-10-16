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

public class ModifyDBInstanceNameRequest extends AbstractModel{

    /**
    * Database instance ID in the format of postgres-6fego161
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Database instance ID in the format of postgres-6fego161 
     * @return DBInstanceId Database instance ID in the format of postgres-6fego161
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Database instance ID in the format of postgres-6fego161
     * @param DBInstanceId Database instance ID in the format of postgres-6fego161
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.
 
     * @return InstanceName Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

     * @param InstanceName Instance name, which can contain up to 60 letters, digits, hyphens, and symbols (_-). If this parameter is not specified, "Unnamed" will be displayed by default.

     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ModifyDBInstanceNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNameRequest(ModifyDBInstanceNameRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

