package ru.alexander.learning.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String[] args) throws JsonProcessingException {
        MyClass my = new MyClass("123","456");
        ObjectMapper mapper = new ObjectMapper();

        String mm = mapper.writeValueAsString(my);
        System.out.println(mm);

        Map<String, Integer> map = new HashMap();
        map.put("a", 123);
        map.put("b", 456);
        String qq = mapper.writeValueAsString(map);
        System.out.println(qq);
    }
}
