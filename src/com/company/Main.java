package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // need to import java.util.Scaner;
        System.out.print("Input integer for FizzBuzz: ");
        int n = scanner.nextInt();

        System.out.println("Calculating FizzBuzz for n: " + n);
        String[] fizzBuzzR = fizzBuzz(n);

        System.out.println("Calculation Complete.");
    }

    public static String[] fizzBuzz(int n){
        // declaration of an array of integers
        String[] result;

        // allocate memory for our incoming n
        result = new String[n];

        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 3 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0){
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0){
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = Integer.toString(i);
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
            if(i == result.length - 1){
                System.out.println();
            }
        }

        return result;
    }
}
