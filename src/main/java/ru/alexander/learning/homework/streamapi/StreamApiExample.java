package ru.alexander.learning.homework.streamapi;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class StreamApiExample {

    public static void main1(String[] args) {
        List<Integer> source = asList(1, 2, 3, 4);
        List<Integer> dest = new ArrayList<>();
        for (Integer e : source) {
            if (e % 2 == 0) {
                dest.add(e);
            }
        }
        List<String> dest2 = source.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> String.valueOf(e))
                .collect(toList());
    }

    public static void main2(String[] args) {
        List<String> names = asList("Vasya", "Petya", "Tom");
        //3 -> {"Tom"}, 5 -> {"Vasya", "Petya"}
        Map<Integer, List<String>> result = names.stream().collect(groupingBy(n -> n.length()));
    }

    public static void main3(String[] args) {
        List<Integer> source = asList(1, 4, -1, 10);
        int max = source.stream().mapToInt(e -> e).max().orElse(0);
    }

    public static void main4(String[] args) {
        List<List<Integer>> lists = asList(
                asList(1, 2, 3),
                asList(4, 5)
        );
        int sum = lists.stream()
                .flatMap(l -> l.stream()) //<S<S<?>> -> S<?>
                .mapToInt(l -> l)
                .sum();
    }

    public static void main5(String[] args) {
        List<String> strings = asList("abc", "def", "qwerty");
        Map<Integer, List<String>> result = strings.stream()
                .filter(s -> getLength(s) >= 4)
                .collect(groupingBy(s -> getLength(s)));

        for (String s : strings) {
            int length = getLength(s);
            if (length < 4) {
                continue;
            }
            //...
        }
    }

    static int getLength(String s) {
        return s.length();
    }

    public static void main6(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> result = map.entrySet().stream()
                .collect(toMap(e -> e.getKey(), e -> e.getValue().length()));
    }

    public static void main7(String[] args) {
        List<String> result = Stream.of("abc", "def", "qwerty")
                .filter(s -> {
                    try {
                        return suit(s);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(toList());

    }

    public static boolean suit(String s) throws Exception {
        return true;
    }

    public static void main(String[] args) {
        List<String> list = asList("abc", "def");

        String previous = null;
        for (String s : list) {
            System.out.println(s);
            previous = s;
        }

        list.forEach(e -> {
            System.out.println(e);
            //previous = e;
        });
    }


}
