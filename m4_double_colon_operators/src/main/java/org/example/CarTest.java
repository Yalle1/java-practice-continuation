package org.example;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero Args Constructor
        Supplier<Car> c1 = () -> new Car();
        Supplier<Car> c2 = Car::new;

        BiFunction<String,Integer,Car> c3 = Car::new;
        BiFunction<String,Integer,Car> c4 = (str, i) -> new Car();

        c3.apply("Honda",2015);
        Car car = c3.apply("Honda",2015);


        System.out.println(car);
    }
}
