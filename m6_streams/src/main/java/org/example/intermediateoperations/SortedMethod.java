package org.example.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1,3,4,6,7,3,2,5,6));

        System.out.println("ArrayList before sorting: " + integers);

        integers = integers.stream().distinct().sorted((o1, o2) -> {
            if (o1<o2) return 1;
            else if (o1==o2) return 0;
            else return -1;
        }).collect(Collectors.toList());

        System.out.println("ArrayList after sorting and removing duplicates: " + integers);


    }
}
