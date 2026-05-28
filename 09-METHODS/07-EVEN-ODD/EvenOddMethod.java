/*
   Even Odd Method
   Concept:
   - Condition inside method
*/

public class EvenOddMethod {

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isEven(10));
    }
}