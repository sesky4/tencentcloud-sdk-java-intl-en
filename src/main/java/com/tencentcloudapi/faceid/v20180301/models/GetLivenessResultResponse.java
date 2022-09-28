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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLivenessResultResponse extends AbstractModel{

    /**
    * The final verification result.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * The description of the final verification result.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The face screenshot.
    */
    @SerializedName("BestFrame")
    @Expose
    private FileInfo BestFrame;

    /**
    * The video for the detection.
    */
    @SerializedName("Video")
    @Expose
    private FileInfo Video;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The final verification result. 
     * @return Result The final verification result.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set The final verification result.
     * @param Result The final verification result.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get The description of the final verification result. 
     * @return Description The description of the final verification result.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of the final verification result.
     * @param Description The description of the final verification result.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The face screenshot. 
     * @return BestFrame The face screenshot.
     */
    public FileInfo getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set The face screenshot.
     * @param BestFrame The face screenshot.
     */
    public void setBestFrame(FileInfo BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get The video for the detection. 
     * @return Video The video for the detection.
     */
    public FileInfo getVideo() {
        return this.Video;
    }

    /**
     * Set The video for the detection.
     * @param Video The video for the detection.
     */
    public void setVideo(FileInfo Video) {
        this.Video = Video;
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

    public GetLivenessResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLivenessResultResponse(GetLivenessResultResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new FileInfo(source.BestFrame);
        }
        if (source.Video != null) {
            this.Video = new FileInfo(source.Video);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
