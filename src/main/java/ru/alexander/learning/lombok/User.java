package ru.alexander.learning.lombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    private final String name;
    private int age;

}
