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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamLinkFlowRequest extends AbstractModel{

    /**
    * Flow ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Name of the flow to modify
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
     * Get Flow ID 
     * @return FlowId Flow ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Flow ID
     * @param FlowId Flow ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Name of the flow to modify 
     * @return FlowName Name of the flow to modify
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set Name of the flow to modify
     * @param FlowName Name of the flow to modify
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    public ModifyStreamLinkFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLinkFlowRequest(ModifyStreamLinkFlowRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);

    }
}
