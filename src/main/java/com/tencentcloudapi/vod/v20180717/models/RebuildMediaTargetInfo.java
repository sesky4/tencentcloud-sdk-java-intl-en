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

public class RebuildMediaTargetInfo extends AbstractModel{

    /**
    * The filename. This parameter can contain up to 64 characters, and will be generated by the system if it is left empty.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * The description (up to 128 characters). If you do not specify this, the description will be empty.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * The output container format. Valid values: `mp4` (default), `flv`, `hls`.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * The output video parameters.
    */
    @SerializedName("VideoStream")
    @Expose
    private RebuildMediaTargetVideoStream VideoStream;

    /**
    * The output audio parameters.
    */
    @SerializedName("AudioStream")
    @Expose
    private RebuildMediaTargetAudioStream AudioStream;

    /**
    * Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

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
     * Get The description (up to 128 characters). If you do not specify this, the description will be empty. 
     * @return Description The description (up to 128 characters). If you do not specify this, the description will be empty.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description (up to 128 characters). If you do not specify this, the description will be empty.
     * @param Description The description (up to 128 characters). If you do not specify this, the description will be empty.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    /**
     * Get The output container format. Valid values: `mp4` (default), `flv`, `hls`. 
     * @return Container The output container format. Valid values: `mp4` (default), `flv`, `hls`.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set The output container format. Valid values: `mp4` (default), `flv`, `hls`.
     * @param Container The output container format. Valid values: `mp4` (default), `flv`, `hls`.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get The output video parameters. 
     * @return VideoStream The output video parameters.
     */
    public RebuildMediaTargetVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set The output video parameters.
     * @param VideoStream The output video parameters.
     */
    public void setVideoStream(RebuildMediaTargetVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get The output audio parameters. 
     * @return AudioStream The output audio parameters.
     */
    public RebuildMediaTargetAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set The output audio parameters.
     * @param AudioStream The output audio parameters.
     */
    public void setAudioStream(RebuildMediaTargetAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    /**
     * Get Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`. 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`. 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>`0`: No</li>
<li>`1`: Yes</li>

Default value: `0`.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public RebuildMediaTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTargetInfo(RebuildMediaTargetInfo source) {
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new RebuildMediaTargetVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new RebuildMediaTargetAudioStream(source.AudioStream);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}

