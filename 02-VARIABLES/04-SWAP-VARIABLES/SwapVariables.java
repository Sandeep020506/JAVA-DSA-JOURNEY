/*
   Swapping Variables
   Concept:
   - Using temporary variable
*/

public class SwapVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Temporary variable for swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}