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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOperation extends AbstractModel{

    /**
    * The image processing type. Valid values:
<li>`Scale`: Scaling</li>
<li>`CenterCut`: Cropping</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The scaling details. This parameter is valid only if `Type` is `Scale`.
    */
    @SerializedName("Scale")
    @Expose
    private ImageScale Scale;

    /**
    * The cropping details. This parameter is valid only if `Type` is `CenterCut`.
    */
    @SerializedName("CenterCut")
    @Expose
    private ImageCenterCut CenterCut;

    /**
     * Get The image processing type. Valid values:
<li>`Scale`: Scaling</li>
<li>`CenterCut`: Cropping</li> 
     * @return Type The image processing type. Valid values:
<li>`Scale`: Scaling</li>
<li>`CenterCut`: Cropping</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The image processing type. Valid values:
<li>`Scale`: Scaling</li>
<li>`CenterCut`: Cropping</li>
     * @param Type The image processing type. Valid values:
<li>`Scale`: Scaling</li>
<li>`CenterCut`: Cropping</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The scaling details. This parameter is valid only if `Type` is `Scale`. 
     * @return Scale The scaling details. This parameter is valid only if `Type` is `Scale`.
     */
    public ImageScale getScale() {
        return this.Scale;
    }

    /**
     * Set The scaling details. This parameter is valid only if `Type` is `Scale`.
     * @param Scale The scaling details. This parameter is valid only if `Type` is `Scale`.
     */
    public void setScale(ImageScale Scale) {
        this.Scale = Scale;
    }

    /**
     * Get The cropping details. This parameter is valid only if `Type` is `CenterCut`. 
     * @return CenterCut The cropping details. This parameter is valid only if `Type` is `CenterCut`.
     */
    public ImageCenterCut getCenterCut() {
        return this.CenterCut;
    }

    /**
     * Set The cropping details. This parameter is valid only if `Type` is `CenterCut`.
     * @param CenterCut The cropping details. This parameter is valid only if `Type` is `CenterCut`.
     */
    public void setCenterCut(ImageCenterCut CenterCut) {
        this.CenterCut = CenterCut;
    }

    public ImageOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageOperation(ImageOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Scale != null) {
            this.Scale = new ImageScale(source.Scale);
        }
        if (source.CenterCut != null) {
            this.CenterCut = new ImageCenterCut(source.CenterCut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Scale.", this.Scale);
        this.setParamObj(map, prefix + "CenterCut.", this.CenterCut);

    }
}

