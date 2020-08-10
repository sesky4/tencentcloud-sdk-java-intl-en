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

public class SetTranscodeCallbackKeyRequest extends AbstractModel{

    /**
    * SdkAppId of the application
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Authentication key of the document transcoding callback. It is a string of up to 64 characters. If it is specified as null, the existing callback authentication key is deleted.
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
     * Get SdkAppId of the application 
     * @return SdkAppId SdkAppId of the application
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the application
     * @param SdkAppId SdkAppId of the application
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Authentication key of the document transcoding callback. It is a string of up to 64 characters. If it is specified as null, the existing callback authentication key is deleted. 
     * @return CallbackKey Authentication key of the document transcoding callback. It is a string of up to 64 characters. If it is specified as null, the existing callback authentication key is deleted.
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Authentication key of the document transcoding callback. It is a string of up to 64 characters. If it is specified as null, the existing callback authentication key is deleted.
     * @param CallbackKey Authentication key of the document transcoding callback. It is a string of up to 64 characters. If it is specified as null, the existing callback authentication key is deleted.
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);

    }
}
