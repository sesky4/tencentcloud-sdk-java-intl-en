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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Table extends AbstractModel{

    /**
    * Table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * New table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewTableName")
    @Expose
    private String NewTableName;

    /**
    * Filter condition
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterCondition")
    @Expose
    private String FilterCondition;

    /**
     * Get Table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get New table name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewTableName New table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewTableName() {
        return this.NewTableName;
    }

    /**
     * Set New table name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewTableName New table name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewTableName(String NewTableName) {
        this.NewTableName = NewTableName;
    }

    /**
     * Get Filter condition
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilterCondition Filter condition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilterCondition() {
        return this.FilterCondition;
    }

    /**
     * Set Filter condition
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilterCondition Filter condition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterCondition(String FilterCondition) {
        this.FilterCondition = FilterCondition;
    }

    public Table() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Table(Table source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.NewTableName != null) {
            this.NewTableName = new String(source.NewTableName);
        }
        if (source.FilterCondition != null) {
            this.FilterCondition = new String(source.FilterCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "NewTableName", this.NewTableName);
        this.setParamSimple(map, prefix + "FilterCondition", this.FilterCondition);

    }
}

