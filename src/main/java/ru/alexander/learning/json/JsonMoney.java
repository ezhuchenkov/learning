package ru.alexander.learning.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonMoney {
    public static void main(String[] args) throws Exception {

       String out = new Scanner(new URL("https://www.cbr-xml-daily.ru/daily_json.js").openStream(), "UTF-8").useDelimiter("\\A").next();

        ObjectMapper mapper = new ObjectMapper();
        List<Money> money = new ArrayList<>();
                money.add(mapper.readValue(out, Money.class));

    }

}

