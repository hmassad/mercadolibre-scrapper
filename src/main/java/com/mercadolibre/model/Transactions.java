/*
 * MercadoLibre API
 * MercadoLibre API Documentation.
 *
 * OpenAPI spec version: 0.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mercadolibre.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Transactions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Transactions {
    @JsonProperty("canceled")
    private Integer canceled = null;

    @JsonProperty("completed")
    private Integer completed = null;

    @JsonProperty("period")
    private String period = null;

    @JsonProperty("ratings")
    private Ratings ratings = null;

    @JsonProperty("total")
    private Integer total = null;

    public Transactions canceled(Integer canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * Get canceled
     *
     * @return canceled
     **/
    @ApiModelProperty(value = "")
    public Integer getCanceled() {
        return canceled;
    }

    public void setCanceled(Integer canceled) {
        this.canceled = canceled;
    }

    public Transactions completed(Integer completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get completed
     *
     * @return completed
     **/
    @ApiModelProperty(value = "")
    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Transactions period(String period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     **/
    @ApiModelProperty(value = "")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Transactions ratings(Ratings ratings) {
        this.ratings = ratings;
        return this;
    }

    /**
     * Get ratings
     *
     * @return ratings
     **/
    @ApiModelProperty(value = "")
    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public Transactions total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @ApiModelProperty(value = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transactions transactions = (Transactions) o;
        return Objects.equals(this.canceled, transactions.canceled) &&
                Objects.equals(this.completed, transactions.completed) &&
                Objects.equals(this.period, transactions.period) &&
                Objects.equals(this.ratings, transactions.ratings) &&
                Objects.equals(this.total, transactions.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canceled, completed, period, ratings, total);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Transactions {\n");

        sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

