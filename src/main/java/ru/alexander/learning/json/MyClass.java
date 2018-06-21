package ru.alexander.learning.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MyClass {
    @JsonProperty("a")
    String a;
    @JsonProperty("b")
    String b;


    @JsonCreator
    public MyClass(@JsonProperty("a") String a, @JsonProperty("b") String b) {
        this.a=a;
        this.b=b;
    }
}
