package com.company;

import java.util.Scanner;

public class Main {
    /**
     * @param args This part takes no argument, but scanns for user input in the main loop
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
            System.out.print("The "+ num+"th term of the Fibonacci sequence is "+recurFib(num)+".");
    }

    /**
     * This function takes the number you pass and breaks it down to compelete the Fib seq from here it recursivly breaks down until it can build from the bottom up
     *
     * @author Allen Youngblood 1/17/2022
     * @param value value is the number that you want to pull from the Fibbinochi sequence. this number is a @type long.
     * @return returns the passed value if its greater or equal to one, if not it begins passing the function recursively until it  meets these specs
     */
    public static long recurFib(long value) {
        if (value <= 1) {
            return value;
        }
        long newValue = recurFib(value-1) + recurFib(value - 2);
        return newValue;
    }
}