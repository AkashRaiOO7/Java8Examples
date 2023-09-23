package com.durgasoft.example.methodRefernce;

interface InterfReturningObject{
    ConstructorReference get();
}
public class ConstructorReference {
    @Override
    public String toString() {
        return "Constructor objects created";
    }

    public static void main(String[] args) {
        InterfReturningObject interfReturningObject= ConstructorReference::new;
        System.out.println(interfReturningObject.get());
    }
}
