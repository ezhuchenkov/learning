package ru.alexander.learning.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Cat {

    @JsonProperty("Name")
    public final String name;
    public final int age;
    public List<String> list;

    @JsonCreator
    public Cat(
            @JsonProperty("Name") String name,
            @JsonProperty("age") int age
    ) {
        this.name = name;
        this.age = age;
    }

}
