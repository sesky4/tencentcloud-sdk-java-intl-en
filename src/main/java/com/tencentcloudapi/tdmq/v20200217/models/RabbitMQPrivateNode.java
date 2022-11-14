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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQPrivateNode extends AbstractModel{

    /**
    * Node name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get Node name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeName Node name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeName Node name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public RabbitMQPrivateNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQPrivateNode(RabbitMQPrivateNode source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

