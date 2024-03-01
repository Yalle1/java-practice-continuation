package org.example.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("Arraylist before filter(): "+ integers);

        integers = integers.stream().filter(a -> a%2 == 0).map(a -> a*10).collect(Collectors.toList());

        System.out.println("Arraylist after filter(): "+ integers);

    }
}
