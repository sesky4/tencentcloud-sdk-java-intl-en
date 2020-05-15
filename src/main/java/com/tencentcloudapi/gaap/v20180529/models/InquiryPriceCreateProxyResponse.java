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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateProxyResponse extends AbstractModel{

    /**
    * Basic price of connection in USD/day.
    */
    @SerializedName("ProxyDailyPrice")
    @Expose
    private Float ProxyDailyPrice;

    /**
    * Tiered price of connection bandwidth.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthUnitPrice")
    @Expose
    private BandwidthPriceGradient [] BandwidthUnitPrice;

    /**
    * Discounted basic price of connection in USD/day.
    */
    @SerializedName("DiscountProxyDailyPrice")
    @Expose
    private Float DiscountProxyDailyPrice;

    /**
    * Currency, which supports CNY, USD, etc.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowUnitPrice")
    @Expose
    private Float FlowUnitPrice;

    /**
    * Discounted connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountFlowUnitPrice")
    @Expose
    private Float DiscountFlowUnitPrice;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Basic price of connection in USD/day. 
     * @return ProxyDailyPrice Basic price of connection in USD/day.
     */
    public Float getProxyDailyPrice() {
        return this.ProxyDailyPrice;
    }

    /**
     * Set Basic price of connection in USD/day.
     * @param ProxyDailyPrice Basic price of connection in USD/day.
     */
    public void setProxyDailyPrice(Float ProxyDailyPrice) {
        this.ProxyDailyPrice = ProxyDailyPrice;
    }

    /**
     * Get Tiered price of connection bandwidth.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthUnitPrice Tiered price of connection bandwidth.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public BandwidthPriceGradient [] getBandwidthUnitPrice() {
        return this.BandwidthUnitPrice;
    }

    /**
     * Set Tiered price of connection bandwidth.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BandwidthUnitPrice Tiered price of connection bandwidth.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthUnitPrice(BandwidthPriceGradient [] BandwidthUnitPrice) {
        this.BandwidthUnitPrice = BandwidthUnitPrice;
    }

    /**
     * Get Discounted basic price of connection in USD/day. 
     * @return DiscountProxyDailyPrice Discounted basic price of connection in USD/day.
     */
    public Float getDiscountProxyDailyPrice() {
        return this.DiscountProxyDailyPrice;
    }

    /**
     * Set Discounted basic price of connection in USD/day.
     * @param DiscountProxyDailyPrice Discounted basic price of connection in USD/day.
     */
    public void setDiscountProxyDailyPrice(Float DiscountProxyDailyPrice) {
        this.DiscountProxyDailyPrice = DiscountProxyDailyPrice;
    }

    /**
     * Get Currency, which supports CNY, USD, etc. 
     * @return Currency Currency, which supports CNY, USD, etc.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency, which supports CNY, USD, etc.
     * @param Currency Currency, which supports CNY, USD, etc.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FlowUnitPrice Connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getFlowUnitPrice() {
        return this.FlowUnitPrice;
    }

    /**
     * Set Connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FlowUnitPrice Connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowUnitPrice(Float FlowUnitPrice) {
        this.FlowUnitPrice = FlowUnitPrice;
    }

    /**
     * Get Discounted connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiscountFlowUnitPrice Discounted connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getDiscountFlowUnitPrice() {
        return this.DiscountFlowUnitPrice;
    }

    /**
     * Set Discounted connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiscountFlowUnitPrice Discounted connection traffic price in USD/GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountFlowUnitPrice(Float DiscountFlowUnitPrice) {
        this.DiscountFlowUnitPrice = DiscountFlowUnitPrice;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyDailyPrice", this.ProxyDailyPrice);
        this.setParamArrayObj(map, prefix + "BandwidthUnitPrice.", this.BandwidthUnitPrice);
        this.setParamSimple(map, prefix + "DiscountProxyDailyPrice", this.DiscountProxyDailyPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "FlowUnitPrice", this.FlowUnitPrice);
        this.setParamSimple(map, prefix + "DiscountFlowUnitPrice", this.DiscountFlowUnitPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

