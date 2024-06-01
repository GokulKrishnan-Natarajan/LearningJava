package com.telusko;

public class Create2Darray {
    public static void main(String[] args) {
        // Create 2D array with 3 rows and 4 columns and print the values to screen for debugging purposes only
        int a[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = i + j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
