package ru.alexander.learning.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static java.util.Arrays.asList;

public class JsonExample {

    // {int, int, string, long}
    //4 byte + 4 byte + 4 byte (length) + string + 8 byte

    //11010101010101 01010010101010 010110 10100101
    /*
    * <object>
    * <field name="field1" type="int" value="123"/>
*     </object>
    * */

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("Masha", 10);
        cat.list = asList("a", "b");

        ObjectMapper mapper = new ObjectMapper();

        String catText = mapper.writeValueAsString(cat); //serialize
        System.out.println(catText);

        Cat cat1 = mapper.readValue(catText, Cat.class); //deserialize

    }




}
