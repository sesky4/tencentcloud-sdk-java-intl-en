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

public class DescribePublicProxyInstallCommandResponse extends AbstractModel {

    /**
    * Nginx Installation Command
    */
    @SerializedName("NginxCommand")
    @Expose
    private String NginxCommand;

    /**
    * Keepalived Installation Command
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeepAliveCommand")
    @Expose
    private String KeepAliveCommand;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Nginx Installation Command 
     * @return NginxCommand Nginx Installation Command
     */
    public String getNginxCommand() {
        return this.NginxCommand;
    }

    /**
     * Set Nginx Installation Command
     * @param NginxCommand Nginx Installation Command
     */
    public void setNginxCommand(String NginxCommand) {
        this.NginxCommand = NginxCommand;
    }

    /**
     * Get Keepalived Installation Command
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeepAliveCommand Keepalived Installation Command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeepAliveCommand() {
        return this.KeepAliveCommand;
    }

    /**
     * Set Keepalived Installation Command
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeepAliveCommand Keepalived Installation Command
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeepAliveCommand(String KeepAliveCommand) {
        this.KeepAliveCommand = KeepAliveCommand;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePublicProxyInstallCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicProxyInstallCommandResponse(DescribePublicProxyInstallCommandResponse source) {
        if (source.NginxCommand != null) {
            this.NginxCommand = new String(source.NginxCommand);
        }
        if (source.KeepAliveCommand != null) {
            this.KeepAliveCommand = new String(source.KeepAliveCommand);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NginxCommand", this.NginxCommand);
        this.setParamSimple(map, prefix + "KeepAliveCommand", this.KeepAliveCommand);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

