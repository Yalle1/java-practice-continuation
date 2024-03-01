package org.example.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,6,7,8,9));

        numbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(numbers);

        System.out.println("----------------------------------------------");

        int[] arr = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,6,7,8,9};

        arr = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(arr));


    }
}
