package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(4,5,6,7,8,9);

//        Stream<Integer> data = integers.stream();
//
//        Stream<Integer> mappedData = data.map(p -> p*2);
//
//        mappedData.forEach(p -> System.out.println(p));

        integers.stream()
                .sorted()
                .map(p -> p*2)
                .forEach(p -> System.out.print(p));




    }
}
