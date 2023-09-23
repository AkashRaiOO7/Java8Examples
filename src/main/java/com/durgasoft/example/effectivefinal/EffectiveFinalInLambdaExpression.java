package com.durgasoft.example.effectivefinal;

import java.util.function.Predicate;

public class EffectiveFinalInLambdaExpression {
    static int demo=2;
    public static void main(String[] args) {
        int x=10;
        Predicate<String> stringPredicate=  (s1)->{
            int y=20;
            //x= x+10;  --> local variable can't be change it should be final or effectively final
            demo= demo+2; //class level variable can be change
            System.out.println("x:"+ (x+10) +" y:"+y);
            return s1.length()>2;
        };
        stringPredicate.test("Hello");
    }
}
