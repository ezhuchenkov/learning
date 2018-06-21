package ru.alexander.learning.json.currency;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Json1 {

    public static void main(String[] args) throws IOException {
        String out = new Scanner(new URL("https://www.cbr-xml-daily.ru/daily_json.js").openStream(), "UTF-8").useDelimiter("\\A").next();
        ObjectMapper mapper = new ObjectMapper();
        Money m = mapper.readValue(out,Money.class);
    }
}