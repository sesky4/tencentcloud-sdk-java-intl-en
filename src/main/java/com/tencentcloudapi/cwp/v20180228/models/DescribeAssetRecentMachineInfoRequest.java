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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetRecentMachineInfoRequest extends AbstractModel {

    /**
    * Start time. For example, 2020-09-22.
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * End time. For example, 2020-09-22.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get Start time. For example, 2020-09-22. 
     * @return BeginDate Start time. For example, 2020-09-22.
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set Start time. For example, 2020-09-22.
     * @param BeginDate Start time. For example, 2020-09-22.
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get End time. For example, 2020-09-22. 
     * @return EndDate End time. For example, 2020-09-22.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End time. For example, 2020-09-22.
     * @param EndDate End time. For example, 2020-09-22.
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public DescribeAssetRecentMachineInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetRecentMachineInfoRequest(DescribeAssetRecentMachineInfoRequest source) {
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

