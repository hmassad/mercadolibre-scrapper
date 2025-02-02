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
 * ShoppingCart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class ShoppingCart {
    @JsonProperty("buy")
    private String buy = null;

    @JsonProperty("sell")
    private String sell = null;

    public ShoppingCart buy(String buy) {
        this.buy = buy;
        return this;
    }

    /**
     * Get buy
     *
     * @return buy
     **/
    @ApiModelProperty(value = "")
    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public ShoppingCart sell(String sell) {
        this.sell = sell;
        return this;
    }

    /**
     * Get sell
     *
     * @return sell
     **/
    @ApiModelProperty(value = "")
    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShoppingCart shoppingCart = (ShoppingCart) o;
        return Objects.equals(this.buy, shoppingCart.buy) &&
                Objects.equals(this.sell, shoppingCart.sell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buy, sell);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShoppingCart {\n");

        sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
        sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
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

