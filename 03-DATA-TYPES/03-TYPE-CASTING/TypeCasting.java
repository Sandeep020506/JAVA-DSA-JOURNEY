/*
   Type Casting
   Concepts:
   - Implicit Casting
   - Explicit Casting
*/

public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Casting (Small → Large)
        int number = 100;
        double price = number;

        System.out.println(price);

        // Explicit Casting (Large → Small)
        double marks = 95.8;
        int finalMarks = (int) marks;

        System.out.println(finalMarks);
    }
}