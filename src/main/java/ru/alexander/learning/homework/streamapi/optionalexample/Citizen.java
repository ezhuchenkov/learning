package ru.alexander.learning.homework.streamapi.optionalexample;

import java.util.Optional;

/*
Алексей, [17.05.18 13:16]
Есть житель города
У него может быть почтовый адрес (может не быть)
В почтовом адресе может быть указана улица (может не быть)
На какой улице живет житель?

String getStreet(Citizen citizen) {
  Address address = citizen.address;
  if (address == null) {
    return “undefined”;
  }
  String street = address.street;
  if (street == null) {
    return “undefined”;
  }
  return street;
}

Вот это надо переписать с помощью Optional


Cуществует всего три категории Optional:

Optional.of — возвращает Optional-объект.

Optional.ofNullable -возвращает Optional-объект, а если нет дженерик-объекта, возвращает пустой Optional-объект.

Optional.empty — возвращает пустой Optional-объект.
 */
public class Citizen {
    public String name;
    public Address address;

    static class Address {
        public String street;
    }

    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "abc";
        citizen.address = new Address();
        citizen.address.street = "pushkinskaya";
    }

    public static String getSteet(Citizen citizen) {
        //return citizen.address?.street ?: "undefined"
        return Optional.ofNullable(citizen.address)
                .flatMap(a -> Optional.ofNullable(a.street))  //O<O<S>> -> O<S>
                .map(s -> s.toUpperCase())
                .orElse("undefined");
    }
}