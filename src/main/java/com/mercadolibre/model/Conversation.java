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
 * Conversation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Conversation {
    @JsonProperty("status")
    private String status = null;

    @JsonProperty("status_date")
    private Object statusDate = null;

    @JsonProperty("substatus")
    private Object substatus = null;

    @JsonProperty("is_blocking_allowed")
    private Boolean isBlockingAllowed = null;

    public Conversation status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Conversation statusDate(Object statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Get statusDate
     *
     * @return statusDate
     **/
    @ApiModelProperty(value = "")
    public Object getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Object statusDate) {
        this.statusDate = statusDate;
    }

    public Conversation substatus(Object substatus) {
        this.substatus = substatus;
        return this;
    }

    /**
     * Get substatus
     *
     * @return substatus
     **/
    @ApiModelProperty(value = "")
    public Object getSubstatus() {
        return substatus;
    }

    public void setSubstatus(Object substatus) {
        this.substatus = substatus;
    }

    public Conversation isBlockingAllowed(Boolean isBlockingAllowed) {
        this.isBlockingAllowed = isBlockingAllowed;
        return this;
    }

    /**
     * Get isBlockingAllowed
     *
     * @return isBlockingAllowed
     **/
    @ApiModelProperty(value = "")
    public Boolean isIsBlockingAllowed() {
        return isBlockingAllowed;
    }

    public void setIsBlockingAllowed(Boolean isBlockingAllowed) {
        this.isBlockingAllowed = isBlockingAllowed;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Conversation conversation = (Conversation) o;
        return Objects.equals(this.status, conversation.status) &&
                Objects.equals(this.statusDate, conversation.statusDate) &&
                Objects.equals(this.substatus, conversation.substatus) &&
                Objects.equals(this.isBlockingAllowed, conversation.isBlockingAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusDate, substatus, isBlockingAllowed);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Conversation {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
        sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
        sb.append("    isBlockingAllowed: ").append(toIndentedString(isBlockingAllowed)).append("\n");
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

