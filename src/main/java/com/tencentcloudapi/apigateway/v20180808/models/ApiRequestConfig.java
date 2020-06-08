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

public class ApiRequestConfig extends AbstractModel{

    /**
    * path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Method
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get path 
     * @return Path path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set path
     * @param Path path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Method 
     * @return Method Method
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Method
     * @param Method Method
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

