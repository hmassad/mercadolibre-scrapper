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
 * MessageAttachmentsValidations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class MessageAttachmentsValidations {
    @JsonProperty("invalid_size")
    private List<String> invalidSize = null;

    @JsonProperty("invalid_file_name")
    private List<String> invalidFileName = null;

    @JsonProperty("invalid_qtty_size")
    private List<String> invalidQttySize = null;

    @JsonProperty("invalid_qtty_files")
    private List<String> invalidQttyFiles = null;

    @JsonProperty("invalid_extension")
    private List<String> invalidExtension = null;

    @JsonProperty("forbidden")
    private List<String> forbidden = null;

    @JsonProperty("internal_error")
    private List<String> internalError = null;

    public MessageAttachmentsValidations invalidSize(List<String> invalidSize) {
        this.invalidSize = invalidSize;
        return this;
    }

    public MessageAttachmentsValidations addInvalidSizeItem(String invalidSizeItem) {
        if (this.invalidSize == null) {
            this.invalidSize = new ArrayList<String>();
        }
        this.invalidSize.add(invalidSizeItem);
        return this;
    }

    /**
     * Get invalidSize
     *
     * @return invalidSize
     **/
    @ApiModelProperty(value = "")
    public List<String> getInvalidSize() {
        return invalidSize;
    }

    public void setInvalidSize(List<String> invalidSize) {
        this.invalidSize = invalidSize;
    }

    public MessageAttachmentsValidations invalidFileName(List<String> invalidFileName) {
        this.invalidFileName = invalidFileName;
        return this;
    }

    public MessageAttachmentsValidations addInvalidFileNameItem(String invalidFileNameItem) {
        if (this.invalidFileName == null) {
            this.invalidFileName = new ArrayList<String>();
        }
        this.invalidFileName.add(invalidFileNameItem);
        return this;
    }

    /**
     * Get invalidFileName
     *
     * @return invalidFileName
     **/
    @ApiModelProperty(value = "")
    public List<String> getInvalidFileName() {
        return invalidFileName;
    }

    public void setInvalidFileName(List<String> invalidFileName) {
        this.invalidFileName = invalidFileName;
    }

    public MessageAttachmentsValidations invalidQttySize(List<String> invalidQttySize) {
        this.invalidQttySize = invalidQttySize;
        return this;
    }

    public MessageAttachmentsValidations addInvalidQttySizeItem(String invalidQttySizeItem) {
        if (this.invalidQttySize == null) {
            this.invalidQttySize = new ArrayList<String>();
        }
        this.invalidQttySize.add(invalidQttySizeItem);
        return this;
    }

    /**
     * Get invalidQttySize
     *
     * @return invalidQttySize
     **/
    @ApiModelProperty(value = "")
    public List<String> getInvalidQttySize() {
        return invalidQttySize;
    }

    public void setInvalidQttySize(List<String> invalidQttySize) {
        this.invalidQttySize = invalidQttySize;
    }

    public MessageAttachmentsValidations invalidQttyFiles(List<String> invalidQttyFiles) {
        this.invalidQttyFiles = invalidQttyFiles;
        return this;
    }

    public MessageAttachmentsValidations addInvalidQttyFilesItem(String invalidQttyFilesItem) {
        if (this.invalidQttyFiles == null) {
            this.invalidQttyFiles = new ArrayList<String>();
        }
        this.invalidQttyFiles.add(invalidQttyFilesItem);
        return this;
    }

    /**
     * Get invalidQttyFiles
     *
     * @return invalidQttyFiles
     **/
    @ApiModelProperty(value = "")
    public List<String> getInvalidQttyFiles() {
        return invalidQttyFiles;
    }

    public void setInvalidQttyFiles(List<String> invalidQttyFiles) {
        this.invalidQttyFiles = invalidQttyFiles;
    }

    public MessageAttachmentsValidations invalidExtension(List<String> invalidExtension) {
        this.invalidExtension = invalidExtension;
        return this;
    }

    public MessageAttachmentsValidations addInvalidExtensionItem(String invalidExtensionItem) {
        if (this.invalidExtension == null) {
            this.invalidExtension = new ArrayList<String>();
        }
        this.invalidExtension.add(invalidExtensionItem);
        return this;
    }

    /**
     * Get invalidExtension
     *
     * @return invalidExtension
     **/
    @ApiModelProperty(value = "")
    public List<String> getInvalidExtension() {
        return invalidExtension;
    }

    public void setInvalidExtension(List<String> invalidExtension) {
        this.invalidExtension = invalidExtension;
    }

    public MessageAttachmentsValidations forbidden(List<String> forbidden) {
        this.forbidden = forbidden;
        return this;
    }

    public MessageAttachmentsValidations addForbiddenItem(String forbiddenItem) {
        if (this.forbidden == null) {
            this.forbidden = new ArrayList<String>();
        }
        this.forbidden.add(forbiddenItem);
        return this;
    }

    /**
     * Get forbidden
     *
     * @return forbidden
     **/
    @ApiModelProperty(value = "")
    public List<String> getForbidden() {
        return forbidden;
    }

    public void setForbidden(List<String> forbidden) {
        this.forbidden = forbidden;
    }

    public MessageAttachmentsValidations internalError(List<String> internalError) {
        this.internalError = internalError;
        return this;
    }

    public MessageAttachmentsValidations addInternalErrorItem(String internalErrorItem) {
        if (this.internalError == null) {
            this.internalError = new ArrayList<String>();
        }
        this.internalError.add(internalErrorItem);
        return this;
    }

    /**
     * Get internalError
     *
     * @return internalError
     **/
    @ApiModelProperty(value = "")
    public List<String> getInternalError() {
        return internalError;
    }

    public void setInternalError(List<String> internalError) {
        this.internalError = internalError;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageAttachmentsValidations messageAttachmentsValidations = (MessageAttachmentsValidations) o;
        return Objects.equals(this.invalidSize, messageAttachmentsValidations.invalidSize) &&
                Objects.equals(this.invalidFileName, messageAttachmentsValidations.invalidFileName) &&
                Objects.equals(this.invalidQttySize, messageAttachmentsValidations.invalidQttySize) &&
                Objects.equals(this.invalidQttyFiles, messageAttachmentsValidations.invalidQttyFiles) &&
                Objects.equals(this.invalidExtension, messageAttachmentsValidations.invalidExtension) &&
                Objects.equals(this.forbidden, messageAttachmentsValidations.forbidden) &&
                Objects.equals(this.internalError, messageAttachmentsValidations.internalError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invalidSize, invalidFileName, invalidQttySize, invalidQttyFiles, invalidExtension, forbidden, internalError);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageAttachmentsValidations {\n");

        sb.append("    invalidSize: ").append(toIndentedString(invalidSize)).append("\n");
        sb.append("    invalidFileName: ").append(toIndentedString(invalidFileName)).append("\n");
        sb.append("    invalidQttySize: ").append(toIndentedString(invalidQttySize)).append("\n");
        sb.append("    invalidQttyFiles: ").append(toIndentedString(invalidQttyFiles)).append("\n");
        sb.append("    invalidExtension: ").append(toIndentedString(invalidExtension)).append("\n");
        sb.append("    forbidden: ").append(toIndentedString(forbidden)).append("\n");
        sb.append("    internalError: ").append(toIndentedString(internalError)).append("\n");
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

