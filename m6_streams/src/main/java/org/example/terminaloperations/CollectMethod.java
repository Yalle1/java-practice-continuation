package org.example.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Python", "Job", "Apple", "Android", "JavaScript", "Clock", "Book", "Table"));

        List<String> result = words.stream().filter(p -> p.startsWith("J")).peek(System.out::println).collect(Collectors.toList());

        System.out.println(result);

    }
}
