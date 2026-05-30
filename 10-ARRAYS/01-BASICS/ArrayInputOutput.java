/*
   Array Input Output
   Concepts:
   - Taking input
   - Printing array
*/

import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating array of size 5
        int[] numbers = new int[5];

        // Taking input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Printing array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}