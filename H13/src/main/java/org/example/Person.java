package org.example;

import lombok.Data;

@Data
public class Person extends Human {

    private String name;
    private int age;

    private String gender = "UNKNOWN";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String greet() {
        return this.name + " (" + this.age + ") is " + this.gender + ".";
    }
}
