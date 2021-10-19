package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {

        int N = power();

        while( N < 0 || N > 31){
            System.out.println("Enter N value between 0 and 31");
            N = power();
        }
        for(int i=0;i<=N;i++) {
            System.out.println("2 power "+ i +" is: " + Math.pow(2, i));
        }
    }
    public static int power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        return scanner.nextInt();
    }
}
