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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAdvancedSettings extends AbstractModel {

    /**
    * When the node is in the podCIDR size customization mode, you can specify the upper limit of the number of pods running on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DesiredPodNumber")
    @Expose
    private Long DesiredPodNumber;

    /**
    * base64 encoded user script, executed before initializing the node and currently effective only for adding existing nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
    * Runtime description
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private RuntimeConfig RuntimeConfig;

    /**
    * Base64-encoded user script. This script is executed after the k8s components start running. Users must ensure the reenterable and retry logic of the script. The script and the log files generated by it can be viewed at the /data/ccs_userscript/ path of the node. If a node must be initialized before joining the scheduling, it can be used in conjunction with the unschedulable parameter. After initializing with userScript, add the command `kubectl uncordon nodename --kubeconfig=/root/.kube/config` to add the node to scheduling.

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * Node-related custom parameter information.

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
     * Get When the node is in the podCIDR size customization mode, you can specify the upper limit of the number of pods running on the node.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DesiredPodNumber When the node is in the podCIDR size customization mode, you can specify the upper limit of the number of pods running on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getDesiredPodNumber() {
        return this.DesiredPodNumber;
    }

    /**
     * Set When the node is in the podCIDR size customization mode, you can specify the upper limit of the number of pods running on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DesiredPodNumber When the node is in the podCIDR size customization mode, you can specify the upper limit of the number of pods running on the node.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDesiredPodNumber(Long DesiredPodNumber) {
        this.DesiredPodNumber = DesiredPodNumber;
    }

    /**
     * Get base64 encoded user script, executed before initializing the node and currently effective only for adding existing nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return PreStartUserScript base64 encoded user script, executed before initializing the node and currently effective only for adding existing nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set base64 encoded user script, executed before initializing the node and currently effective only for adding existing nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param PreStartUserScript base64 encoded user script, executed before initializing the node and currently effective only for adding existing nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    /**
     * Get Runtime description
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeConfig Runtime description
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public RuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set Runtime description
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeConfig Runtime description
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeConfig(RuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get Base64-encoded user script. This script is executed after the k8s components start running. Users must ensure the reenterable and retry logic of the script. The script and the log files generated by it can be viewed at the /data/ccs_userscript/ path of the node. If a node must be initialized before joining the scheduling, it can be used in conjunction with the unschedulable parameter. After initializing with userScript, add the command `kubectl uncordon nodename --kubeconfig=/root/.kube/config` to add the node to scheduling.

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return UserScript Base64-encoded user script. This script is executed after the k8s components start running. Users must ensure the reenterable and retry logic of the script. The script and the log files generated by it can be viewed at the /data/ccs_userscript/ path of the node. If a node must be initialized before joining the scheduling, it can be used in conjunction with the unschedulable parameter. After initializing with userScript, add the command `kubectl uncordon nodename --kubeconfig=/root/.kube/config` to add the node to scheduling.

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Base64-encoded user script. This script is executed after the k8s components start running. Users must ensure the reenterable and retry logic of the script. The script and the log files generated by it can be viewed at the /data/ccs_userscript/ path of the node. If a node must be initialized before joining the scheduling, it can be used in conjunction with the unschedulable parameter. After initializing with userScript, add the command `kubectl uncordon nodename --kubeconfig=/root/.kube/config` to add the node to scheduling.

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param UserScript Base64-encoded user script. This script is executed after the k8s components start running. Users must ensure the reenterable and retry logic of the script. The script and the log files generated by it can be viewed at the /data/ccs_userscript/ path of the node. If a node must be initialized before joining the scheduling, it can be used in conjunction with the unschedulable parameter. After initializing with userScript, add the command `kubectl uncordon nodename --kubeconfig=/root/.kube/config` to add the node to scheduling.

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get Node-related custom parameter information.

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ExtraArgs Node-related custom parameter information.

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Node-related custom parameter information.

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ExtraArgs Node-related custom parameter information.

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    public InstanceAdvancedSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAdvancedSettings(InstanceAdvancedSettings source) {
        if (source.DesiredPodNumber != null) {
            this.DesiredPodNumber = new Long(source.DesiredPodNumber);
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new RuntimeConfig(source.RuntimeConfig);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new InstanceExtraArgs(source.ExtraArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DesiredPodNumber", this.DesiredPodNumber);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);

    }
}
