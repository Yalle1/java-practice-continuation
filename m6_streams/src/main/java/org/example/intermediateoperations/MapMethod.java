package org.example.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("Arraylist before mapping: " + integers);

        integers = integers.stream().map(p -> p * 10).collect(Collectors.toList());

        System.out.println("Arraylist after mapping (each element * 10): " + integers);

        System.out.println("------------------------------------------------------");

        List<Integer> integers2 = new ArrayList<>();
        integers2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("Arraylist before mapping: " + integers2);

        integers2 = integers2.stream().map(a -> {
                    if (a % 2 != 0) {
                        return a * 2;
                    } else {
                        return a * 1;
                    }
                }
        ).collect(Collectors.toList());

        System.out.println("Arraylist after mapping (each odd element * 2): " + integers2);

    }
}
