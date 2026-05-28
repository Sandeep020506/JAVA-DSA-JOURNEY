/*
   Scope of Variables
   Concept:
   - Local scope
*/

public class ScopeOfVariables {

    public static void main(String[] args) {

        int number = 10;

        if (number > 5) {

            int value = 100;

            System.out.println(value);
        }

        System.out.println(number);
    }
}