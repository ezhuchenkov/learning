package ru.alexander.learning.telegram.currency;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Json1 {
    static String out;
    static double value;
    static String val;

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        out = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        getValue("USD");


    }

    public static String getValue(String s) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Money m = mapper.readValue(out, Money.class);
        System.out.println(value = m.map.get(s).value);
        return val= String.valueOf(value);

    }
}
