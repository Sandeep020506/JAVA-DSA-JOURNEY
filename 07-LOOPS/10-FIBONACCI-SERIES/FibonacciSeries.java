/*
   Fibonacci Series
   Concept:
   - Number pattern using loops
*/

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= 10; i++) {

            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
