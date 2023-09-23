package com.durgasoft.example.predicate;

import java.util.function.Predicate;

public class RemoveNullAndEmptyStringUsingPredicateJava8 {
    public static void main(String[] args) {
        String[] str= {"Akash", "", null, "Rai"};
        Predicate<String> stringPredicate= s -> s!=null && s.length()!=0;
        for(String s1: str){
            if(stringPredicate.test(s1)) {
                System.out.println(s1);
            }
        }
    }
}
