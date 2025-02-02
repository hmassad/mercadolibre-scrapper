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
 * BillData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class BillData {
    @JsonProperty("accept_credit_note")
    private Object acceptCreditNote = null;

    public BillData acceptCreditNote(Object acceptCreditNote) {
        this.acceptCreditNote = acceptCreditNote;
        return this;
    }

    /**
     * Get acceptCreditNote
     *
     * @return acceptCreditNote
     **/
    @ApiModelProperty(value = "")
    public Object getAcceptCreditNote() {
        return acceptCreditNote;
    }

    public void setAcceptCreditNote(Object acceptCreditNote) {
        this.acceptCreditNote = acceptCreditNote;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillData billData = (BillData) o;
        return Objects.equals(this.acceptCreditNote, billData.acceptCreditNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptCreditNote);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillData {\n");

        sb.append("    acceptCreditNote: ").append(toIndentedString(acceptCreditNote)).append("\n");
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

