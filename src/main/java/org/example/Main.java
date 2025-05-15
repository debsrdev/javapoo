package org.example;

import org.example.harrypotter.Character;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character harryPotter = new Character("Harry Potter", "Gryffindor", 11);

        System.out.println(harryPotter.getName());
        harryPotter.setName("Harry Weasley");
        System.out.println(harryPotter.getName());
    }
}