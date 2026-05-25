/*
   Type Casting Input
   Concept:
   - Convert double to int
*/

import java.util.Scanner;

public class TypeCastingInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        int finalMarks = (int) marks;

        System.out.println(finalMarks);

        sc.close();
    }
}