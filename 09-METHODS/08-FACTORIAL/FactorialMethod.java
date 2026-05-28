/*
   Factorial using Method
   Concept:
   - Loop inside method
*/

public class FactorialMethod {

    static int factorial(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}