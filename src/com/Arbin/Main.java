package com.Arbin;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to building a pyramid of your desired height or storey");
        System.out.println("Enter the height of the pyramid you desire:");
        int height = keyboard.nextInt();
        String space=" ";
        for (int i = 1; i <= height; i++) {
            for (int k=0;k<=(height-2);k++);
                System.out.print(space);
            for (int j=1;j<=i;j++)
                System.out.print("*");
                System.out.println();

        }
    }
}