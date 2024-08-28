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

public class DescribePublicProxyInstallCommandRequest extends AbstractModel {

    /**
    * List of Nginx host IP addresses, separated by commas
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get List of Nginx host IP addresses, separated by commas 
     * @return Ip List of Nginx host IP addresses, separated by commas
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set List of Nginx host IP addresses, separated by commas
     * @param Ip List of Nginx host IP addresses, separated by commas
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public DescribePublicProxyInstallCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicProxyInstallCommandRequest(DescribePublicProxyInstallCommandRequest source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

