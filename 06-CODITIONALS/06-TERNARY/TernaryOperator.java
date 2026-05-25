/*
   Ternary Operator
   Concept:
   - Short form of if-else
*/

public class TernaryOperator {

    public static void main(String[] args) {

        int age = 19;

        String result = (age >= 18)
                ? "Adult"
                : "Minor";

        System.out.println(result);
    }
}