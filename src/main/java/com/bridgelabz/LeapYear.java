package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){

        int year = Year();

        while(year<1000 || year>9999){
            System.out.println("Enter a four digit number.");
            year = Year();
        }

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }

    public static int Year(){
        System.out.println("Enter an Year :: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
