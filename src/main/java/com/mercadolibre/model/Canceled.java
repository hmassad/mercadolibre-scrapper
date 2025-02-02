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
 * Canceled
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Canceled {
    @JsonProperty("paid")
    private Object paid = null;

    @JsonProperty("total")
    private Object total = null;

    public Canceled paid(Object paid) {
        this.paid = paid;
        return this;
    }

    /**
     * Get paid
     *
     * @return paid
     **/
    @ApiModelProperty(value = "")
    public Object getPaid() {
        return paid;
    }

    public void setPaid(Object paid) {
        this.paid = paid;
    }

    public Canceled total(Object total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @ApiModelProperty(value = "")
    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
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
        Canceled canceled = (Canceled) o;
        return Objects.equals(this.paid, canceled.paid) &&
                Objects.equals(this.total, canceled.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paid, total);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Canceled {\n");

        sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

