package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
            System.out.print(recurFib(num));
    }
    public static long recurFib(long value) {
        if (value <= 1) {
            return value;
        }
        long newValue = recurFib(value-1) + recurFib(value - 2);
        return newValue;
    }
}