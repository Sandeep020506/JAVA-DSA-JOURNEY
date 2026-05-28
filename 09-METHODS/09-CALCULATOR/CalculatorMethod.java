/*
   Calculator using Methods
   Concept:
   - Reusable methods
*/

public class CalculatorMethod {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        System.out.println(add(20, 10));
        System.out.println(subtract(20, 10));
    }
}