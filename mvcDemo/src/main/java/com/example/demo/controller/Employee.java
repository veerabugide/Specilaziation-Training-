package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    int id;
    String name;
    String desig;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public Employee(int id, String name, String desig) {
        this.id = id;
        this.name = name;
        this.desig = desig;
    }

    public Employee() {
    }
}
