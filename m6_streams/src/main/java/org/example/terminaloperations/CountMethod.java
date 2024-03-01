package org.example.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountMethod {

    public static void main(String[] args) {

        long n = Stream.of(1,2,3,4,5,6,7,8,9).count();

        System.out.println(n);

        System.out.println("----------------");

        List<String> list = new ArrayList<>(Arrays.asList("Java","Python","C#","C++","Java","Ruby","Swift","Java","Java"));

        long l = list.stream().filter(p -> p.equals("Java")).count();

        System.out.println("Number of \"Java\" in the list: "+ l);

    }
}
