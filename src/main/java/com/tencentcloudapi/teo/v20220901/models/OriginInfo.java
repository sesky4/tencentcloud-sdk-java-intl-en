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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginInfo extends AbstractModel {

    /**
    * The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`ORIGIN_GROUP`: Origin group</li>
<li>`AWS_S3`: AWS S3 bucket address</li>
<li>`LB`: Tencent Cloud CLB instance</li>
<li>`SPACE`: EdgeOne Shield Space</li>  
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * The origin address. Enter the origin group ID if `OriginType=ORIGIN_GROUP`.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * ID of the backup origin group (valid when `OriginType=ORIGIN_GROUP`). If it’s not specified, it indicates not to use backup origins.
    */
    @SerializedName("BackupOrigin")
    @Expose
    private String BackupOrigin;

    /**
    * Whether to allow access to the private object storage origin (valid when `OriginType=COS/AWS_S3`). Values:
u200c<li>`on`: Enable private authentication.</li>
<li>`off`: (Default) Disable private authentication.</li>
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * The private authentication parameters. This field is valid when `PrivateAccess=on`.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
     * Get The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`ORIGIN_GROUP`: Origin group</li>
<li>`AWS_S3`: AWS S3 bucket address</li>
<li>`LB`: Tencent Cloud CLB instance</li>
<li>`SPACE`: EdgeOne Shield Space</li>   
     * @return OriginType The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`ORIGIN_GROUP`: Origin group</li>
<li>`AWS_S3`: AWS S3 bucket address</li>
<li>`LB`: Tencent Cloud CLB instance</li>
<li>`SPACE`: EdgeOne Shield Space</li>  
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`ORIGIN_GROUP`: Origin group</li>
<li>`AWS_S3`: AWS S3 bucket address</li>
<li>`LB`: Tencent Cloud CLB instance</li>
<li>`SPACE`: EdgeOne Shield Space</li>  
     * @param OriginType The origin type. Values:
<li>`IP_DOMAIN`: IPv4/IPv6 address or domain name</li>
<li>`COS`: COS bucket address</li>
<li>`ORIGIN_GROUP`: Origin group</li>
<li>`AWS_S3`: AWS S3 bucket address</li>
<li>`LB`: Tencent Cloud CLB instance</li>
<li>`SPACE`: EdgeOne Shield Space</li>  
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get The origin address. Enter the origin group ID if `OriginType=ORIGIN_GROUP`. 
     * @return Origin The origin address. Enter the origin group ID if `OriginType=ORIGIN_GROUP`.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set The origin address. Enter the origin group ID if `OriginType=ORIGIN_GROUP`.
     * @param Origin The origin address. Enter the origin group ID if `OriginType=ORIGIN_GROUP`.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get ID of the backup origin group (valid when `OriginType=ORIGIN_GROUP`). If it’s not specified, it indicates not to use backup origins. 
     * @return BackupOrigin ID of the backup origin group (valid when `OriginType=ORIGIN_GROUP`). If it’s not specified, it indicates not to use backup origins.
     */
    public String getBackupOrigin() {
        return this.BackupOrigin;
    }

    /**
     * Set ID of the backup origin group (valid when `OriginType=ORIGIN_GROUP`). If it’s not specified, it indicates not to use backup origins.
     * @param BackupOrigin ID of the backup origin group (valid when `OriginType=ORIGIN_GROUP`). If it’s not specified, it indicates not to use backup origins.
     */
    public void setBackupOrigin(String BackupOrigin) {
        this.BackupOrigin = BackupOrigin;
    }

    /**
     * Get Whether to allow access to the private object storage origin (valid when `OriginType=COS/AWS_S3`). Values:
u200c<li>`on`: Enable private authentication.</li>
<li>`off`: (Default) Disable private authentication.</li> 
     * @return PrivateAccess Whether to allow access to the private object storage origin (valid when `OriginType=COS/AWS_S3`). Values:
u200c<li>`on`: Enable private authentication.</li>
<li>`off`: (Default) Disable private authentication.</li>
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Whether to allow access to the private object storage origin (valid when `OriginType=COS/AWS_S3`). Values:
u200c<li>`on`: Enable private authentication.</li>
<li>`off`: (Default) Disable private authentication.</li>
     * @param PrivateAccess Whether to allow access to the private object storage origin (valid when `OriginType=COS/AWS_S3`). Values:
u200c<li>`on`: Enable private authentication.</li>
<li>`off`: (Default) Disable private authentication.</li>
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get The private authentication parameters. This field is valid when `PrivateAccess=on`. 
     * @return PrivateParameters The private authentication parameters. This field is valid when `PrivateAccess=on`.
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set The private authentication parameters. This field is valid when `PrivateAccess=on`.
     * @param PrivateParameters The private authentication parameters. This field is valid when `PrivateAccess=on`.
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public OriginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginInfo(OriginInfo source) {
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.BackupOrigin != null) {
            this.BackupOrigin = new String(source.BackupOrigin);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new PrivateParameter[source.PrivateParameters.length];
            for (int i = 0; i < source.PrivateParameters.length; i++) {
                this.PrivateParameters[i] = new PrivateParameter(source.PrivateParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "BackupOrigin", this.BackupOrigin);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

