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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WSParams extends AbstractModel{

    /**
    * Idle timeout period in seconds. Default: 15; range: 1 to 1800
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IdleTimeOut")
    @Expose
    private Long IdleTimeOut;

    /**
     * Get Idle timeout period in seconds. Default: 15; range: 1 to 1800
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return IdleTimeOut Idle timeout period in seconds. Default: 15; range: 1 to 1800
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIdleTimeOut() {
        return this.IdleTimeOut;
    }

    /**
     * Set Idle timeout period in seconds. Default: 15; range: 1 to 1800
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param IdleTimeOut Idle timeout period in seconds. Default: 15; range: 1 to 1800
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIdleTimeOut(Long IdleTimeOut) {
        this.IdleTimeOut = IdleTimeOut;
    }

    public WSParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WSParams(WSParams source) {
        if (source.IdleTimeOut != null) {
            this.IdleTimeOut = new Long(source.IdleTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdleTimeOut", this.IdleTimeOut);

    }
}
