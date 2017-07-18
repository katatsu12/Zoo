package com.company;

import java.util.Scanner;

public class Monkey implements Animals, ZooKeeper, Veterinary {
    @Override
    public String Beast() {
        System.out.println("Monkey");
        return null;
    }

    @Override
    public String Vitamins() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the vitamins: ");
        String vitamins = in.nextLine();
        System.out.println("Recommended vitamins for monkey: " + vitamins);
        return null;
    }

    @Override
    public String Feeding() {
        System.out.println("Feeding: Bananas");
        return null;
    }
}
