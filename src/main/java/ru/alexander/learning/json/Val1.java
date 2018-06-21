package ru.alexander.learning.json;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Val1 {


    @JsonProperty("Valute")
    public final String valute;
    @JsonProperty("ID")
    public final String id;
    @JsonProperty("NumCode")
    public final int numCode;
    @JsonProperty("CharCode")
    public final String charCode;
    @JsonProperty("Nominal")
    public final int nominal;
    @JsonProperty("Name")
    public final String name;
    @JsonProperty("Value")
    public final double value;
    @JsonProperty("Previous")
    public final double previous;

    @JsonCreator
    public Val1(
            @JsonProperty("Valute") String valute,
            @JsonProperty("ID") String id,
            @JsonProperty("NumCode") int numCode,
            @JsonProperty("CharCode") String charCode,
            @JsonProperty("Nominal") int nominal,
            @JsonProperty("Name") String name,
            @JsonProperty("Value") double value,
            @JsonProperty("Previous") double previous) {

        this.valute = valute;
        this.id = id;
        this.numCode = numCode;
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
        this.previous = previous;
}}
