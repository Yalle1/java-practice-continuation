package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){

                if (o1 > o2) return 1;
                else if (o1 == o2) {
                    return 0;
                } else return -1;
            }
        };

        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,67,2,7,2));

        list.sort(comparator);

        System.out.println(list);






    }


}
