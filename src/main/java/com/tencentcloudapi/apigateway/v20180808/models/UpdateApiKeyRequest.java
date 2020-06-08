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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApiKeyRequest extends AbstractModel{

    /**
    * ID of the key to be updated.
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Key to be updated, which is required when a custom key is updated. It can contain 10 to 50 letters, digits, and underscores.
    */
    @SerializedName("AccessKeySecret")
    @Expose
    private String AccessKeySecret;

    /**
     * Get ID of the key to be updated. 
     * @return AccessKeyId ID of the key to be updated.
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set ID of the key to be updated.
     * @param AccessKeyId ID of the key to be updated.
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Key to be updated, which is required when a custom key is updated. It can contain 10 to 50 letters, digits, and underscores. 
     * @return AccessKeySecret Key to be updated, which is required when a custom key is updated. It can contain 10 to 50 letters, digits, and underscores.
     */
    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    /**
     * Set Key to be updated, which is required when a custom key is updated. It can contain 10 to 50 letters, digits, and underscores.
     * @param AccessKeySecret Key to be updated, which is required when a custom key is updated. It can contain 10 to 50 letters, digits, and underscores.
     */
    public void setAccessKeySecret(String AccessKeySecret) {
        this.AccessKeySecret = AccessKeySecret;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "AccessKeySecret", this.AccessKeySecret);

    }
}

