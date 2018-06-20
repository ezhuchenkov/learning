package ru.alexander.learning.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Money {

    @JsonProperty("Valute")
    private final List<Valute> valutes;

    @JsonCreator
    public Money(@JsonProperty("Valute") List<Valute> valutes) {
        this.valutes = valutes;
    }
}




