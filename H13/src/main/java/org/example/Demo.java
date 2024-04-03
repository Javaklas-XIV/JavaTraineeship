package org.example;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
//        Human person = new Person("Steven", 29);
//
//        House<Human> house = new House<>(person);
//
//        System.out.println(house);

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Dit is tekst in lijst 1");
        list2.add("Dit is ook tekst maar dan in lijst 2");

        System.out.println(list1.size() + list2.size());

        List<String> mergedList = ListCopy.copy(list2, list1);

        System.out.println(mergedList);

    }
}
