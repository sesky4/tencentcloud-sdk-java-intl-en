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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveAcRuleResponse extends AbstractModel{

    /**
    * Returns the UUID of the deleted policy after the deletion is successful
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * success: operation successful; failed: operation failed
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returns the UUID of the deleted policy after the deletion is successful 
     * @return RuleUuid Returns the UUID of the deleted policy after the deletion is successful
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set Returns the UUID of the deleted policy after the deletion is successful
     * @param RuleUuid Returns the UUID of the deleted policy after the deletion is successful
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ReturnCode 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     * @param ReturnCode 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get success: operation successful; failed: operation failed
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ReturnMsg success: operation successful; failed: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set success: operation successful; failed: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     * @param ReturnMsg success: operation successful; failed: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public RemoveAcRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveAcRuleResponse(RemoveAcRuleResponse source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

