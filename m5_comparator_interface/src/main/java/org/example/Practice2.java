package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("John","Tom","George","Isabelle"));

        System.out.println(list);

        Comparator<String> strCom = (o1, o2) -> {

            if (o1.length()>o2.length())return 1;
            else if (o1.length() == o2.length()) return 0;
            else return -1;

        };

        list.sort(strCom);

        System.out.println(list);

    }
}
