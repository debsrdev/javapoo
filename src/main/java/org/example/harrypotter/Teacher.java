package org.example.harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Character {
    private String subject;

    public Teacher (String name, String house, int age, String subject) {
        super(name, house, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teachClass() {
        System.out.println(getName() + " teaches " + subject);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm professor " + getName() + " and I teach " + subject);
    }
}
