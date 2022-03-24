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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLiveTranscodeDetailResponse extends AbstractModel{

    /**
    * A list of the transcoding information.
    */
    @SerializedName("Infos")
    @Expose
    private DescribeTranscodeDetailInfo [] Infos;

    /**
    * The number of the current page.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * The number of records per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The total number of records.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * The total number of pages.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get A list of the transcoding information. 
     * @return Infos A list of the transcoding information.
     */
    public DescribeTranscodeDetailInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set A list of the transcoding information.
     * @param Infos A list of the transcoding information.
     */
    public void setInfos(DescribeTranscodeDetailInfo [] Infos) {
        this.Infos = Infos;
    }

    /**
     * Get The number of the current page. 
     * @return PageNum The number of the current page.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set The number of the current page.
     * @param PageNum The number of the current page.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get The number of records per page. 
     * @return PageSize The number of records per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of records per page.
     * @param PageSize The number of records per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get The total number of records. 
     * @return TotalNum The total number of records.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set The total number of records.
     * @param TotalNum The total number of records.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get The total number of pages. 
     * @return TotalPage The total number of pages.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set The total number of pages.
     * @param TotalPage The total number of pages.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
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

    public DescribeStreamLiveTranscodeDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLiveTranscodeDetailResponse(DescribeStreamLiveTranscodeDetailResponse source) {
        if (source.Infos != null) {
            this.Infos = new DescribeTranscodeDetailInfo[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new DescribeTranscodeDetailInfo(source.Infos[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

