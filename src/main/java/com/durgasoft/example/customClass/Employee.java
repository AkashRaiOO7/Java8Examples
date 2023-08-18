package com.durgasoft.example.customClass;

public class Employee {
    private int id;
    private String department;

    public Employee(int id, String department) {
        this.id = id;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
