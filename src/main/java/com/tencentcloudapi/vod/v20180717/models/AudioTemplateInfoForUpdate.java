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

public class AudioTemplateInfoForUpdate extends AbstractModel{

    /**
    * The audio codec.
If `Container` parameter is `mp3`, the valid value is:
<li>libmp3lame</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>flac</li>
If `Container` is `m4a`, the valid values are:
<li>libfdk_aac</li>
<li>libmp3lame</li>
<li>ac3</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>libfdk_aac: more suitable for mp4</li>
<li>libmp3lame: More suitable for flv</li>
<li>mp2</li>
If `Container` is `hls`, the valid values are:
<li>libfdk_aac</li>
If `Format` is `HLS` or `MPEG-DASH`, the valid values are:
<li>libfdk_aac</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Audio channel system. Valid values:
<li>1: mono-channel</li>
<li>2: dual-channel</li>
<li>6: stereo</li>
You cannot set the sound channel as stereo for media files in container formats for audios (FLAC, OGG, MP3, M4A).
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
     * Get The audio codec.
If `Container` parameter is `mp3`, the valid value is:
<li>libmp3lame</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>flac</li>
If `Container` is `m4a`, the valid values are:
<li>libfdk_aac</li>
<li>libmp3lame</li>
<li>ac3</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>libfdk_aac: more suitable for mp4</li>
<li>libmp3lame: More suitable for flv</li>
<li>mp2</li>
If `Container` is `hls`, the valid values are:
<li>libfdk_aac</li>
If `Format` is `HLS` or `MPEG-DASH`, the valid values are:
<li>libfdk_aac</li> 
     * @return Codec The audio codec.
If `Container` parameter is `mp3`, the valid value is:
<li>libmp3lame</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>flac</li>
If `Container` is `m4a`, the valid values are:
<li>libfdk_aac</li>
<li>libmp3lame</li>
<li>ac3</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>libfdk_aac: more suitable for mp4</li>
<li>libmp3lame: More suitable for flv</li>
<li>mp2</li>
If `Container` is `hls`, the valid values are:
<li>libfdk_aac</li>
If `Format` is `HLS` or `MPEG-DASH`, the valid values are:
<li>libfdk_aac</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The audio codec.
If `Container` parameter is `mp3`, the valid value is:
<li>libmp3lame</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>flac</li>
If `Container` is `m4a`, the valid values are:
<li>libfdk_aac</li>
<li>libmp3lame</li>
<li>ac3</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>libfdk_aac: more suitable for mp4</li>
<li>libmp3lame: More suitable for flv</li>
<li>mp2</li>
If `Container` is `hls`, the valid values are:
<li>libfdk_aac</li>
If `Format` is `HLS` or `MPEG-DASH`, the valid values are:
<li>libfdk_aac</li>
     * @param Codec The audio codec.
If `Container` parameter is `mp3`, the valid value is:
<li>libmp3lame</li>
If `Container` is `ogg` or `flac`, the valid value is:
<li>flac</li>
If `Container` is `m4a`, the valid values are:
<li>libfdk_aac</li>
<li>libmp3lame</li>
<li>ac3</li>
If `Container` is `mp4` or `flv`, the valid values are:
<li>libfdk_aac: more suitable for mp4</li>
<li>libmp3lame: More suitable for flv</li>
<li>mp2</li>
If `Container` is `hls`, the valid values are:
<li>libfdk_aac</li>
If `Format` is `HLS` or `MPEG-DASH`, the valid values are:
<li>libfdk_aac</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio. 
     * @return Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     * @param Bitrate Audio stream bitrate in Kbps. Value range: 0 and [26, 256]. If the value is 0, the bitrate of the audio stream will be the same as that of the original audio.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz. 
     * @return SampleRate Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     * @param SampleRate Audio stream sample rate. Valid values:
<li>32,000</li>
<li>44,100</li>
<li>48,000</li>
In Hz.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Audio channel system. Valid values:
<li>1: mono-channel</li>
<li>2: dual-channel</li>
<li>6: stereo</li>
You cannot set the sound channel as stereo for media files in container formats for audios (FLAC, OGG, MP3, M4A). 
     * @return AudioChannel Audio channel system. Valid values:
<li>1: mono-channel</li>
<li>2: dual-channel</li>
<li>6: stereo</li>
You cannot set the sound channel as stereo for media files in container formats for audios (FLAC, OGG, MP3, M4A).
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set Audio channel system. Valid values:
<li>1: mono-channel</li>
<li>2: dual-channel</li>
<li>6: stereo</li>
You cannot set the sound channel as stereo for media files in container formats for audios (FLAC, OGG, MP3, M4A).
     * @param AudioChannel Audio channel system. Valid values:
<li>1: mono-channel</li>
<li>2: dual-channel</li>
<li>6: stereo</li>
You cannot set the sound channel as stereo for media files in container formats for audios (FLAC, OGG, MP3, M4A).
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    public AudioTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTemplateInfoForUpdate(AudioTemplateInfoForUpdate source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);

    }
}

