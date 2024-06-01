package com.telusko.assignments;

import java.util.Random;
import java.util.Scanner;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to Telusko Random Number Generator");
        System.out.println("__________________________________________");

        int attempt = 0;
        int maxAttempts = 3;

        //Generate a Random numbers//
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("Secret Number : " + randomNumber);

        //Guess the Secret Number//
        do {
            System.out.println("Guess your Secret Number:");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if (userInput == randomNumber) {
                System.out.println("Congratulations! You guessed the Secret Number right !!!");
                break;
            } else if (userInput < randomNumber) {
                System.out.println("Your number is less than the Secret Number.");
            } else if (userInput > randomNumber) {
                System.out.println("Your number is greater than the Secret Number.");
            }
            attempt++;
            if (attempt == maxAttempts && userInput != randomNumber) {
                System.out.println("Sorry... You have exceeded the maximum number of allowed attempts !!!");
            }
        } while (attempt < maxAttempts);

    }
}


