package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10 > o2%10){
                    return 1;
                } else return -1;
            }
        };

        Collections.sort(list, com);

        System.out.println(list);

        List<Student> students = new ArrayList<>();

        students.add(new Student("John",20));
        students.add(new Student("Tom",10));
        students.add(new Student("George",16));
        students.add(new Student("Tim",24));

        Comparator<Student> studentComparator = (o1, o2) -> {
            if (o1.getAge()>o2.getAge()){
                return 1;
            } else return -1;
        };

        Collections.sort(students,studentComparator);

        for (Student s : students){
            System.out.println(s);
        }








    }
}
