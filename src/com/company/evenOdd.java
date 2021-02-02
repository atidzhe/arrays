package com.company;

public class evenOdd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i < arr.length; i ++){
        if (arr[i] % 2 == 0){
            sumEven = sumEven + arr[i];
        } else {
            sumOdd = sumOdd + arr[i];
        }
        }
        System.out.println("\nSum of even is: " + sumEven);
        System.out.println("\nSum of odd is: " + sumOdd);
    }
}