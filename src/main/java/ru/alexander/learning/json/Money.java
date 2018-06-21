package ru.alexander.learning.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Money {

    @JsonProperty("Valute")
   public final Val1 valute;

    @JsonCreator
    public Money(@JsonProperty("Valute") Val1 valute) {
        this.valute = valute;
    }
}




