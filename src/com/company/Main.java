package com.company;

public class Main {

    public static void main(String[] args) {
        Animals[] array = new Animals[] {new Giraffe(), new Lion(), new Monkey()};
        for (int x = 0; x < array.length; x++)
            array[x].Beast();

        Lion lion = new Lion();
        Giraffe giraffe = new Giraffe();
        Monkey monkey = new Monkey();

        say(lion);
        say(giraffe);
        say(monkey);
    }

    public static void say(Animals animal){
        animal.Beast();
    }
}
