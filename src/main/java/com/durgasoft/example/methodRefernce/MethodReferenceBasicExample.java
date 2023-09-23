package com.durgasoft.example.methodRefernce;

@FunctionalInterface
interface Interf{
    void m1();
}
public class MethodReferenceBasicExample {
    public static void m2(){
        System.out.println("I'm m2.. helping m1 for implementation using method reference");
    }
    public static void main(String[] args) {
        Interf interf= MethodReferenceBasicExample::m2;
        interf.m1();
    }
}
