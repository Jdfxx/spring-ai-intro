package pl.filiphagno.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.math.BigDecimal;

@JsonClassDescription("Stock price response")
public record StockPriceResponse(@JsonPropertyDescription("ticker symbol of stock") String ticker,
                                 @JsonPropertyDescription("Company name") String name,
                                 @JsonPropertyDescription("Price of stock in USD") BigDecimal price,
                                 @JsonPropertyDescription("The exchange the stock is traded on") String exchange,
                                 @JsonPropertyDescription("Epoch Time of quote") Integer updated,
                                 @JsonPropertyDescription("Epoch Time of quote") String currency) {
}
