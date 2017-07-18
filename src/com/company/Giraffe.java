package com.company;

import java.util.Scanner;

public class Giraffe implements Animals, ZooKeeper, Veterinary{
    @Override
    public String Beast() {
        System.out.println("Giraffe");
        return null;
    }

    @Override
    public String Vitamins() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the vitamins: ");
        String vitamins = in.nextLine();
        System.out.println("Recommended vitamins for giraffe: " + vitamins);
        return null;
    }



    @Override
    public String Feeding() {
        System.out.println("Feeding: Leaves of trees");
        return null;
    }
}
