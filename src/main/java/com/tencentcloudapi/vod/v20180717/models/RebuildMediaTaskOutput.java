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

public class RebuildMediaTaskOutput extends AbstractModel{

    /**
    * The file type, such as MP4 and FLV.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * The playback URL of the output file.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * The file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The filename. This parameter can contain up to 64 characters, and will be generated by the system if it is left empty.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * The ID of the file’s category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the “Other” category.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiration time of the output file, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). The file will be deleted after the specified expiration time. By default, the file will never expire.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get The file type, such as MP4 and FLV. 
     * @return FileType The file type, such as MP4 and FLV.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set The file type, such as MP4 and FLV.
     * @param FileType The file type, such as MP4 and FLV.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get The playback URL of the output file. 
     * @return FileUrl The playback URL of the output file.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set The playback URL of the output file.
     * @param FileUrl The playback URL of the output file.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get The file ID. 
     * @return FileId The file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The file ID.
     * @param FileId The file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The filename. This parameter can contain up to 64 characters, and will be generated by the system if it is left empty. 
     * @return MediaName The filename. This parameter can contain up to 64 characters, and will be generated by the system if it is left empty.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set The filename. This parameter can contain up to 64 characters, and will be generated by the system if it is left empty.
     * @param MediaName The filename. This parameter can contain up to 64 characters, and will be generated by the system if it is left empty.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get The ID of the file’s category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the “Other” category.</li> 
     * @return ClassId The ID of the file’s category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the “Other” category.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set The ID of the file’s category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the “Other” category.</li>
     * @param ClassId The ID of the file’s category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the “Other” category.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiration time of the output file, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). The file will be deleted after the specified expiration time. By default, the file will never expire. 
     * @return ExpireTime The expiration time of the output file, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). The file will be deleted after the specified expiration time. By default, the file will never expire.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time of the output file, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). The file will be deleted after the specified expiration time. By default, the file will never expire.
     * @param ExpireTime The expiration time of the output file, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). The file will be deleted after the specified expiration time. By default, the file will never expire.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public RebuildMediaTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTaskOutput(RebuildMediaTaskOutput source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}
