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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeScriptResponse extends AbstractModel{

    /**
    * Whether to download the link
    */
    @SerializedName("Link")
    @Expose
    private String Link;

    /**
    * Whether to download the desired token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Whether to download the command
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to download the link 
     * @return Link Whether to download the link
     */
    public String getLink() {
        return this.Link;
    }

    /**
     * Set Whether to download the link
     * @param Link Whether to download the link
     */
    public void setLink(String Link) {
        this.Link = Link;
    }

    /**
     * Get Whether to download the desired token 
     * @return Token Whether to download the desired token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Whether to download the desired token
     * @param Token Whether to download the desired token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Whether to download the command 
     * @return Command Whether to download the command
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Whether to download the command
     * @param Command Whether to download the command
     */
    public void setCommand(String Command) {
        this.Command = Command;
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

    public DescribeTKEEdgeScriptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeScriptResponse(DescribeTKEEdgeScriptResponse source) {
        if (source.Link != null) {
            this.Link = new String(source.Link);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Link", this.Link);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

