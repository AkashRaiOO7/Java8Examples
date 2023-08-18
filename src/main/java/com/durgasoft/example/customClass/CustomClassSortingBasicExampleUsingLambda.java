package com.durgasoft.example.customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomClassSortingBasicExampleUsingLambda {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(10, "CS"), new Employee(2, "ME"), new Employee(18, "CE")));
        Collections.sort(list, (id1, id2)-> id1.getId()>id2.getId() ? 1:(id1.getId()<id2.getId()) ? -1:0);
        list.forEach(System.out::println);
    }
}
