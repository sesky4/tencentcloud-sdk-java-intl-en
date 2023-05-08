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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedirectInfo extends AbstractModel{

    /**
    * Standard output redirection path
    */
    @SerializedName("StdoutRedirectPath")
    @Expose
    private String StdoutRedirectPath;

    /**
    * Standard error redirection path
    */
    @SerializedName("StderrRedirectPath")
    @Expose
    private String StderrRedirectPath;

    /**
    * Standard output redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
    */
    @SerializedName("StdoutRedirectFileName")
    @Expose
    private String StdoutRedirectFileName;

    /**
    * Standard error redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
    */
    @SerializedName("StderrRedirectFileName")
    @Expose
    private String StderrRedirectFileName;

    /**
     * Get Standard output redirection path 
     * @return StdoutRedirectPath Standard output redirection path
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * Set Standard output redirection path
     * @param StdoutRedirectPath Standard output redirection path
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * Get Standard error redirection path 
     * @return StderrRedirectPath Standard error redirection path
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * Set Standard error redirection path
     * @param StderrRedirectPath Standard error redirection path
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * Get Standard output redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}` 
     * @return StdoutRedirectFileName Standard output redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * Set Standard output redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     * @param StdoutRedirectFileName Standard output redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * Get Standard error redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}` 
     * @return StderrRedirectFileName Standard error redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * Set Standard error redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     * @param StderrRedirectFileName Standard error redirection file name, which supports three placeholders: `${BATCH_JOB_ID}`, `${BATCH_TASK_NAME}`, and `${BATCH_TASK_INSTANCE_INDEX}`
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
    }

    public RedirectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedirectInfo(RedirectInfo source) {
        if (source.StdoutRedirectPath != null) {
            this.StdoutRedirectPath = new String(source.StdoutRedirectPath);
        }
        if (source.StderrRedirectPath != null) {
            this.StderrRedirectPath = new String(source.StderrRedirectPath);
        }
        if (source.StdoutRedirectFileName != null) {
            this.StdoutRedirectFileName = new String(source.StdoutRedirectFileName);
        }
        if (source.StderrRedirectFileName != null) {
            this.StderrRedirectFileName = new String(source.StderrRedirectFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StdoutRedirectPath", this.StdoutRedirectPath);
        this.setParamSimple(map, prefix + "StderrRedirectPath", this.StderrRedirectPath);
        this.setParamSimple(map, prefix + "StdoutRedirectFileName", this.StdoutRedirectFileName);
        this.setParamSimple(map, prefix + "StderrRedirectFileName", this.StderrRedirectFileName);

    }
}

