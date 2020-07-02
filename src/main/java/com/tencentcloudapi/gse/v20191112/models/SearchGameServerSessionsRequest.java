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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchGameServerSessionsRequest extends AbstractModel{

    /**
    * Alias ID
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * Fleet ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Maximum number of entries in a single query
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is used for querying the next page
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Search filter expression. Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
hasAvailablePlayerSessions: whether there is available player session in `String` type. Valid values: true, false
gameServerSessionProperties: game session attributes in `String` type

Expressions in `String` type support = and <> for judgment
Expressions in `Number` type support =, <>, >, >=, <, and <= for judgment
    */
    @SerializedName("FilterExpression")
    @Expose
    private String FilterExpression;

    /**
    * Sorting keyword
Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
    */
    @SerializedName("SortExpression")
    @Expose
    private String SortExpression;

    /**
     * Get Alias ID 
     * @return AliasId Alias ID
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set Alias ID
     * @param AliasId Alias ID
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get Fleet ID 
     * @return FleetId Fleet ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Fleet ID
     * @param FleetId Fleet ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Maximum number of entries in a single query 
     * @return Limit Maximum number of entries in a single query
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries in a single query
     * @param Limit Maximum number of entries in a single query
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is used for querying the next page 
     * @return NextToken Pagination offset, which is used for querying the next page
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Pagination offset, which is used for querying the next page
     * @param NextToken Pagination offset, which is used for querying the next page
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Search filter expression. Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
hasAvailablePlayerSessions: whether there is available player session in `String` type. Valid values: true, false
gameServerSessionProperties: game session attributes in `String` type

Expressions in `String` type support = and <> for judgment
Expressions in `Number` type support =, <>, >, >=, <, and <= for judgment 
     * @return FilterExpression Search filter expression. Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
hasAvailablePlayerSessions: whether there is available player session in `String` type. Valid values: true, false
gameServerSessionProperties: game session attributes in `String` type

Expressions in `String` type support = and <> for judgment
Expressions in `Number` type support =, <>, >, >=, <, and <= for judgment
     */
    public String getFilterExpression() {
        return this.FilterExpression;
    }

    /**
     * Set Search filter expression. Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
hasAvailablePlayerSessions: whether there is available player session in `String` type. Valid values: true, false
gameServerSessionProperties: game session attributes in `String` type

Expressions in `String` type support = and <> for judgment
Expressions in `Number` type support =, <>, >, >=, <, and <= for judgment
     * @param FilterExpression Search filter expression. Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
hasAvailablePlayerSessions: whether there is available player session in `String` type. Valid values: true, false
gameServerSessionProperties: game session attributes in `String` type

Expressions in `String` type support = and <> for judgment
Expressions in `Number` type support =, <>, >, >=, <, and <= for judgment
     */
    public void setFilterExpression(String FilterExpression) {
        this.FilterExpression = FilterExpression;
    }

    /**
     * Get Sorting keyword
Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type 
     * @return SortExpression Sorting keyword
Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
     */
    public String getSortExpression() {
        return this.SortExpression;
    }

    /**
     * Set Sorting keyword
Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
     * @param SortExpression Sorting keyword
Valid values:
gameServerSessionName: game session name in `String` type
gameServerSessionId: game session ID in `String` type
maximumSessions: maximum number of player sessions in `Number` type
creationTimeMillis: creation time in milliseconds in `Number` type
playerSessionCount: current number of player sessions in `Number` type
     */
    public void setSortExpression(String SortExpression) {
        this.SortExpression = SortExpression;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "FilterExpression", this.FilterExpression);
        this.setParamSimple(map, prefix + "SortExpression", this.SortExpression);

    }
}

