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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesResponse extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Permission list
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * Database account username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Database account host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Permission list 
     * @return Privileges Permission list
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission list
     * @param Privileges Permission list
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get Database account username 
     * @return UserName Database account username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Database account username
     * @param UserName Database account username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Database account host 
     * @return Host Database account host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Database account host
     * @param Host Database account host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccountPrivilegesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesResponse(DescribeAccountPrivilegesResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

