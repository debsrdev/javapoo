package org.example.harrypotter;

public class Character {
    private String name;
    private String house;
    private int age;
    public Character(String name, String house, int age) {
        this.name = name;
        this.house = house;
        this.age = age;
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
}
