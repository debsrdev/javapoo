package org.example.harrypotter;

import java.util.ArrayList;
import java.util.List;

public abstract class Character implements SpellCaster {
    private String name;
    private String house;
    private int age;
    private final List<String> learnedSpells;
    public Character(String name, String house, int age) {
        this.name = name;
        this.house = house;
        this.age = age;
        this.learnedSpells = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void castSpell(String spell) {
        System.out.println(getName() + " casts " + spell);
    }
    @Override
    public void learnSpell(String spell){
        learnedSpells.add(spell);
        System.out.println(getName() + " knows hoy to cast " + spell);
    }
    @Override
    public void listSpells(){
        System.out.println(getName() + "'s learned spells: ");
        if (learnedSpells.isEmpty()) {
            System.out.println("- No spells learned yet");
        } else {
            for (String spell : learnedSpells){
                System.out.println(" - " + spell);
            }
        }
    }
    public abstract void introduce();
}
