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

public class ModifyWebHookRuleStatusRequest extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Enabling status: [0: ON | 1: Off]
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Enabling status: [0: ON | 1: Off] 
     * @return IsDisabled Enabling status: [0: ON | 1: Off]
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set Enabling status: [0: ON | 1: Off]
     * @param IsDisabled Enabling status: [0: ON | 1: Off]
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    public ModifyWebHookRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebHookRuleStatusRequest(ModifyWebHookRuleStatusRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Long(source.IsDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);

    }
}
