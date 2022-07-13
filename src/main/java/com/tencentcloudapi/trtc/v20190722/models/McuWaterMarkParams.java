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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuWaterMarkParams extends AbstractModel{

    /**
    * The information of the watermark image.
    */
    @SerializedName("WaterMarkImage")
    @Expose
    private McuWaterMarkImage WaterMarkImage;

    /**
     * Get The information of the watermark image. 
     * @return WaterMarkImage The information of the watermark image.
     */
    public McuWaterMarkImage getWaterMarkImage() {
        return this.WaterMarkImage;
    }

    /**
     * Set The information of the watermark image.
     * @param WaterMarkImage The information of the watermark image.
     */
    public void setWaterMarkImage(McuWaterMarkImage WaterMarkImage) {
        this.WaterMarkImage = WaterMarkImage;
    }

    public McuWaterMarkParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkParams(McuWaterMarkParams source) {
        if (source.WaterMarkImage != null) {
            this.WaterMarkImage = new McuWaterMarkImage(source.WaterMarkImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);

    }
}
