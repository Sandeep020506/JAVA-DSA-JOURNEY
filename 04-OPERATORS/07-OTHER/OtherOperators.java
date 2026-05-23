/*
   Other Operators
   Concepts:
   - Ternary Operator
   - instanceof
*/

public class OtherOperators {

    public static void main(String[] args) {

        // Ternary Operator
        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        // instanceof Operator
        String name = "Sandeep";

        System.out.println(name instanceof String);
    }
}