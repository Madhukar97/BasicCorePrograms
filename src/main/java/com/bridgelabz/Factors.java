package com.bridgelabz;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args){

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = scanner.nextInt();
        System.out.println("Prime factors are: ");

        for(int i = 2; i<= number; i++) {
            while(number%i == 0) {
                System.out.println(i);
                number = number/i;
            }
        }
    }
}
