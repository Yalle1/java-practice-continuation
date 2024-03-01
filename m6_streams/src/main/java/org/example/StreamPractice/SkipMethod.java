package org.example.StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        System.out.println(numbers);

        System.out.println("---------------------------------");

        List<Integer> integers = numbers.stream().skip(5).collect(Collectors.toList());

        System.out.println(integers);

        System.out.println("---------------------------------");

        int[] arr = {10,20,30,40,50,60,70,80,90};

        System.out.println("Original array: " + Arrays.toString(arr));

        arr = Arrays.stream(arr).skip(5).toArray();

        System.out.println("Array with skip(5): " + Arrays.toString(arr));

    }
}
