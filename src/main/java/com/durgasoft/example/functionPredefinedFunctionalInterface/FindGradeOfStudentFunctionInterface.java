package com.durgasoft.example.functionPredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Student {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class FindGradeOfStudentFunctionInterface {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(80, "Akash"),
                new Student(70, "Puja"), new Student(100, "Sharvil"),
                new Student(50, "Mango")));
        Function<Integer, String> gradeSystem= (mark)-> mark>=80?"A":(mark>60) ? "B" : "C";
        studentList.forEach(student -> System.out.println(gradeSystem.apply(student.marks)));
    }
}
