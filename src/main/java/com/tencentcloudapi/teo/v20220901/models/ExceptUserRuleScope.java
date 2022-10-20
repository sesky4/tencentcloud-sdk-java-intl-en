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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptUserRuleScope extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The module that applies. Only WAF managed rules are supported currently.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Modules")
    @Expose
    private String [] Modules;

    /**
    * 
    */
    @SerializedName("PartialModules")
    @Expose
    private PartialModule [] PartialModules;

    /**
    * 
    */
    @SerializedName("SkipConditions")
    @Expose
    private SkipCondition [] SkipConditions;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The module that applies. Only WAF managed rules are supported currently.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Modules The module that applies. Only WAF managed rules are supported currently.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getModules() {
        return this.Modules;
    }

    /**
     * Set The module that applies. Only WAF managed rules are supported currently.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Modules The module that applies. Only WAF managed rules are supported currently.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModules(String [] Modules) {
        this.Modules = Modules;
    }

    /**
     * Get  
     * @return PartialModules 
     */
    public PartialModule [] getPartialModules() {
        return this.PartialModules;
    }

    /**
     * Set 
     * @param PartialModules 
     */
    public void setPartialModules(PartialModule [] PartialModules) {
        this.PartialModules = PartialModules;
    }

    /**
     * Get  
     * @return SkipConditions 
     */
    public SkipCondition [] getSkipConditions() {
        return this.SkipConditions;
    }

    /**
     * Set 
     * @param SkipConditions 
     */
    public void setSkipConditions(SkipCondition [] SkipConditions) {
        this.SkipConditions = SkipConditions;
    }

    public ExceptUserRuleScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptUserRuleScope(ExceptUserRuleScope source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Modules != null) {
            this.Modules = new String[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new String(source.Modules[i]);
            }
        }
        if (source.PartialModules != null) {
            this.PartialModules = new PartialModule[source.PartialModules.length];
            for (int i = 0; i < source.PartialModules.length; i++) {
                this.PartialModules[i] = new PartialModule(source.PartialModules[i]);
            }
        }
        if (source.SkipConditions != null) {
            this.SkipConditions = new SkipCondition[source.SkipConditions.length];
            for (int i = 0; i < source.SkipConditions.length; i++) {
                this.SkipConditions[i] = new SkipCondition(source.SkipConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Modules.", this.Modules);
        this.setParamArrayObj(map, prefix + "PartialModules.", this.PartialModules);
        this.setParamArrayObj(map, prefix + "SkipConditions.", this.SkipConditions);

    }
}
