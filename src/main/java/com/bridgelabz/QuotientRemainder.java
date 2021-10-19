package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dividend and Divisor: ");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend%divisor;

        System.out.println("The Quotient is = "+quotient+" and the Remainder is = "+remainder);


    }

}
