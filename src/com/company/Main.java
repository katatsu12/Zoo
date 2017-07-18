package com.company;

public class Main {

    public static void main(String[] args) {

        Lion l = new Lion();
        Monkey m = new Monkey();
        Giraffe g = new Giraffe();

        g.Beast();
        g.Feeding();
        g.Vitamins();

        l.Beast();
        l.Feeding();
        l.Vitamins();

        m.Beast();
        m.Feeding();
        m.Vitamins();

    }
}
