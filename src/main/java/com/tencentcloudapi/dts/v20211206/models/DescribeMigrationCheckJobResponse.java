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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationCheckJobResponse extends AbstractModel{

    /**
    * Check task execution status. Valid values: `notStarted`, `running`, `failed`, `success`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Check task result message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BriefMsg")
    @Expose
    private String BriefMsg;

    /**
    * Check step
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepInfo")
    @Expose
    private CheckStep [] StepInfo;

    /**
    * Check result. Valid values: `checkPass`, `checkNotPass`.
    */
    @SerializedName("CheckFlag")
    @Expose
    private String CheckFlag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Check task execution status. Valid values: `notStarted`, `running`, `failed`, `success`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Check task execution status. Valid values: `notStarted`, `running`, `failed`, `success`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Check task execution status. Valid values: `notStarted`, `running`, `failed`, `success`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Check task execution status. Valid values: `notStarted`, `running`, `failed`, `success`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Check task result message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BriefMsg Check task result message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBriefMsg() {
        return this.BriefMsg;
    }

    /**
     * Set Check task result message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BriefMsg Check task result message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBriefMsg(String BriefMsg) {
        this.BriefMsg = BriefMsg;
    }

    /**
     * Get Check step
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepInfo Check step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CheckStep [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set Check step
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepInfo Check step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepInfo(CheckStep [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Get Check result. Valid values: `checkPass`, `checkNotPass`. 
     * @return CheckFlag Check result. Valid values: `checkPass`, `checkNotPass`.
     */
    public String getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set Check result. Valid values: `checkPass`, `checkNotPass`.
     * @param CheckFlag Check result. Valid values: `checkPass`, `checkNotPass`.
     */
    public void setCheckFlag(String CheckFlag) {
        this.CheckFlag = CheckFlag;
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

    public DescribeMigrationCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationCheckJobResponse(DescribeMigrationCheckJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BriefMsg != null) {
            this.BriefMsg = new String(source.BriefMsg);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new CheckStep[source.StepInfo.length];
            for (int i = 0; i < source.StepInfo.length; i++) {
                this.StepInfo[i] = new CheckStep(source.StepInfo[i]);
            }
        }
        if (source.CheckFlag != null) {
            this.CheckFlag = new String(source.CheckFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BriefMsg", this.BriefMsg);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

