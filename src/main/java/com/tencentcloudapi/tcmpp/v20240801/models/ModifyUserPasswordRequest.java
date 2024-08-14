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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserPasswordRequest extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Account password. Use CreatePresetKey to get publick key to encrypt the password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Call CreatePresetKey to get the keyID from RequestId
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Account password. Use CreatePresetKey to get publick key to encrypt the password. 
     * @return Password Account password. Use CreatePresetKey to get publick key to encrypt the password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password. Use CreatePresetKey to get publick key to encrypt the password.
     * @param Password Account password. Use CreatePresetKey to get publick key to encrypt the password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Call CreatePresetKey to get the keyID from RequestId 
     * @return KeyId Call CreatePresetKey to get the keyID from RequestId
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Call CreatePresetKey to get the keyID from RequestId
     * @param KeyId Call CreatePresetKey to get the keyID from RequestId
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public ModifyUserPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserPasswordRequest(ModifyUserPasswordRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}
