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

public class WebHookReceiver extends AbstractModel {

    /**
    * id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Webhook URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
     * Get id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Recipient name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Webhook URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Addr Webhook URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set Webhook URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Addr Webhook URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    public WebHookReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookReceiver(WebHookReceiver source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Addr", this.Addr);

    }
}

