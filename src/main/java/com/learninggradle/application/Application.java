package com.learninggradle.application;


import java.sql.SQLOutput;

import static com.learninggradle.businesslogic.GcdCalculator.gcdArray;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide integers as command-line arguments");
            return;
        }

        int[] input = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            input[i] = Integer.parseInt(args[i]);
        }

        int result = gcdArray(input);
        System.out.println("The GCD of provided numbers is : " + result);

    }
}
