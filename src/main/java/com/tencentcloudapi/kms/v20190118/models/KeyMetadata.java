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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyMetadata extends AbstractModel{

    /**
    * 
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * CMK purpose. Valid values: ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * 
    */
    @SerializedName("KeyRotationEnabled")
    @Expose
    private Boolean KeyRotationEnabled;

    /**
    * 
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 
    */
    @SerializedName("NextRotateTime")
    @Expose
    private Long NextRotateTime;

    /**
    * 
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get  
     * @return KeyId 
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 
     * @param KeyId 
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get  
     * @return Alias 
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 
     * @param Alias 
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived. 
     * @return KeyState CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
     * @param KeyState CMK status. Valid values: Enabled, Disabled, PendingDelete, PendingImport, Archived.
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get CMK purpose. Valid values: ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2 
     * @return KeyUsage CMK purpose. Valid values: ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set CMK purpose. Valid values: ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2
     * @param KeyUsage CMK purpose. Valid values: ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get CMK type. 2: FIPS-compliant; 4: SM-CRYPTO 
     * @return Type CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
     * @param Type CMK type. 2: FIPS-compliant; 4: SM-CRYPTO
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return CreatorUin 
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 
     * @param CreatorUin 
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get  
     * @return KeyRotationEnabled 
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * Set 
     * @param KeyRotationEnabled 
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * Get  
     * @return Owner 
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 
     * @param Owner 
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get  
     * @return NextRotateTime 
     */
    public Long getNextRotateTime() {
        return this.NextRotateTime;
    }

    /**
     * Set 
     * @param NextRotateTime 
     */
    public void setNextRotateTime(Long NextRotateTime) {
        this.NextRotateTime = NextRotateTime;
    }

    /**
     * Get  
     * @return DeletionDate 
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set 
     * @param DeletionDate 
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Origin CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Origin CMK key material type. TENCENT_KMS: created by KMS; EXTERNAL: imported by user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidTo It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidTo It's valid when `Origin` is `EXTERNAL`, indicating the expiration date of key material. 0 means valid forever.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get Resource ID in the format of `creatorUin/$creatorUin/$keyId`. 
     * @return ResourceId Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     * @param ResourceId Resource ID in the format of `creatorUin/$creatorUin/$keyId`.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "KeyRotationEnabled", this.KeyRotationEnabled);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "NextRotateTime", this.NextRotateTime);
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

