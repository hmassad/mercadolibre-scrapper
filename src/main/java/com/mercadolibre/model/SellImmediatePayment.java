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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SellImmediatePayment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class SellImmediatePayment {
    @JsonProperty("reasons")
    private List<String> reasons = null;

    @JsonProperty("required")
    private Boolean required = null;

    public SellImmediatePayment reasons(List<String> reasons) {
        this.reasons = reasons;
        return this;
    }

    public SellImmediatePayment addReasonsItem(String reasonsItem) {
        if (this.reasons == null) {
            this.reasons = new ArrayList<String>();
        }
        this.reasons.add(reasonsItem);
        return this;
    }

    /**
     * Get reasons
     *
     * @return reasons
     **/
    @ApiModelProperty(value = "")
    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public SellImmediatePayment required(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get required
     *
     * @return required
     **/
    @ApiModelProperty(value = "")
    public Boolean isRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SellImmediatePayment sellImmediatePayment = (SellImmediatePayment) o;
        return Objects.equals(this.reasons, sellImmediatePayment.reasons) &&
                Objects.equals(this.required, sellImmediatePayment.required);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reasons, required);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SellImmediatePayment {\n");

        sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

