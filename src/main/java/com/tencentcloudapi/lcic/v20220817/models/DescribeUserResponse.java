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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserResponse extends AbstractModel{

    /**
    * The application ID.	
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * User ID	
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * URL of user profile photo.	
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The application ID.	 
     * @return SdkAppId The application ID.	
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID.	
     * @param SdkAppId The application ID.	
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

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
     * Get Username	 
     * @return Name Username	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Username	
     * @param Name Username	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get URL of user profile photo.	 
     * @return Avatar URL of user profile photo.	
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set URL of user profile photo.	
     * @param Avatar URL of user profile photo.	
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
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

    public DescribeUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserResponse(DescribeUserResponse source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

