package org.example.harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Character {
    private String subject;
    private List<String> learnedSpells;

    public Teacher (String name, String house, int age, String subject) {
        super(name, house, age);
        this.subject = subject;
        this.learnedSpells = new ArrayList<>();
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
