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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkSessionBatchSQLRequest extends AbstractModel{

    /**
    * The name of the engine for executing the Spark job.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * The SQL statement to execute.
    */
    @SerializedName("ExecuteSQL")
    @Expose
    private String ExecuteSQL;

    /**
    * The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * The executor count, which defaults to 1.
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private Long ExecutorNumbers;

    /**
    * The maximum executor count, which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the value of this parameter is the same as that of `ExecutorNumbers`.
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * The session timeout period in seconds. Default value: 3600
    */
    @SerializedName("TimeoutInSecond")
    @Expose
    private Long TimeoutInSecond;

    /**
    * The unique ID of a session. If this parameter is specified, the task will be run using the specified session.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The name of the session to create.
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * Session configurations. `dlc.eni`, `dlc.role.arn`, `dlc.sql.set.config`, and user-defined configurations are supported.
    */
    @SerializedName("Arguments")
    @Expose
    private KVPair [] Arguments;

    /**
     * Get The name of the engine for executing the Spark job. 
     * @return DataEngineName The name of the engine for executing the Spark job.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set The name of the engine for executing the Spark job.
     * @param DataEngineName The name of the engine for executing the Spark job.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get The SQL statement to execute. 
     * @return ExecuteSQL The SQL statement to execute.
     */
    public String getExecuteSQL() {
        return this.ExecuteSQL;
    }

    /**
     * Set The SQL statement to execute.
     * @param ExecuteSQL The SQL statement to execute.
     */
    public void setExecuteSQL(String ExecuteSQL) {
        this.ExecuteSQL = ExecuteSQL;
    }

    /**
     * Get The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs). 
     * @return DriverSize The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     * @param DriverSize The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs). 
     * @return ExecutorSize The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     * @param ExecutorSize The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get The executor count, which defaults to 1. 
     * @return ExecutorNumbers The executor count, which defaults to 1.
     */
    public Long getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set The executor count, which defaults to 1.
     * @param ExecutorNumbers The executor count, which defaults to 1.
     */
    public void setExecutorNumbers(Long ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get The maximum executor count, which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the value of this parameter is the same as that of `ExecutorNumbers`. 
     * @return ExecutorMaxNumbers The maximum executor count, which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the value of this parameter is the same as that of `ExecutorNumbers`.
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set The maximum executor count, which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the value of this parameter is the same as that of `ExecutorNumbers`.
     * @param ExecutorMaxNumbers The maximum executor count, which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the value of this parameter is the same as that of `ExecutorNumbers`.
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get The session timeout period in seconds. Default value: 3600 
     * @return TimeoutInSecond The session timeout period in seconds. Default value: 3600
     */
    public Long getTimeoutInSecond() {
        return this.TimeoutInSecond;
    }

    /**
     * Set The session timeout period in seconds. Default value: 3600
     * @param TimeoutInSecond The session timeout period in seconds. Default value: 3600
     */
    public void setTimeoutInSecond(Long TimeoutInSecond) {
        this.TimeoutInSecond = TimeoutInSecond;
    }

    /**
     * Get The unique ID of a session. If this parameter is specified, the task will be run using the specified session. 
     * @return SessionId The unique ID of a session. If this parameter is specified, the task will be run using the specified session.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The unique ID of a session. If this parameter is specified, the task will be run using the specified session.
     * @param SessionId The unique ID of a session. If this parameter is specified, the task will be run using the specified session.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The name of the session to create. 
     * @return SessionName The name of the session to create.
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set The name of the session to create.
     * @param SessionName The name of the session to create.
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get Session configurations. `dlc.eni`, `dlc.role.arn`, `dlc.sql.set.config`, and user-defined configurations are supported. 
     * @return Arguments Session configurations. `dlc.eni`, `dlc.role.arn`, `dlc.sql.set.config`, and user-defined configurations are supported.
     */
    public KVPair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set Session configurations. `dlc.eni`, `dlc.role.arn`, `dlc.sql.set.config`, and user-defined configurations are supported.
     * @param Arguments Session configurations. `dlc.eni`, `dlc.role.arn`, `dlc.sql.set.config`, and user-defined configurations are supported.
     */
    public void setArguments(KVPair [] Arguments) {
        this.Arguments = Arguments;
    }

    public CreateSparkSessionBatchSQLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkSessionBatchSQLRequest(CreateSparkSessionBatchSQLRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ExecuteSQL != null) {
            this.ExecuteSQL = new String(source.ExecuteSQL);
        }
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNumbers != null) {
            this.ExecutorNumbers = new Long(source.ExecutorNumbers);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
        if (source.TimeoutInSecond != null) {
            this.TimeoutInSecond = new Long(source.TimeoutInSecond);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.Arguments != null) {
            this.Arguments = new KVPair[source.Arguments.length];
            for (int i = 0; i < source.Arguments.length; i++) {
                this.Arguments[i] = new KVPair(source.Arguments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ExecuteSQL", this.ExecuteSQL);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "TimeoutInSecond", this.TimeoutInSecond);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);

    }
}

