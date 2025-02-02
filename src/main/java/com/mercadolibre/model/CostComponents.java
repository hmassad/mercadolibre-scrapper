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
 * CostComponents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class CostComponents {
    @JsonProperty("special_discount")
    private Integer specialDiscount = null;

    @JsonProperty("loyal_discount")
    private Integer loyalDiscount = null;

    @JsonProperty("compensation")
    private Integer compensation = null;

    public CostComponents specialDiscount(Integer specialDiscount) {
        this.specialDiscount = specialDiscount;
        return this;
    }

    /**
     * Get specialDiscount
     *
     * @return specialDiscount
     **/
    @ApiModelProperty(value = "")
    public Integer getSpecialDiscount() {
        return specialDiscount;
    }

    public void setSpecialDiscount(Integer specialDiscount) {
        this.specialDiscount = specialDiscount;
    }

    public CostComponents loyalDiscount(Integer loyalDiscount) {
        this.loyalDiscount = loyalDiscount;
        return this;
    }

    /**
     * Get loyalDiscount
     *
     * @return loyalDiscount
     **/
    @ApiModelProperty(value = "")
    public Integer getLoyalDiscount() {
        return loyalDiscount;
    }

    public void setLoyalDiscount(Integer loyalDiscount) {
        this.loyalDiscount = loyalDiscount;
    }

    public CostComponents compensation(Integer compensation) {
        this.compensation = compensation;
        return this;
    }

    /**
     * Get compensation
     *
     * @return compensation
     **/
    @ApiModelProperty(value = "")
    public Integer getCompensation() {
        return compensation;
    }

    public void setCompensation(Integer compensation) {
        this.compensation = compensation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CostComponents costComponents = (CostComponents) o;
        return Objects.equals(this.specialDiscount, costComponents.specialDiscount) &&
                Objects.equals(this.loyalDiscount, costComponents.loyalDiscount) &&
                Objects.equals(this.compensation, costComponents.compensation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialDiscount, loyalDiscount, compensation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CostComponents {\n");

        sb.append("    specialDiscount: ").append(toIndentedString(specialDiscount)).append("\n");
        sb.append("    loyalDiscount: ").append(toIndentedString(loyalDiscount)).append("\n");
        sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
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

