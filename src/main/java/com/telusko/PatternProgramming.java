package com.telusko;

public class PatternProgramming
{

    public static void main(String[] args)
    {
        int i, j;
        int n=9;

        for(i=0; i<n; i++)
        {
            //* T
            for(j=0;j<n;j++)
            {
                if(i==0 || j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //* E
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //* L
            for(j=0;j<n;j++)
            {
                if(j==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //* U
            for(j=0;j<n;j++)
            {
                if(i==n-1 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //* S
            for(j=0;j<n;j++)
            {
                if(i==0 || i==(n-1)/2 || i==n-1 || j==0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //* K
            for(j=0;j<n;j++)
            {
                if(j==0 || i+j==n-4 || i-j==n-6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //* O
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
