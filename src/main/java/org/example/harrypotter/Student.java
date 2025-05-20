package org.example.harrypotter;

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
    public void castSpell(String spell) {
        System.out.println(getName() + " casts " + spell);
    }
}
