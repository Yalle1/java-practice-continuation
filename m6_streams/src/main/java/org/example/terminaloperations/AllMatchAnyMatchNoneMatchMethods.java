package org.example.terminaloperations;

import java.util.Arrays;

public class AllMatchAnyMatchNoneMatchMethods {

    public static void main(String[] args) {

        //allMatch(Predicate): checks ifa ll the elements in the stream matches with the specified predicate
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean b1 = Arrays.stream(arr1).allMatch(p -> p < 10);

        System.out.println(b1); //true

        System.out.println("------------------");

        //anyMatch(Predicate): checks if any of the elements in the stream matches with the specified predicate
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean b2 = Arrays.stream(arr1).anyMatch(p -> p % 2 != 0); // checks if there is any odd number in the array

        System.out.println(b2); //true

        System.out.println("------------------");

        //noneMatch(Predicate): checks if any of the elements in the stream matches with the specified predicate
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean b3 = Arrays.stream(arr3).noneMatch(p -> p == 10); // If none match the specified element, it returns true, opposite of anyMatch()

        System.out.println(b3); // true

    }
}
