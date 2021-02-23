package ru.mirea.ikbo_16_19.isaev;

import ru.mirea.ikbo_16_19.isaev.exercise4.Human;

public class TestMain {
    public static void main(String[] args) {
        Circle cir = new Circle(12, 0, 0);
        System.out.println(cir.toString());
        Human chelovecheck = new Human();
        System.out.println(chelovecheck.toString());
        System.out.println("Думаю это стоит оценить на 5");
    }
}
