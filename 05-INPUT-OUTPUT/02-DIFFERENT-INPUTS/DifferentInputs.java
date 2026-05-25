/*
   Different Types of Inputs
   Concepts:
   - int
   - double
   - boolean
   - char
*/

import java.util.Scanner;

public class DifferentInputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Are you student (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        System.out.println(age);
        System.out.println(height);
        System.out.println(isStudent);
        System.out.println(grade);

        sc.close();
    }
}