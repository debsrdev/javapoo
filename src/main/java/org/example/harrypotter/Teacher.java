package org.example.harrypotter;

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
}
