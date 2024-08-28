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

public class ModifyLoginWhiteInfoRequest extends AbstractModel {

    /**
    * Update the allowlist information entity
    */
    @SerializedName("HostLoginWhiteObj")
    @Expose
    private UpdateHostLoginWhiteObj HostLoginWhiteObj;

    /**
     * Get Update the allowlist information entity 
     * @return HostLoginWhiteObj Update the allowlist information entity
     */
    public UpdateHostLoginWhiteObj getHostLoginWhiteObj() {
        return this.HostLoginWhiteObj;
    }

    /**
     * Set Update the allowlist information entity
     * @param HostLoginWhiteObj Update the allowlist information entity
     */
    public void setHostLoginWhiteObj(UpdateHostLoginWhiteObj HostLoginWhiteObj) {
        this.HostLoginWhiteObj = HostLoginWhiteObj;
    }

    public ModifyLoginWhiteInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteInfoRequest(ModifyLoginWhiteInfoRequest source) {
        if (source.HostLoginWhiteObj != null) {
            this.HostLoginWhiteObj = new UpdateHostLoginWhiteObj(source.HostLoginWhiteObj);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostLoginWhiteObj.", this.HostLoginWhiteObj);

    }
}

