package com.company;

public class Filled_Triangle {
    public static void main(String[] args) {

        int m = 1;
        int x = 5;
        int y = x-1;

        for (int i=0;i<x;i++){
            for (int j=y; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<m; k++)
            {
                System.out.print((char)(65+k));
            }
            m+=2;
            System.out.println();
        }

    }
}
