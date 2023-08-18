package com.durgasoft.example.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortingBasicExampleUsingLambda {
    public static void main(String[] args) {
        Comparator<String>  stringComparator = (s1, s2)-> -s1.compareTo(s2);
        TreeSet<String> ts = new TreeSet<>(stringComparator);
        ts.add("Trish");
        ts.add("Aki");
        ts.add("Guda");
        ts.forEach(System.out::println);
    }
}
