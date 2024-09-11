package com.learninggradle.application;


import static com.learninggradle.businesslogic.GcdCalculator.gcdArray;

public class Application {
    public static void main(String[] args) {
        int[] input;
        input = new int[] {20, 30, 50, 70};
        System.out.println(gcdArray(input));
    }
}
