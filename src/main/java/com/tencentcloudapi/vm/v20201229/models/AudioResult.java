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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResult extends AbstractModel{

    /**
    * This field is used to return whether the moderated content hit the moderation model. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the text information generated by recognizing an audio file with ASR. Audio files of up to **5 hours** can be recognized. If this limit is exceeded, an error will be reported by the API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * This field is used to return the URL where audio segments are stored, which is valid for 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * This field is used to return the length of an audio file in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * This field is used to return the additional information (Extra) in the input parameters. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * This field is used to return the detailed moderation result of the text generated by recognizing an audio file with ASR. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TextResults")
    @Expose
    private AudioResultDetailTextResult [] TextResults;

    /**
    * This field is used to return the detailed moan detection result of an audio file. For the specific result, see the detailed description of the `AudioResultDetailMoanResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MoanResults")
    @Expose
    private AudioResultDetailMoanResult [] MoanResults;

    /**
    * This field is used to return the detailed minor language detection result of an audio. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LanguageResults")
    @Expose
    private AudioResultDetailLanguageResult [] LanguageResults;

    /**
    * This field is used to return a subtag under the current tag (Lable).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get This field is used to return whether the moderated content hit the moderation model. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HitFlag This field is used to return whether the moderated content hit the moderation model. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set This field is used to return whether the moderated content hit the moderation model. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HitFlag This field is used to return whether the moderated content hit the moderation model. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Suggestion This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the text information generated by recognizing an audio file with ASR. Audio files of up to **5 hours** can be recognized. If this limit is exceeded, an error will be reported by the API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Text This field is used to return the text information generated by recognizing an audio file with ASR. Audio files of up to **5 hours** can be recognized. If this limit is exceeded, an error will be reported by the API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set This field is used to return the text information generated by recognizing an audio file with ASR. Audio files of up to **5 hours** can be recognized. If this limit is exceeded, an error will be reported by the API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Text This field is used to return the text information generated by recognizing an audio file with ASR. Audio files of up to **5 hours** can be recognized. If this limit is exceeded, an error will be reported by the API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get This field is used to return the URL where audio segments are stored, which is valid for 1 day.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url This field is used to return the URL where audio segments are stored, which is valid for 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set This field is used to return the URL where audio segments are stored, which is valid for 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url This field is used to return the URL where audio segments are stored, which is valid for 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get This field is used to return the length of an audio file in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Duration This field is used to return the length of an audio file in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set This field is used to return the length of an audio file in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Duration This field is used to return the length of an audio file in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get This field is used to return the additional information (Extra) in the input parameters. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Extra This field is used to return the additional information (Extra) in the input parameters. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set This field is used to return the additional information (Extra) in the input parameters. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Extra This field is used to return the additional information (Extra) in the input parameters. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get This field is used to return the detailed moderation result of the text generated by recognizing an audio file with ASR. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TextResults This field is used to return the detailed moderation result of the text generated by recognizing an audio file with ASR. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioResultDetailTextResult [] getTextResults() {
        return this.TextResults;
    }

    /**
     * Set This field is used to return the detailed moderation result of the text generated by recognizing an audio file with ASR. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TextResults This field is used to return the detailed moderation result of the text generated by recognizing an audio file with ASR. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTextResults(AudioResultDetailTextResult [] TextResults) {
        this.TextResults = TextResults;
    }

    /**
     * Get This field is used to return the detailed moan detection result of an audio file. For the specific result, see the detailed description of the `AudioResultDetailMoanResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MoanResults This field is used to return the detailed moan detection result of an audio file. For the specific result, see the detailed description of the `AudioResultDetailMoanResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioResultDetailMoanResult [] getMoanResults() {
        return this.MoanResults;
    }

    /**
     * Set This field is used to return the detailed moan detection result of an audio file. For the specific result, see the detailed description of the `AudioResultDetailMoanResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MoanResults This field is used to return the detailed moan detection result of an audio file. For the specific result, see the detailed description of the `AudioResultDetailMoanResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMoanResults(AudioResultDetailMoanResult [] MoanResults) {
        this.MoanResults = MoanResults;
    }

    /**
     * Get This field is used to return the detailed minor language detection result of an audio. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LanguageResults This field is used to return the detailed minor language detection result of an audio. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioResultDetailLanguageResult [] getLanguageResults() {
        return this.LanguageResults;
    }

    /**
     * Set This field is used to return the detailed minor language detection result of an audio. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LanguageResults This field is used to return the detailed minor language detection result of an audio. For the specific result, see the detailed description of the `AudioResultDetailLanguageResult` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLanguageResults(AudioResultDetailLanguageResult [] LanguageResults) {
        this.LanguageResults = LanguageResults;
    }

    /**
     * Get This field is used to return a subtag under the current tag (Lable).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubLabel This field is used to return a subtag under the current tag (Lable).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return a subtag under the current tag (Lable).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubLabel This field is used to return a subtag under the current tag (Lable).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public AudioResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResult(AudioResult source) {
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.TextResults != null) {
            this.TextResults = new AudioResultDetailTextResult[source.TextResults.length];
            for (int i = 0; i < source.TextResults.length; i++) {
                this.TextResults[i] = new AudioResultDetailTextResult(source.TextResults[i]);
            }
        }
        if (source.MoanResults != null) {
            this.MoanResults = new AudioResultDetailMoanResult[source.MoanResults.length];
            for (int i = 0; i < source.MoanResults.length; i++) {
                this.MoanResults[i] = new AudioResultDetailMoanResult(source.MoanResults[i]);
            }
        }
        if (source.LanguageResults != null) {
            this.LanguageResults = new AudioResultDetailLanguageResult[source.LanguageResults.length];
            for (int i = 0; i < source.LanguageResults.length; i++) {
                this.LanguageResults[i] = new AudioResultDetailLanguageResult(source.LanguageResults[i]);
            }
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamArrayObj(map, prefix + "TextResults.", this.TextResults);
        this.setParamArrayObj(map, prefix + "MoanResults.", this.MoanResults);
        this.setParamArrayObj(map, prefix + "LanguageResults.", this.LanguageResults);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}
