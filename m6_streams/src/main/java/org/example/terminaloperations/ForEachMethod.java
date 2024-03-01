package org.example.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.stream().map(p -> p*2).forEach(System.out::println);


    }
}
