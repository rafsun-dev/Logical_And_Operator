package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your letter: ");
        char letter = input.next().charAt(0);
        if (letter>'a' && letter<'z'){
            System.out.println("The letter is a small letter");
        }else if (letter>'A' && letter<'Z'){
            System.out.println("The letter is a capital letter");
        }else {
            System.out.println("It is not any letter");
        }
    }
}
