package com.telusko.assignments;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        // Simple Interest Calculator //

        System.out.println("Welcome to Telusko Simple Interest Calculator");
        System.out.println("_____________________________________________");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Loan Amount:");
        double loanAmount = scanner.nextDouble();
        System.out.println("Enter the Rate of Interest:");
        double rateOfInterest = scanner.nextDouble();
        System.out.println("Enter the Loan tenure (Years):");
        int loanTenure = scanner.nextInt();

        double simpleInterest = (loanAmount * rateOfInterest * loanTenure) / 100;
        System.out.println(String.format("Simple Interest for a Loan Amount of %.2f at an Interest rate of %.2f for a loan period of %d (Years) is %.2f ", loanAmount, rateOfInterest, loanTenure, simpleInterest));
    }
}
