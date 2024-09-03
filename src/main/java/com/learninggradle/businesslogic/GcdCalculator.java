package com.learninggradle.businesslogic;


//function to find gcd of two numbers
public class GcdCalculator {
    static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b % a, a);
    }

//    function to find gcd of n numbers
    public static int gcdArray(int array[]){
        int result = array[0];
        for(int element: array){
            result = gcd(result, element);
            if(result == 1){
                return 1;
            }
        }

        return result;
    }


    public static void main(String[] args){

        int[] input = {20,30,50,70};
        System.out.println(gcdArray(input));
    }
}