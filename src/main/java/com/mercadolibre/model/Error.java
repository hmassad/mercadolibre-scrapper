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
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Error {
    @JsonProperty("message")
    private String message = null;

    @JsonProperty("error")
    private String error = null;

    @JsonProperty("status")
    private Integer status = null;

    @JsonProperty("cause")
    private List<String> cause = null;

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @ApiModelProperty(value = "")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Error status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Error cause(List<String> cause) {
        this.cause = cause;
        return this;
    }

    public Error addCauseItem(String causeItem) {
        if (this.cause == null) {
            this.cause = new ArrayList<String>();
        }
        this.cause.add(causeItem);
        return this;
    }

    /**
     * Get cause
     *
     * @return cause
     **/
    @ApiModelProperty(value = "")
    public List<String> getCause() {
        return cause;
    }

    public void setCause(List<String> cause) {
        this.cause = cause;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.message, error.message) &&
                Objects.equals(this.error, error.error) &&
                Objects.equals(this.status, error.status) &&
                Objects.equals(this.cause, error.cause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, error, status, cause);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

