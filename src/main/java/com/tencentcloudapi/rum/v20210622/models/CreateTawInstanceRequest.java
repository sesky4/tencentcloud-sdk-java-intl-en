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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTawInstanceRequest extends AbstractModel{

    /**
    * Region ID (at least greater than 0)
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * Billing mode (1: trial; 2: prepaid; 3: postpaid)
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Data retention period (at least greater than 0)
    */
    @SerializedName("DataRetentionDays")
    @Expose
    private Long DataRetentionDays;

    /**
    * Instance name (up to 255 bytes)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Instance description (up to 1,024 bytes)
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * Number of data entries reported per day
    */
    @SerializedName("CountNum")
    @Expose
    private String CountNum;

    /**
    * Billing for data storage
    */
    @SerializedName("PeriodRetain")
    @Expose
    private String PeriodRetain;

    /**
     * Get Region ID (at least greater than 0) 
     * @return AreaId Region ID (at least greater than 0)
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set Region ID (at least greater than 0)
     * @param AreaId Region ID (at least greater than 0)
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get Billing mode (1: trial; 2: prepaid; 3: postpaid) 
     * @return ChargeType Billing mode (1: trial; 2: prepaid; 3: postpaid)
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing mode (1: trial; 2: prepaid; 3: postpaid)
     * @param ChargeType Billing mode (1: trial; 2: prepaid; 3: postpaid)
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Data retention period (at least greater than 0) 
     * @return DataRetentionDays Data retention period (at least greater than 0)
     */
    public Long getDataRetentionDays() {
        return this.DataRetentionDays;
    }

    /**
     * Set Data retention period (at least greater than 0)
     * @param DataRetentionDays Data retention period (at least greater than 0)
     */
    public void setDataRetentionDays(Long DataRetentionDays) {
        this.DataRetentionDays = DataRetentionDays;
    }

    /**
     * Get Instance name (up to 255 bytes) 
     * @return InstanceName Instance name (up to 255 bytes)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name (up to 255 bytes)
     * @param InstanceName Instance name (up to 255 bytes)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance description (up to 1,024 bytes) 
     * @return InstanceDesc Instance description (up to 1,024 bytes)
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set Instance description (up to 1,024 bytes)
     * @param InstanceDesc Instance description (up to 1,024 bytes)
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get Number of data entries reported per day 
     * @return CountNum Number of data entries reported per day
     */
    public String getCountNum() {
        return this.CountNum;
    }

    /**
     * Set Number of data entries reported per day
     * @param CountNum Number of data entries reported per day
     */
    public void setCountNum(String CountNum) {
        this.CountNum = CountNum;
    }

    /**
     * Get Billing for data storage 
     * @return PeriodRetain Billing for data storage
     */
    public String getPeriodRetain() {
        return this.PeriodRetain;
    }

    /**
     * Set Billing for data storage
     * @param PeriodRetain Billing for data storage
     */
    public void setPeriodRetain(String PeriodRetain) {
        this.PeriodRetain = PeriodRetain;
    }

    public CreateTawInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTawInstanceRequest(CreateTawInstanceRequest source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.DataRetentionDays != null) {
            this.DataRetentionDays = new Long(source.DataRetentionDays);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.CountNum != null) {
            this.CountNum = new String(source.CountNum);
        }
        if (source.PeriodRetain != null) {
            this.PeriodRetain = new String(source.PeriodRetain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "DataRetentionDays", this.DataRetentionDays);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "CountNum", this.CountNum);
        this.setParamSimple(map, prefix + "PeriodRetain", this.PeriodRetain);

    }
}
