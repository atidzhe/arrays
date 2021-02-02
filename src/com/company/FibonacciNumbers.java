package com.company;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter N: ");
        int number = scanner.nextInt();
        int f1 = 0, f2 = 1, i;

        if (number < 1)
            return;
        System.out.print(f1 + " ");
        for (i = 1; i < number; i++)
        {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}
