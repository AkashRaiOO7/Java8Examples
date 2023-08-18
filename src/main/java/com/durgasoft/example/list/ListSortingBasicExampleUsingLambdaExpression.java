package com.durgasoft.example.list;

import java.util.*;

public class ListSortingBasicExampleUsingLambdaExpression {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(12,46,4,41,89));
        Comparator<Integer> comparator = (i1, i2) -> i1>i2 ? -1 : (i1<i2) ? 1 : 0;
        Collections.sort(listOfIntegers, comparator);
        listOfIntegers.forEach(System.out::println);
    }
}
