package ru.alexander.learning.homework.StreamAPITest.OptionalExmpl;

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

    private Optional<String> name;

    private Optional<String> address;


    public Optional<String> getName() {
        return name;
    }
//    public Optional<String> setName() {
//        this.name = Optional.of(name);
//    }


    public Optional<String> getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = Optional.of(address);
    }



    class Address {
        private Optional<String> street;

        public void setStreet(String street) {
            this.street = Optional.of(street);
        }

        public Optional<String> getStreet() {
            return street;
        }
    }

    public static void main(String[] args) {
        Citizen citizen=new Citizen();
        citizen.setAddress("Alex");
    }
}