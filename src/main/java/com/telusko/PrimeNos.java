package com.telusko;

public class PrimeNos {
    public static void main(String[] args) {
    // Prime Numbers
        int n = 100;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i!= 1) {
                System.out.print(i + " ");
            }
        }
    }
}
