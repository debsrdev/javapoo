package org.example;

import org.example.harrypotter.Student;
import org.example.harrypotter.Teacher;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Student harryPotter = new Student("Harry Potter", "Gryffindor", 11, 1);
        Teacher severusSnape = new Teacher("Severus Snape", "Slytherin", 50, "Potions");
        System.out.println(ANSI_BLUE + "***** Presentation *****" + ANSI_RESET);
        System.out.println(harryPotter.getName() + " is from " + harryPotter.getHouse() + "'s house and with " + harryPotter.getAge() + " years old is in year " + harryPotter.getYear() );
        System.out.println("\t");
        System.out.println(ANSI_GREEN + "***** Spells *****" + ANSI_RESET);
        harryPotter.castSpell("Expelliarmus");
        severusSnape.castSpell("Sectumsempra");
        System.out.println(ANSI_RED + "***** Knowledges *****" + ANSI_RESET);
        harryPotter.learnSpell("Imperius");
        harryPotter.learnSpell("Cruciatus");

        harryPotter.listSpells();
        severusSnape.listSpells();
        System.out.println("\t");
        System.out.println(ANSI_PURPLE + "***** Classes *****" + ANSI_RESET);
        harryPotter.attendClass("Defense against the dark arts");
        severusSnape.teachClass();
        System.out.println("\t");
    }
}