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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupUrlResponse extends AbstractModel{

    /**
    * Public network download address (valid for six hours). This field will be disused soon.
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String [] DownloadUrl;

    /**
    * Private network download address (valid for six hours). This field will be disused soon.
    */
    @SerializedName("InnerDownloadUrl")
    @Expose
    private String [] InnerDownloadUrl;

    /**
    * Filename. This field will be disused soon.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Filenames")
    @Expose
    private String [] Filenames;

    /**
    * List of backup file information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupInfos")
    @Expose
    private BackupDownloadInfo [] BackupInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Public network download address (valid for six hours). This field will be disused soon. 
     * @return DownloadUrl Public network download address (valid for six hours). This field will be disused soon.
     */
    public String [] getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Public network download address (valid for six hours). This field will be disused soon.
     * @param DownloadUrl Public network download address (valid for six hours). This field will be disused soon.
     */
    public void setDownloadUrl(String [] DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get Private network download address (valid for six hours). This field will be disused soon. 
     * @return InnerDownloadUrl Private network download address (valid for six hours). This field will be disused soon.
     */
    public String [] getInnerDownloadUrl() {
        return this.InnerDownloadUrl;
    }

    /**
     * Set Private network download address (valid for six hours). This field will be disused soon.
     * @param InnerDownloadUrl Private network download address (valid for six hours). This field will be disused soon.
     */
    public void setInnerDownloadUrl(String [] InnerDownloadUrl) {
        this.InnerDownloadUrl = InnerDownloadUrl;
    }

    /**
     * Get Filename. This field will be disused soon.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Filenames Filename. This field will be disused soon.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFilenames() {
        return this.Filenames;
    }

    /**
     * Set Filename. This field will be disused soon.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Filenames Filename. This field will be disused soon.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilenames(String [] Filenames) {
        this.Filenames = Filenames;
    }

    /**
     * Get List of backup file information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupInfos List of backup file information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BackupDownloadInfo [] getBackupInfos() {
        return this.BackupInfos;
    }

    /**
     * Set List of backup file information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupInfos List of backup file information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupInfos(BackupDownloadInfo [] BackupInfos) {
        this.BackupInfos = BackupInfos;
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

    public DescribeBackupUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupUrlResponse(DescribeBackupUrlResponse source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String[source.DownloadUrl.length];
            for (int i = 0; i < source.DownloadUrl.length; i++) {
                this.DownloadUrl[i] = new String(source.DownloadUrl[i]);
            }
        }
        if (source.InnerDownloadUrl != null) {
            this.InnerDownloadUrl = new String[source.InnerDownloadUrl.length];
            for (int i = 0; i < source.InnerDownloadUrl.length; i++) {
                this.InnerDownloadUrl[i] = new String(source.InnerDownloadUrl[i]);
            }
        }
        if (source.Filenames != null) {
            this.Filenames = new String[source.Filenames.length];
            for (int i = 0; i < source.Filenames.length; i++) {
                this.Filenames[i] = new String(source.Filenames[i]);
            }
        }
        if (source.BackupInfos != null) {
            this.BackupInfos = new BackupDownloadInfo[source.BackupInfos.length];
            for (int i = 0; i < source.BackupInfos.length; i++) {
                this.BackupInfos[i] = new BackupDownloadInfo(source.BackupInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DownloadUrl.", this.DownloadUrl);
        this.setParamArraySimple(map, prefix + "InnerDownloadUrl.", this.InnerDownloadUrl);
        this.setParamArraySimple(map, prefix + "Filenames.", this.Filenames);
        this.setParamArrayObj(map, prefix + "BackupInfos.", this.BackupInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
