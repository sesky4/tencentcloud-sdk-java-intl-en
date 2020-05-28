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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePolicyRequest extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy Name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Policy documentation, for example: `{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}`, where `principal` is used to specify the service that is authorized to use the role. For more information about this parameter, see **RoleInfo** under **Output Parameters** in the [GetRole](https://cloud.tencent.com/document/product/598/36221).
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * Preset policy remark
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy Name 
     * @return PolicyName Policy Name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy Name
     * @param PolicyName Policy Name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy description 
     * @return Description Policy description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
     * @param Description Policy description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Policy documentation, for example: `{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}`, where `principal` is used to specify the service that is authorized to use the role. For more information about this parameter, see **RoleInfo** under **Output Parameters** in the [GetRole](https://cloud.tencent.com/document/product/598/36221). 
     * @return PolicyDocument Policy documentation, for example: `{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}`, where `principal` is used to specify the service that is authorized to use the role. For more information about this parameter, see **RoleInfo** under **Output Parameters** in the [GetRole](https://cloud.tencent.com/document/product/598/36221).
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set Policy documentation, for example: `{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}`, where `principal` is used to specify the service that is authorized to use the role. For more information about this parameter, see **RoleInfo** under **Output Parameters** in the [GetRole](https://cloud.tencent.com/document/product/598/36221).
     * @param PolicyDocument Policy documentation, for example: `{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}`, where `principal` is used to specify the service that is authorized to use the role. For more information about this parameter, see **RoleInfo** under **Output Parameters** in the [GetRole](https://cloud.tencent.com/document/product/598/36221).
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get Preset policy remark 
     * @return Alias Preset policy remark
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Preset policy remark
     * @param Alias Preset policy remark
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

