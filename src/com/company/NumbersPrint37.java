package com.company;

import java.util.Scanner;

public class NumbersPrint37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter N: ");
        int number = scanner.nextInt();

            for (int i = 1; i <= number; i++)
            {
                if (i % 3 == 0 && i % 7 == 0)
                    System.out.print(i + " ");
            }
        }
    }

