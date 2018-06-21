package ru.alexander.learning.json.currency;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Val1 {

    @JsonProperty("Value")
    public  double value;

    @JsonCreator
    public double Val1(

            @JsonProperty("Value") double value)
 {

        return value;
}}
