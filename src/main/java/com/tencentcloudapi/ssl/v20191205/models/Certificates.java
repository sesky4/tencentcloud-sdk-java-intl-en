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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Certificates extends AbstractModel{

    /**
    * User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Certificate source.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Certificate package type. 1: GeoTrust DV SSL CA - G3; 2: TrustAsia TLS RSA CA; 3: Secure Site EV Pro; 4: Secure Site EV; 5: Secure Site OV Pro; 6: Secure Site OV; 7: Secure Site OV wildcard SSL certificate; 8: GeoTrust EV; 9: GeoTrust OV; 10: GeoTrust OV wildcard SSL certificate; 11: TrustAsia DV multi-domain SSL certificate; 12: TrustAsia DV wildcard SSL certificate; 13: TrustAsia OV wildcard SSL certificate (D3); 14: TrustAsia OV SSL certificate (D3); 15: TrustAsia OV multi-domain SSL certificate (D3); 16: TrustAsia EV SSL certificate (D3); 17: TrustAsia EV multi-domain SSL certificate (D3); 18: GlobalSign OV SSL certificate; 19: GlobalSign OV wildcard SSL certificate; 20: GlobalSign EV SSL certificate; 21: TrustAsia OV multi-domain wildcard SSL certificate (D3); 22: GlobalSign OV multi-domain SSL certificate; 23: GlobalSign OV multi-domain wildcard SSL certificate; 24: GlobalSign EV multi-domain SSL certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Certificate type. CA: client certificate; SVR: server certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Issuer.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * Primary domain name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Alias.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Status value. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS resolution record added; 5: OV/EV certificate, information to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Extended information of the certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * Vulnerability scanning status. INACTIVE: not activated; ACTIVE: activated.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * Status information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * Verification type. DNS_AUTO: automatic DNS verification; DNS: manual DNS verification; FILE: verification by file; EMAIL: verification by email.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * Time when the certificate takes effect.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * Time when the certificate expires.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * Validity period of the certificate (unit: month).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Certificate ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Domain names associated with the certificate (including the primary domain name).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * Certificate type name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * Status description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * Whether the customer is a VIP customer.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * Whether the certificate is a DV certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * Whether the certificate is a wildcard certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * Whether the vulnerability scanning feature is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * Whether the certificate can be reissued.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * Project information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectInfo")
    @Expose
    private ProjectInfo ProjectInfo;

    /**
    * Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BoundResource")
    @Expose
    private String [] BoundResource;

    /**
    * Whether the certificate can be deployed.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
     * Get User UIN.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin User UIN.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Project ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Certificate source.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return From Certificate source.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Certificate source.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param From Certificate source.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Certificate package type. 1: GeoTrust DV SSL CA - G3; 2: TrustAsia TLS RSA CA; 3: Secure Site EV Pro; 4: Secure Site EV; 5: Secure Site OV Pro; 6: Secure Site OV; 7: Secure Site OV wildcard SSL certificate; 8: GeoTrust EV; 9: GeoTrust OV; 10: GeoTrust OV wildcard SSL certificate; 11: TrustAsia DV multi-domain SSL certificate; 12: TrustAsia DV wildcard SSL certificate; 13: TrustAsia OV wildcard SSL certificate (D3); 14: TrustAsia OV SSL certificate (D3); 15: TrustAsia OV multi-domain SSL certificate (D3); 16: TrustAsia EV SSL certificate (D3); 17: TrustAsia EV multi-domain SSL certificate (D3); 18: GlobalSign OV SSL certificate; 19: GlobalSign OV wildcard SSL certificate; 20: GlobalSign EV SSL certificate; 21: TrustAsia OV multi-domain wildcard SSL certificate (D3); 22: GlobalSign OV multi-domain SSL certificate; 23: GlobalSign OV multi-domain wildcard SSL certificate; 24: GlobalSign EV multi-domain SSL certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PackageType Certificate package type. 1: GeoTrust DV SSL CA - G3; 2: TrustAsia TLS RSA CA; 3: Secure Site EV Pro; 4: Secure Site EV; 5: Secure Site OV Pro; 6: Secure Site OV; 7: Secure Site OV wildcard SSL certificate; 8: GeoTrust EV; 9: GeoTrust OV; 10: GeoTrust OV wildcard SSL certificate; 11: TrustAsia DV multi-domain SSL certificate; 12: TrustAsia DV wildcard SSL certificate; 13: TrustAsia OV wildcard SSL certificate (D3); 14: TrustAsia OV SSL certificate (D3); 15: TrustAsia OV multi-domain SSL certificate (D3); 16: TrustAsia EV SSL certificate (D3); 17: TrustAsia EV multi-domain SSL certificate (D3); 18: GlobalSign OV SSL certificate; 19: GlobalSign OV wildcard SSL certificate; 20: GlobalSign EV SSL certificate; 21: TrustAsia OV multi-domain wildcard SSL certificate (D3); 22: GlobalSign OV multi-domain SSL certificate; 23: GlobalSign OV multi-domain wildcard SSL certificate; 24: GlobalSign EV multi-domain SSL certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Certificate package type. 1: GeoTrust DV SSL CA - G3; 2: TrustAsia TLS RSA CA; 3: Secure Site EV Pro; 4: Secure Site EV; 5: Secure Site OV Pro; 6: Secure Site OV; 7: Secure Site OV wildcard SSL certificate; 8: GeoTrust EV; 9: GeoTrust OV; 10: GeoTrust OV wildcard SSL certificate; 11: TrustAsia DV multi-domain SSL certificate; 12: TrustAsia DV wildcard SSL certificate; 13: TrustAsia OV wildcard SSL certificate (D3); 14: TrustAsia OV SSL certificate (D3); 15: TrustAsia OV multi-domain SSL certificate (D3); 16: TrustAsia EV SSL certificate (D3); 17: TrustAsia EV multi-domain SSL certificate (D3); 18: GlobalSign OV SSL certificate; 19: GlobalSign OV wildcard SSL certificate; 20: GlobalSign EV SSL certificate; 21: TrustAsia OV multi-domain wildcard SSL certificate (D3); 22: GlobalSign OV multi-domain SSL certificate; 23: GlobalSign OV multi-domain wildcard SSL certificate; 24: GlobalSign EV multi-domain SSL certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PackageType Certificate package type. 1: GeoTrust DV SSL CA - G3; 2: TrustAsia TLS RSA CA; 3: Secure Site EV Pro; 4: Secure Site EV; 5: Secure Site OV Pro; 6: Secure Site OV; 7: Secure Site OV wildcard SSL certificate; 8: GeoTrust EV; 9: GeoTrust OV; 10: GeoTrust OV wildcard SSL certificate; 11: TrustAsia DV multi-domain SSL certificate; 12: TrustAsia DV wildcard SSL certificate; 13: TrustAsia OV wildcard SSL certificate (D3); 14: TrustAsia OV SSL certificate (D3); 15: TrustAsia OV multi-domain SSL certificate (D3); 16: TrustAsia EV SSL certificate (D3); 17: TrustAsia EV multi-domain SSL certificate (D3); 18: GlobalSign OV SSL certificate; 19: GlobalSign OV wildcard SSL certificate; 20: GlobalSign EV SSL certificate; 21: TrustAsia OV multi-domain wildcard SSL certificate (D3); 22: GlobalSign OV multi-domain SSL certificate; 23: GlobalSign OV multi-domain wildcard SSL certificate; 24: GlobalSign EV multi-domain SSL certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Certificate type. CA: client certificate; SVR: server certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateType Certificate type. CA: client certificate; SVR: server certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. CA: client certificate; SVR: server certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateType Certificate type. CA: client certificate; SVR: server certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Issuer.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProductZhName Issuer.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set Issuer.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProductZhName Issuer.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get Primary domain name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Primary domain name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Primary domain name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Primary domain name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Alias.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Alias Alias.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Alias Alias.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Status value. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS resolution record added; 5: OV/EV certificate, information to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Status value. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS resolution record added; 5: OV/EV certificate, information to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS resolution record added; 5: OV/EV certificate, information to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Status value. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS resolution record added; 5: OV/EV certificate, information to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Extended information of the certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateExtra Extended information of the certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CertificateExtra getCertificateExtra() {
        return this.CertificateExtra;
    }

    /**
     * Set Extended information of the certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateExtra Extended information of the certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateExtra(CertificateExtra CertificateExtra) {
        this.CertificateExtra = CertificateExtra;
    }

    /**
     * Get Vulnerability scanning status. INACTIVE: not activated; ACTIVE: activated.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VulnerabilityStatus Vulnerability scanning status. INACTIVE: not activated; ACTIVE: activated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set Vulnerability scanning status. INACTIVE: not activated; ACTIVE: activated.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VulnerabilityStatus Vulnerability scanning status. INACTIVE: not activated; ACTIVE: activated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
    }

    /**
     * Get Status information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusMsg Status information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set Status information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusMsg Status information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get Verification type. DNS_AUTO: automatic DNS verification; DNS: manual DNS verification; FILE: verification by file; EMAIL: verification by email.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VerifyType Verification type. DNS_AUTO: automatic DNS verification; DNS: manual DNS verification; FILE: verification by file; EMAIL: verification by email.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Verification type. DNS_AUTO: automatic DNS verification; DNS: manual DNS verification; FILE: verification by file; EMAIL: verification by email.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VerifyType Verification type. DNS_AUTO: automatic DNS verification; DNS: manual DNS verification; FILE: verification by file; EMAIL: verification by email.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get Time when the certificate takes effect.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertBeginTime Time when the certificate takes effect.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set Time when the certificate takes effect.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertBeginTime Time when the certificate takes effect.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get Time when the certificate expires.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertEndTime Time when the certificate expires.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set Time when the certificate expires.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertEndTime Time when the certificate expires.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get Validity period of the certificate (unit: month).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ValidityPeriod Validity period of the certificate (unit: month).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set Validity period of the certificate (unit: month).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ValidityPeriod Validity period of the certificate (unit: month).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get Creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InsertTime Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InsertTime Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Certificate ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateId Certificate ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateId Certificate ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Domain names associated with the certificate (including the primary domain name).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubjectAltName Domain names associated with the certificate (including the primary domain name).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set Domain names associated with the certificate (including the primary domain name).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubjectAltName Domain names associated with the certificate (including the primary domain name).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get Certificate type name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PackageTypeName Certificate type name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageTypeName() {
        return this.PackageTypeName;
    }

    /**
     * Set Certificate type name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PackageTypeName Certificate type name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageTypeName(String PackageTypeName) {
        this.PackageTypeName = PackageTypeName;
    }

    /**
     * Get Status description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusName Status description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set Status description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusName Status description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get Whether the customer is a VIP customer.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsVip Whether the customer is a VIP customer.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether the customer is a VIP customer.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsVip Whether the customer is a VIP customer.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Whether the certificate is a DV certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDv Whether the certificate is a DV certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set Whether the certificate is a DV certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDv Whether the certificate is a DV certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get Whether the certificate is a wildcard certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsWildcard Whether the certificate is a wildcard certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set Whether the certificate is a wildcard certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsWildcard Whether the certificate is a wildcard certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get Whether the vulnerability scanning feature is enabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsVulnerability Whether the vulnerability scanning feature is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set Whether the vulnerability scanning feature is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsVulnerability Whether the vulnerability scanning feature is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get Whether the certificate can be reissued.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RenewAble Whether the certificate can be reissued.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set Whether the certificate can be reissued.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RenewAble Whether the certificate can be reissued.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
    }

    /**
     * Get Project information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectInfo Project information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProjectInfo getProjectInfo() {
        return this.ProjectInfo;
    }

    /**
     * Set Project information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectInfo Project information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectInfo(ProjectInfo ProjectInfo) {
        this.ProjectInfo = ProjectInfo;
    }

    /**
     * Get Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BoundResource Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBoundResource() {
        return this.BoundResource;
    }

    /**
     * Set Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BoundResource Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBoundResource(String [] BoundResource) {
        this.BoundResource = BoundResource;
    }

    /**
     * Get Whether the certificate can be deployed.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Deployable Whether the certificate can be deployed.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDeployable() {
        return this.Deployable;
    }

    /**
     * Set Whether the certificate can be deployed.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Deployable Whether the certificate can be deployed.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployable(Boolean Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ProductZhName", this.ProductZhName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CertificateExtra.", this.CertificateExtra);
        this.setParamSimple(map, prefix + "VulnerabilityStatus", this.VulnerabilityStatus);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "PackageTypeName", this.PackageTypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamSimple(map, prefix + "RenewAble", this.RenewAble);
        this.setParamObj(map, prefix + "ProjectInfo.", this.ProjectInfo);
        this.setParamArraySimple(map, prefix + "BoundResource.", this.BoundResource);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);

    }
}

