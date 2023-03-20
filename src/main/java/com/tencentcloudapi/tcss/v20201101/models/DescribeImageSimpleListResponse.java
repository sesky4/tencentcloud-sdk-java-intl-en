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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageSimpleListResponse extends AbstractModel{

    /**
    * List of images
    */
    @SerializedName("ImageList")
    @Expose
    private ImageSimpleInfo [] ImageList;

    /**
    * Number of images
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of images 
     * @return ImageList List of images
     */
    public ImageSimpleInfo [] getImageList() {
        return this.ImageList;
    }

    /**
     * Set List of images
     * @param ImageList List of images
     */
    public void setImageList(ImageSimpleInfo [] ImageList) {
        this.ImageList = ImageList;
    }

    /**
     * Get Number of images 
     * @return ImageCnt Number of images
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set Number of images
     * @param ImageCnt Number of images
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
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

    public DescribeImageSimpleListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageSimpleListResponse(DescribeImageSimpleListResponse source) {
        if (source.ImageList != null) {
            this.ImageList = new ImageSimpleInfo[source.ImageList.length];
            for (int i = 0; i < source.ImageList.length; i++) {
                this.ImageList[i] = new ImageSimpleInfo(source.ImageList[i]);
            }
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageList.", this.ImageList);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
