package com.durgasoft.example.treemap;

import java.util.TreeMap;

public class TreeMapSortingBasicExampleUsingLambda {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap= new TreeMap<>((i1, i2)->i1>i2?-1:(i1<i2)?1:0);
        treeMap.put(10,"Akash");
        treeMap.put(1, "Garudh");
        treeMap.put(17, "Hanu");
        System.out.println("---TreeMap Values---");
        treeMap.forEach((k, v)->System.out.println(k+" "+v));
    }
}
