package com.durgasoft.example.lambdabasics;

public class ThreadBasicExampleUsingLambda {
    public static void main(String[] args) {
        Runnable run = ()-> System.out.println("Running");
        Thread t1 = new Thread(run);
        t1.start();
        System.out.println("Hello world!");
    }
}