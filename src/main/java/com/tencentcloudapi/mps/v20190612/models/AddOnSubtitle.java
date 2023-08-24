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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOnSubtitle extends AbstractModel{

    /**
    * The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: u200dEmbed EA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The subtitle file.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Subtitle")
    @Expose
    private MediaInputInfo Subtitle;

    /**
     * Get The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: u200dEmbed EA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Type The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: u200dEmbed EA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: u200dEmbed EA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Type The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: u200dEmbed EA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The subtitle file.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Subtitle The subtitle file.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public MediaInputInfo getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set The subtitle file.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Subtitle The subtitle file.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setSubtitle(MediaInputInfo Subtitle) {
        this.Subtitle = Subtitle;
    }

    public AddOnSubtitle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnSubtitle(AddOnSubtitle source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new MediaInputInfo(source.Subtitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);

    }
}

