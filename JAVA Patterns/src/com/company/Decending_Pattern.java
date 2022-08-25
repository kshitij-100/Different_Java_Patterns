package com.company;
import java.util.Scanner;

public class Decending_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows");
        int r = sc.nextInt();
        System.out.println("Pattern with "+r+" Rows");
        for (int i=r; i>=1;i--){
            for (int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
