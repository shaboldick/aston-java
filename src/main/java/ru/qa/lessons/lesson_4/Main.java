package ru.qa.lessons.lesson_4;

import ru.qa.lessons.lesson_4.tests.AnimalTest;
import ru.qa.lessons.lesson_4.tests.GeometryTest;

public class Main {
    public static void main(String[] args) {
        AnimalTest.testCatsAndFoodBowl();
        AnimalTest.testDog();

        GeometryTest.testFigures();
    }
}