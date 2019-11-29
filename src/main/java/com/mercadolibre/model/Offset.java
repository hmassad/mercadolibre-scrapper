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
 * Offset
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Offset {
    @JsonProperty("date")
    private String date = null;

    @JsonProperty("shipping")
    private Integer shipping = null;

    public Offset date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     **/
    @ApiModelProperty(value = "")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Offset shipping(Integer shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * Get shipping
     *
     * @return shipping
     **/
    @ApiModelProperty(value = "")
    public Integer getShipping() {
        return shipping;
    }

    public void setShipping(Integer shipping) {
        this.shipping = shipping;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Offset offset = (Offset) o;
        return Objects.equals(this.date, offset.date) &&
                Objects.equals(this.shipping, offset.shipping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, shipping);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Offset {\n");

        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
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
