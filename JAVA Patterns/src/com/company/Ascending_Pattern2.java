package com.company;

public class Ascending_Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2*n-2;
        for (int i=1; i<=n;i++){
            for (int j=k;j<=n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
