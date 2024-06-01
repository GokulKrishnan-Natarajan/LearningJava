package com.telusko.assignments;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int result = 0;
        String resultString = null;
        System.out.println("Welcome to Telusko Calculator");
        System.out.println("_____________________________");
        
        System.out.println("Enter the Operation to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        if (operation < 1 || operation > 4) {
            System.out.println("Invalid Operation");
            return;
        }

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        switch (operation) {
            case 1:
                result = num1 + num2;
                resultString = "Sum of the numbers ";
                break;
            case 2:
                result = num1 - num2;
                resultString = "Difference between the numbers ";
                break;
            case 3:
                result = num1 * num2;
                resultString = "Product of the numbers ";
                break;
            case 4:
                result = num1 / num2;
                resultString = "Quotient of the numbers ";
                break;
            default:
                break;
        }
        System.out.println(resultString + num1 + " and " + num2 + " : " + result);
    }
}
