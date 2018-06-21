package ru.alexander.learning.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Json1 {

    public static void main(String[] args) throws IOException {
        String s = "{\n" +
                "    \"Date\": \"2018-06-22T11:30:00+03:00\",\n" +
                "    \"PreviousDate\": \"2018-06-21T11:30:00+03:00\",\n" +
                "    \"PreviousURL\": \"\\/\\/www.cbr-xml-daily.ru\\/archive\\/2018\\/06\\/21\\/daily_json.js\",\n" +
                "    \"Timestamp\": \"2018-06-21T20:00:00+03:00\",\n" +
                "    \"Valute\": {\n" +
                "        \"AUD\": {\n" +
                "            \"ID\": \"R01010\",\n" +
                "            \"NumCode\": \"036\",\n" +
                "            \"CharCode\": \"AUD\",\n" +
                "            \"Nominal\": 1,\n" +
                "            \"Name\": \"РђРІСЃС‚СЂР°Р»РёР№СЃРєРёР№ РґРѕР»Р»Р°СЂ\",\n" +
                "            \"Value\": 46.9985,\n" +
                "            \"Previous\": 46.9942\n" +
                "        }}}";
        ObjectMapper mapper = new ObjectMapper();
        List<Money> money = new ArrayList<>();
        money.add(mapper.readValue(s, Money.class));
    }
}
