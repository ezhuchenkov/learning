package ru.alexander.learning.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.alexander.learning.json.currency.Val1;

import java.net.URL;
import java.util.Scanner;

public class JsonMoney {
    public static void main(String[] args) throws Exception {

        String out = new Scanner(new URL("https://www.cbr-xml-daily.ru/daily_json.js").openStream(), "UTF-8").useDelimiter("\\A").next();
        ObjectMapper mapper = new ObjectMapper();
        Val1 val1 = mapper.readValue(out, Val1.class);
//        List<Money> money = new ArrayList<>();
//                money.add(mapper.readValue(out, Money.class));

    }

}

