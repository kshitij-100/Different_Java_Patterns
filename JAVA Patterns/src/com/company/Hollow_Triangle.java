package com.company;

public class Hollow_Triangle {
    public static void main(String[] args) {
        int size = 5;

        for (int i=1;i<=size;i++){
            for (int j=0; j<i;j++){
                if (i!=size){
                    if (j==0||j==i-1) {
                        System.out.print((char) (65+ j));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print((char)(65+j));
                }
            }
            System.out.println();
        }
    }
}
