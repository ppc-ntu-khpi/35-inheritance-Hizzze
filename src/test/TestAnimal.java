package test;

import domain.Puma;

public class TestAnimal {

    public static void main(String[] args) {
        Puma puma = new Puma("Wild Cougar");
        System.out.println(puma);
        puma.hunt();
        puma.eat();
        puma.speak();
    }
}
