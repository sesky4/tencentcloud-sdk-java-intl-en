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

public class GetFaceIdResultIntlResponse extends AbstractModel{

    /**
    * The return code of the verification result.
0: Succeeded.
1001: System error.
1004: Liveness detection and face comparison failed.
2004: The image passed in is too large or too small.
2012: Several faces were detected.
2013: No face was detected, or the face detected was incomplete.
2014: The image resolution is too low or the quality does not meet the requirements.
2015: Face comparison failed.
2016: The similarity did not reach the standard passing threshold.
-999: The verification process wasn't finished.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * The description of the verification result.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The best frame screenshot (in Base64) obtained during the verification.
    */
    @SerializedName("BestFrame")
    @Expose
    private String BestFrame;

    /**
    * The video file (Base64) for verification.
    */
    @SerializedName("Video")
    @Expose
    private String Video;

    /**
    * The similarity, with a value range of 0-100. A greater value indicates higher similarity. This parameter is returned only in the `compare` (liveness detection and face comparison) mode.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * The pass-through parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The return code of the verification result.
0: Succeeded.
1001: System error.
1004: Liveness detection and face comparison failed.
2004: The image passed in is too large or too small.
2012: Several faces were detected.
2013: No face was detected, or the face detected was incomplete.
2014: The image resolution is too low or the quality does not meet the requirements.
2015: Face comparison failed.
2016: The similarity did not reach the standard passing threshold.
-999: The verification process wasn't finished. 
     * @return Result The return code of the verification result.
0: Succeeded.
1001: System error.
1004: Liveness detection and face comparison failed.
2004: The image passed in is too large or too small.
2012: Several faces were detected.
2013: No face was detected, or the face detected was incomplete.
2014: The image resolution is too low or the quality does not meet the requirements.
2015: Face comparison failed.
2016: The similarity did not reach the standard passing threshold.
-999: The verification process wasn't finished.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set The return code of the verification result.
0: Succeeded.
1001: System error.
1004: Liveness detection and face comparison failed.
2004: The image passed in is too large or too small.
2012: Several faces were detected.
2013: No face was detected, or the face detected was incomplete.
2014: The image resolution is too low or the quality does not meet the requirements.
2015: Face comparison failed.
2016: The similarity did not reach the standard passing threshold.
-999: The verification process wasn't finished.
     * @param Result The return code of the verification result.
0: Succeeded.
1001: System error.
1004: Liveness detection and face comparison failed.
2004: The image passed in is too large or too small.
2012: Several faces were detected.
2013: No face was detected, or the face detected was incomplete.
2014: The image resolution is too low or the quality does not meet the requirements.
2015: Face comparison failed.
2016: The similarity did not reach the standard passing threshold.
-999: The verification process wasn't finished.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get The description of the verification result. 
     * @return Description The description of the verification result.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of the verification result.
     * @param Description The description of the verification result.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The best frame screenshot (in Base64) obtained during the verification. 
     * @return BestFrame The best frame screenshot (in Base64) obtained during the verification.
     */
    public String getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set The best frame screenshot (in Base64) obtained during the verification.
     * @param BestFrame The best frame screenshot (in Base64) obtained during the verification.
     */
    public void setBestFrame(String BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get The video file (Base64) for verification. 
     * @return Video The video file (Base64) for verification.
     */
    public String getVideo() {
        return this.Video;
    }

    /**
     * Set The video file (Base64) for verification.
     * @param Video The video file (Base64) for verification.
     */
    public void setVideo(String Video) {
        this.Video = Video;
    }

    /**
     * Get The similarity, with a value range of 0-100. A greater value indicates higher similarity. This parameter is returned only in the `compare` (liveness detection and face comparison) mode.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Similarity The similarity, with a value range of 0-100. A greater value indicates higher similarity. This parameter is returned only in the `compare` (liveness detection and face comparison) mode.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set The similarity, with a value range of 0-100. A greater value indicates higher similarity. This parameter is returned only in the `compare` (liveness detection and face comparison) mode.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Similarity The similarity, with a value range of 0-100. A greater value indicates higher similarity. This parameter is returned only in the `compare` (liveness detection and face comparison) mode.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get The pass-through parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Extra The pass-through parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set The pass-through parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Extra The pass-through parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
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

    public GetFaceIdResultIntlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdResultIntlResponse(GetFaceIdResultIntlResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new String(source.BestFrame);
        }
        if (source.Video != null) {
            this.Video = new String(source.Video);
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
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
        this.setParamSimple(map, prefix + "BestFrame", this.BestFrame);
        this.setParamSimple(map, prefix + "Video", this.Video);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
