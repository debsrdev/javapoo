package org.example.harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Student extends Character {
    private int year;

    public Student (String name, String house, int age, int year) {
        super(name, house, age);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void attendClass(String subject){
        System.out.println(getName() + " attends " + subject + " class");
    }

    @Override
    public void introduce() {
        System.out.println("Hi I'm " + getName() + " from " + getHouse() + ", year " + getYear());
    }
}
