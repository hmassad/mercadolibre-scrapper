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


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Text
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Text {
  @JsonProperty("plain")
  private String plain = null;

  public Text plain(String plain) {
    this.plain = plain;
    return this;
  }

   /**
   * Get plain
   * @return plain
  **/
  @ApiModelProperty(value = "")
  public String getPlain() {
    return plain;
  }

  public void setPlain(String plain) {
    this.plain = plain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Text text = (Text) o;
    return Objects.equals(this.plain, text.plain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");
    
    sb.append("    plain: ").append(toIndentedString(plain)).append("\n");
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

