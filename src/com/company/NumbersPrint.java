package com.company;

import java.util.Scanner;

public class NumbersPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter N: ");
        int number = scanner.nextInt();

        int i = 0;

        while (i <= number) {
            System.out.println(i);
            i++;
        }

    }
}
