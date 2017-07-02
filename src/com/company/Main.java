package com.company;

public class Main {

    public static void main(String[] args) {
        Animals[] array = new Animals[] {new Giraffe(), new Lion(), new Monkey()};
        for (int x = 0; x < array.length; x++)
            array[x].Beast();
    }
}
