package org.example.terminaloperations;

import java.util.Arrays;

public class ToArrayMethod {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        arr = Arrays.stream(arr).limit(5).toArray();

        System.out.println(Arrays.toString(arr));

    }
}
