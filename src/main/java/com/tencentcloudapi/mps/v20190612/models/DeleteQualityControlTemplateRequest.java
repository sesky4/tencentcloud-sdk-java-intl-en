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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteQualityControlTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of a media quality inspection template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get Unique identifier of a media quality inspection template. 
     * @return Definition Unique identifier of a media quality inspection template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of a media quality inspection template.
     * @param Definition Unique identifier of a media quality inspection template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public DeleteQualityControlTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteQualityControlTemplateRequest(DeleteQualityControlTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}
