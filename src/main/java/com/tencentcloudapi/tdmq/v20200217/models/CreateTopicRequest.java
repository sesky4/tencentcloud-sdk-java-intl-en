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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel{

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name, which can contain up to 64 letters, digits, hyphens, and underscores.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 0: non-partitioned topic; other values: number of partitions in the partitioned topic (up to 128).
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue.
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name, which can contain up to 64 letters, digits, hyphens, and underscores. 
     * @return TopicName Topic name, which can contain up to 64 letters, digits, hyphens, and underscores.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name, which can contain up to 64 letters, digits, hyphens, and underscores.
     * @param TopicName Topic name, which can contain up to 64 letters, digits, hyphens, and underscores.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 0: non-partitioned topic; other values: number of partitions in the partitioned topic (up to 128). 
     * @return Partitions 0: non-partitioned topic; other values: number of partitions in the partitioned topic (up to 128).
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 0: non-partitioned topic; other values: number of partitions in the partitioned topic (up to 128).
     * @param Partitions 0: non-partitioned topic; other values: number of partitions in the partitioned topic (up to 128).
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue. 
     * @return TopicType 0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue.
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue.
     * @param TopicType 0: general message;
1: globally sequential message;
2: partitionally sequential message;
3: retry letter queue;
4: dead letter queue.
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Remarks (up to 128 characters). 
     * @return Remark Remarks (up to 128 characters).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
     * @param Remark Remarks (up to 128 characters).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Pulsar cluster ID 
     * @return ClusterId Pulsar cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar cluster ID
     * @param ClusterId Pulsar cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}
