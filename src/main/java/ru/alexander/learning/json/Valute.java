package ru.alexander.learning.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Valute {


    @JsonProperty("Name")
    public final String name;
    @JsonProperty("Value")
    public final double value;

    @JsonCreator
    public Valute(

            @JsonProperty("Name") String name,
            @JsonProperty("Value") double value
            ) {
        this.name = name;


        this.value = value;


    }
}
