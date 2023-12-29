package org.studyeasy;

public class Sample {
    public static void main(String[] args) {
        String name = "Editor";

        switch (name.toLowerCase()) {
            case "author" -> System.out.println("Chaand");
            case "team" -> System.out.println("Team StudyEasy");
            case "editor" -> System.out.println("Jack and Jill");
            default -> System.out.println("Invalid entry");
        }

    }
}