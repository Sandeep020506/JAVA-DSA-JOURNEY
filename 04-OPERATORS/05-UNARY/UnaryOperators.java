/*
   Unary Operators
   Concepts:
   ++  Increment
   --  Decrement
*/

public class UnaryOperators {

    public static void main(String[] args) {

        int number = 10;

        // Pre Increment
        ++number;
        System.out.println(number);

        // Post Increment
        number++;
        System.out.println(number);

        // Pre Decrement
        --number;
        System.out.println(number);

        // Post Decrement
        number--;
        System.out.println(number);
    }
}