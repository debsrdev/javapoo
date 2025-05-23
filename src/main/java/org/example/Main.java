package org.example;

import org.example.harrypotter.Student;
import org.example.harrypotter.Teacher;

public class Main {
    public static void main(String[] args) {
        Student harryPotter = new Student("Harry Potter", "Gryffindor", 11, 1);
        Teacher severusSnape = new Teacher("Severus Snape", "Slytherin", 50, "Potions");

        System.out.println(harryPotter.getName());

        harryPotter.introduce();

        harryPotter.castSpell("Expelliarmus");
        harryPotter.attendClass("Defense against the dark arts");

        severusSnape.teachClass();
        severusSnape.castSpell("Sectumsempra");

        harryPotter.learnSpell("Imperius");
        harryPotter.learnSpell("Cruciatus");

        harryPotter.listSpells();
        severusSnape.listSpells();

        harryPotter.castSpell("Lumos");
    }
}