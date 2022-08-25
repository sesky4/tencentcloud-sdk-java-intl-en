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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNetworkAclQuintupleEntriesRequest extends AbstractModel{

    /**
    * Network ACL instance ID, such as `acl-12345678`.
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * Network ACL quintuple rule set.
    */
    @SerializedName("NetworkAclQuintupleSet")
    @Expose
    private NetworkAclQuintupleEntries NetworkAclQuintupleSet;

    /**
     * Get Network ACL instance ID, such as `acl-12345678`. 
     * @return NetworkAclId Network ACL instance ID, such as `acl-12345678`.
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set Network ACL instance ID, such as `acl-12345678`.
     * @param NetworkAclId Network ACL instance ID, such as `acl-12345678`.
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get Network ACL quintuple rule set. 
     * @return NetworkAclQuintupleSet Network ACL quintuple rule set.
     */
    public NetworkAclQuintupleEntries getNetworkAclQuintupleSet() {
        return this.NetworkAclQuintupleSet;
    }

    /**
     * Set Network ACL quintuple rule set.
     * @param NetworkAclQuintupleSet Network ACL quintuple rule set.
     */
    public void setNetworkAclQuintupleSet(NetworkAclQuintupleEntries NetworkAclQuintupleSet) {
        this.NetworkAclQuintupleSet = NetworkAclQuintupleSet;
    }

    public DeleteNetworkAclQuintupleEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNetworkAclQuintupleEntriesRequest(DeleteNetworkAclQuintupleEntriesRequest source) {
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.NetworkAclQuintupleSet != null) {
            this.NetworkAclQuintupleSet = new NetworkAclQuintupleEntries(source.NetworkAclQuintupleSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamObj(map, prefix + "NetworkAclQuintupleSet.", this.NetworkAclQuintupleSet);

    }
}

