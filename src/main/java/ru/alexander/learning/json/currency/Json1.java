package ru.alexander.learning.json.currency;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Json1 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        String out = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        ObjectMapper mapper = new ObjectMapper();
        Money m = mapper.readValue(out, Money.class);
        System.out.println(m.map.get("AUD").value);

    }
}
