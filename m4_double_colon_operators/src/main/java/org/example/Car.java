package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    private String make;
    private int model;

    public Car(String make) {
        this.make = make;
    }
}
