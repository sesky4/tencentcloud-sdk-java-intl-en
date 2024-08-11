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

public class ModifyApplicationAppUrlRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Android address
    */
    @SerializedName("AndroidAppURL")
    @Expose
    private String AndroidAppURL;

    /**
    * iOS address
    */
    @SerializedName("IOSAppURL")
    @Expose
    private String IOSAppURL;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
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

    /**
     * Get Android address 
     * @return AndroidAppURL Android address
     */
    public String getAndroidAppURL() {
        return this.AndroidAppURL;
    }

    /**
     * Set Android address
     * @param AndroidAppURL Android address
     */
    public void setAndroidAppURL(String AndroidAppURL) {
        this.AndroidAppURL = AndroidAppURL;
    }

    /**
     * Get iOS address 
     * @return IOSAppURL iOS address
     */
    public String getIOSAppURL() {
        return this.IOSAppURL;
    }

    /**
     * Set iOS address
     * @param IOSAppURL iOS address
     */
    public void setIOSAppURL(String IOSAppURL) {
        this.IOSAppURL = IOSAppURL;
    }

    public ModifyApplicationAppUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationAppUrlRequest(ModifyApplicationAppUrlRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.AndroidAppURL != null) {
            this.AndroidAppURL = new String(source.AndroidAppURL);
        }
        if (source.IOSAppURL != null) {
            this.IOSAppURL = new String(source.IOSAppURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AndroidAppURL", this.AndroidAppURL);
        this.setParamSimple(map, prefix + "IOSAppURL", this.IOSAppURL);

    }
}

