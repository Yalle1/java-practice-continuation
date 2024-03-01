package org.example.intermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekMethod {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        integers.stream().filter(p -> p%5 == 0).peek(p -> System.out.println(p)).collect(Collectors.toList());

    }
}
