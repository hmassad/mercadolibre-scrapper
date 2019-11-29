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
 * AlternativePhone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class AlternativePhone {
    @JsonProperty("area_code")
    private String areaCode = null;

    @JsonProperty("extension")
    private String extension = null;

    @JsonProperty("number")
    private String number = null;

    public AlternativePhone areaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Get areaCode
     *
     * @return areaCode
     **/
    @ApiModelProperty(value = "")
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public AlternativePhone extension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Get extension
     *
     * @return extension
     **/
    @ApiModelProperty(value = "")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public AlternativePhone number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     *
     * @return number
     **/
    @ApiModelProperty(value = "")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlternativePhone alternativePhone = (AlternativePhone) o;
        return Objects.equals(this.areaCode, alternativePhone.areaCode) &&
                Objects.equals(this.extension, alternativePhone.extension) &&
                Objects.equals(this.number, alternativePhone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, extension, number);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlternativePhone {\n");

        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

