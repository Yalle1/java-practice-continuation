package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@ToString
public class Student {

    private final String name;
    private final int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
