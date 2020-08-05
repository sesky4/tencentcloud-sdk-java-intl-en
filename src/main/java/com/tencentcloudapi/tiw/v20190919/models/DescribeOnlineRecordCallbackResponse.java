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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOnlineRecordCallbackResponse extends AbstractModel{

    /**
    * Callback address of the real-time recording event. If no callback address is set, this field is null.
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * Authentication key of the real-time recording callback
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Callback address of the real-time recording event. If no callback address is set, this field is null. 
     * @return Callback Callback address of the real-time recording event. If no callback address is set, this field is null.
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Callback address of the real-time recording event. If no callback address is set, this field is null.
     * @param Callback Callback address of the real-time recording event. If no callback address is set, this field is null.
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get Authentication key of the real-time recording callback 
     * @return CallbackKey Authentication key of the real-time recording callback
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Authentication key of the real-time recording callback
     * @param CallbackKey Authentication key of the real-time recording callback
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

