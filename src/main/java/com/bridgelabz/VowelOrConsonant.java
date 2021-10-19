package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        boolean is_Vowel=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        char alphabet = scanner.next().charAt(0);

        char[] vowels = {'a','e','i','o','u'};

        for (char item : vowels) {
            if (alphabet == item) {
                is_Vowel = true;
                break;
            }
        }
        if (is_Vowel){
            System.out.println( alphabet + " is a Vowel");
        }else
            System.out.println( alphabet + " is a Consonant");
    }
}

