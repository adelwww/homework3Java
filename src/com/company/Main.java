package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Eren", "Mikasa", "Armin", "Levi"};

        for (int i = 0; i < names.length; i++) {
            switch (names[i]) {
                case "Eren":
                    System.out.println("Good morning " + names[i] + "!");
                    break;
                case "Mikasa":
                    System.out.println("Good day " + names[i] + "!");
                    break;
                case "Armin":
                    System.out.println("Good evening " + names[i] + "!");
                    break;
                case "Levi":
                    System.out.println("Good night " + names[i] + "!");
                    break;
            }
        }
    }
}
