package org.example.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        System.out.println("ArrayList before stream: " +numbers);

        numbers = numbers.stream().limit(5).collect(Collectors.toList());

        System.out.println("ArrayList after stream: " +numbers);

    }
}
