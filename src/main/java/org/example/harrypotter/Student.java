package org.example.harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Student extends Character {
    private int year;
    private List<String> learnedSpells;

    public Student (String name, String house, int age, int year) {
        super(name, house, age);
        this.year = year;
        this.learnedSpells = new ArrayList<>();
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

    @Override
    public void castSpell(String spell) {
        System.out.println(getName() + " casts " + spell);
    }
    @Override
    public void learnSpell(String spell) {
        learnedSpells.add(spell);
        System.out.println(getName() + " knows how to cast " + spell);
    }
    @Override
    public void listSpells() {
        System.out.println(getName() + "'s learned spells: ");
        if (learnedSpells.isEmpty()) {
            System.out.println(" - No spells learned yet");
        } else {
            for (String spell : learnedSpells) {
                System.out.println(" - " + spell);
            }
        }
    }

}
