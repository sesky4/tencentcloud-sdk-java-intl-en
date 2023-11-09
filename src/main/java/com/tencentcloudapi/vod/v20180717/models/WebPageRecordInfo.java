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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebPageRecordInfo extends AbstractModel {

    /**
    * Panoramic recording Url.
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * Panoramic recording task ID.
    */
    @SerializedName("RecordTaskId")
    @Expose
    private String RecordTaskId;

    /**
     * Get Panoramic recording Url. 
     * @return RecordUrl Panoramic recording Url.
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set Panoramic recording Url.
     * @param RecordUrl Panoramic recording Url.
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get Panoramic recording task ID. 
     * @return RecordTaskId Panoramic recording task ID.
     */
    public String getRecordTaskId() {
        return this.RecordTaskId;
    }

    /**
     * Set Panoramic recording task ID.
     * @param RecordTaskId Panoramic recording task ID.
     */
    public void setRecordTaskId(String RecordTaskId) {
        this.RecordTaskId = RecordTaskId;
    }

    public WebPageRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebPageRecordInfo(WebPageRecordInfo source) {
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.RecordTaskId != null) {
            this.RecordTaskId = new String(source.RecordTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "RecordTaskId", this.RecordTaskId);

    }
}

