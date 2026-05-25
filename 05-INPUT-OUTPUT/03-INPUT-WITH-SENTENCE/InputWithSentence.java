/*
   Taking Full Sentence Input
   Concept:
   - nextLine()
*/

import java.util.Scanner;

public class InputWithSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        System.out.println(fullName);

        sc.close();
    }
}