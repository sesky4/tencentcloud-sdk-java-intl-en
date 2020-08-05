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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamLayout extends AbstractModel{

    /**
    * Stream layout configuration
    */
    @SerializedName("LayoutParams")
    @Expose
    private LayoutParams LayoutParams;

    /**
    * Video stream ID
Description of possible stream ID values:
1. tic_record_user: the current picture is used to display the whiteboard video stream.
2. tic_substream: the current picture is used to display the auxiliary video stream.
3. Specific user ID: the current picture is used to display the video stream of a specific user.
4. Left empty: the current picture is vacant for new video stream.
    */
    @SerializedName("InputStreamId")
    @Expose
    private String InputStreamId;

    /**
    * Background color, which is black by default. Its format is RGB, for example, "#FF0000" for the red color.
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
     * Get Stream layout configuration 
     * @return LayoutParams Stream layout configuration
     */
    public LayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set Stream layout configuration
     * @param LayoutParams Stream layout configuration
     */
    public void setLayoutParams(LayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get Video stream ID
Description of possible stream ID values:
1. tic_record_user: the current picture is used to display the whiteboard video stream.
2. tic_substream: the current picture is used to display the auxiliary video stream.
3. Specific user ID: the current picture is used to display the video stream of a specific user.
4. Left empty: the current picture is vacant for new video stream. 
     * @return InputStreamId Video stream ID
Description of possible stream ID values:
1. tic_record_user: the current picture is used to display the whiteboard video stream.
2. tic_substream: the current picture is used to display the auxiliary video stream.
3. Specific user ID: the current picture is used to display the video stream of a specific user.
4. Left empty: the current picture is vacant for new video stream.
     */
    public String getInputStreamId() {
        return this.InputStreamId;
    }

    /**
     * Set Video stream ID
Description of possible stream ID values:
1. tic_record_user: the current picture is used to display the whiteboard video stream.
2. tic_substream: the current picture is used to display the auxiliary video stream.
3. Specific user ID: the current picture is used to display the video stream of a specific user.
4. Left empty: the current picture is vacant for new video stream.
     * @param InputStreamId Video stream ID
Description of possible stream ID values:
1. tic_record_user: the current picture is used to display the whiteboard video stream.
2. tic_substream: the current picture is used to display the auxiliary video stream.
3. Specific user ID: the current picture is used to display the video stream of a specific user.
4. Left empty: the current picture is vacant for new video stream.
     */
    public void setInputStreamId(String InputStreamId) {
        this.InputStreamId = InputStreamId;
    }

    /**
     * Get Background color, which is black by default. Its format is RGB, for example, "#FF0000" for the red color. 
     * @return BackgroundColor Background color, which is black by default. Its format is RGB, for example, "#FF0000" for the red color.
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Background color, which is black by default. Its format is RGB, for example, "#FF0000" for the red color.
     * @param BackgroundColor Background color, which is black by default. Its format is RGB, for example, "#FF0000" for the red color.
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamSimple(map, prefix + "InputStreamId", this.InputStreamId);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);

    }
}

