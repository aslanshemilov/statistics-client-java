/*
 * Statistics Service
 * Statistics Service
 *
 * OpenAPI spec version: 9.0.000.06.459
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.statistics.model;

import java.util.Objects;
import com.genesys.internal.statistics.model.StatisticValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatisticData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-14T18:24:48.887Z")
public class StatisticData {
  @SerializedName("operationId")
  private String operationId = null;

  @SerializedName("statistics")
  private List<StatisticValue> statistics = new ArrayList<StatisticValue>();

  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  public StatisticData operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Get operationId
   * @return operationId
  **/
  @ApiModelProperty(value = "")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public StatisticData statistics(List<StatisticValue> statistics) {
    this.statistics = statistics;
    return this;
  }

  public StatisticData addStatisticsItem(StatisticValue statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "")
  public List<StatisticValue> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<StatisticValue> statistics) {
    this.statistics = statistics;
  }

  public StatisticData subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticData statisticData = (StatisticData) o;
    return Objects.equals(this.operationId, statisticData.operationId) &&
        Objects.equals(this.statistics, statisticData.statistics) &&
        Objects.equals(this.subscriptionId, statisticData.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, statistics, subscriptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticData {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

