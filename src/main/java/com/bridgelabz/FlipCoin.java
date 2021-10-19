package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args){

        int heads = 0;
        int tails = 0;
        int coin;
        int n;

        Random random = new Random();
        n = coinFlip();
        while(n<=0) {
            System.out.println("Enter a positive integer.");
            n = coinFlip();
        }

        for(int i=0; i<n; i++) {

            coin = random.nextInt(2);
            switch (coin) {
                case 0 -> heads++;
                case 1 -> tails++;
            }
        }
        System.out.println("Heads = " + heads);
        System.out.println("Tails = " + tails);
        System.out.println("Percentage Heads= "+(double)heads/n*100+" %");
        System.out.println("Percentage Tails= "+(double)tails/n*100+" %");
        if ((double)heads/n>0.5){
            System.out.println("Its Heads");
        }else
            System.out.println("Its Tails");

    }
    public static int coinFlip(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin: ");
        return scanner.nextInt();
    }

}
