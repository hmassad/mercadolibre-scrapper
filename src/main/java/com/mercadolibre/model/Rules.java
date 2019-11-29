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
 * Rules
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Rules {
    @JsonProperty("enabled_taxpayer_types")
    private List<String> enabledTaxpayerTypes = null;

    @JsonProperty("begins_with")
    private String beginsWith = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("min_length")
    private Integer minLength = null;

    @JsonProperty("max_length")
    private Integer maxLength = null;

    public Rules enabledTaxpayerTypes(List<String> enabledTaxpayerTypes) {
        this.enabledTaxpayerTypes = enabledTaxpayerTypes;
        return this;
    }

    public Rules addEnabledTaxpayerTypesItem(String enabledTaxpayerTypesItem) {
        if (this.enabledTaxpayerTypes == null) {
            this.enabledTaxpayerTypes = new ArrayList<String>();
        }
        this.enabledTaxpayerTypes.add(enabledTaxpayerTypesItem);
        return this;
    }

    /**
     * Get enabledTaxpayerTypes
     *
     * @return enabledTaxpayerTypes
     **/
    @ApiModelProperty(value = "")
    public List<String> getEnabledTaxpayerTypes() {
        return enabledTaxpayerTypes;
    }

    public void setEnabledTaxpayerTypes(List<String> enabledTaxpayerTypes) {
        this.enabledTaxpayerTypes = enabledTaxpayerTypes;
    }

    public Rules beginsWith(String beginsWith) {
        this.beginsWith = beginsWith;
        return this;
    }

    /**
     * Get beginsWith
     *
     * @return beginsWith
     **/
    @ApiModelProperty(value = "")
    public String getBeginsWith() {
        return beginsWith;
    }

    public void setBeginsWith(String beginsWith) {
        this.beginsWith = beginsWith;
    }

    public Rules type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Rules minLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * Get minLength
     *
     * @return minLength
     **/
    @ApiModelProperty(value = "")
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Rules maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Get maxLength
     *
     * @return maxLength
     **/
    @ApiModelProperty(value = "")
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rules rules = (Rules) o;
        return Objects.equals(this.enabledTaxpayerTypes, rules.enabledTaxpayerTypes) &&
                Objects.equals(this.beginsWith, rules.beginsWith) &&
                Objects.equals(this.type, rules.type) &&
                Objects.equals(this.minLength, rules.minLength) &&
                Objects.equals(this.maxLength, rules.maxLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledTaxpayerTypes, beginsWith, type, minLength, maxLength);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rules {\n");

        sb.append("    enabledTaxpayerTypes: ").append(toIndentedString(enabledTaxpayerTypes)).append("\n");
        sb.append("    beginsWith: ").append(toIndentedString(beginsWith)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

