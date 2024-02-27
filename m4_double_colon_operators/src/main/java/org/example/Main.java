package org.example;

import lombok.ToString;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){

        Calculate<Integer> sum1 = (a, b) -> {
            System.out.println("Sum: "+(a+b));
        };

        Calculate<Integer> sum2 = (x,y) -> {
            Calculator.findSum(x,y);
        };

        Calculate<Integer> sum3 = Calculator::findSum;

        Calculator obj = new Calculator();

        Calculate<Integer> multiplied1 = obj::findMultipliedSum;


        sum1.calculate(10,10);

        System.out.println("----------------------------");

        BiFunction<String, Integer, String> function1 = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> function2 = String::substring;

        System.out.println("----------------------------");

        Function<Integer,Double> b1 = new MyClass()::method;

        BiFunction<MyClass,Integer,Double> b2 = MyClass::method;

        System.out.println("----------------------------");

        Consumer<Integer> display1 = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

        display1.accept(20);
        display2.accept(10);

    }
}
