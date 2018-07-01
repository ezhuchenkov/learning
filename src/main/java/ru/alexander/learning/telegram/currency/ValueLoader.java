package ru.alexander.learning.telegram.currency;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ValueLoader {

    private final URL url;

    public ValueLoader() {
        try {
            this.url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getValue(String s) throws IOException {
        String out = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        ObjectMapper mapper = new ObjectMapper();
        Money m = mapper.readValue(out, Money.class);
        double value = m.map.get(s).value;
        return String.valueOf(value);

    }
}
