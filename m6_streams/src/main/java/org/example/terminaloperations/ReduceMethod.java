package org.example.terminaloperations;

import java.util.Arrays;

public class ReduceMethod {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        System.out.println("------------------------------------");

        String[] words = {"Java", "Python", "C#", "Java"};

        String combines = Arrays.stream(words).reduce("", (a, b) -> a + b);

        System.out.println(combines);

    }
}
