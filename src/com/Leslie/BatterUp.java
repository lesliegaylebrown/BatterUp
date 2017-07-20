package com.Leslie;


import java.util.Scanner;

public class BatterUp {

    public static void main(String[] args) {

        System.out.println("Welcome to Batter Average Calculator!");
        System.out.println();

        //ask the user to enter at bats
        System.out.println("Enter the number of times at bat: ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        int atBats = userInput;

        int[] bats = new int[atBats];

        //int[] bats = new int[atBats];

        for (int i = 0; i <= atBats; i++) {

        System.out.println("How many bases were earned for the at bat (0-4)?");
        int basesEarned = scan.nextInt();
        bats[i] = basesEarned;

        if (basesEarned > 0 && basesEarned <= 4) {
          // I need a method to sum the bases earned here
         double slugPercent = (i++/ atBats);
            System.out.println(slugPercent);

        }
        {

        }
    }



}
}
