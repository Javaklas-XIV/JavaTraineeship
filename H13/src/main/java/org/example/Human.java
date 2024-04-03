package org.example;

import lombok.Data;

@Data
public class Human {

    public String greet() {
        return "Gegroet!";
    }
}
