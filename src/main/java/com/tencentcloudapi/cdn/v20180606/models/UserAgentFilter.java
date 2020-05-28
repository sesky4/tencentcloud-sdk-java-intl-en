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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserAgentFilter extends AbstractModel{

    /**
    * Switch. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * UA blacklist/whitelist effect rule list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterRules")
    @Expose
    private UserAgentFilterRule [] FilterRules;

    /**
     * Get Switch. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Switch Switch. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Switch Switch. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get UA blacklist/whitelist effect rule list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterRules UA blacklist/whitelist effect rule list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserAgentFilterRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set UA blacklist/whitelist effect rule list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterRules UA blacklist/whitelist effect rule list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterRules(UserAgentFilterRule [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);

    }
}

