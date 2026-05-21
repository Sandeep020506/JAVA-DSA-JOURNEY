/*
   Variable Naming Rules
   Concepts:
   - Valid variable names
   - Naming conventions
*/

public class VariableRules {

    public static void main(String[] args) {

        // Valid variable names
        int age = 21;
        int myAge = 21;
        int my_age = 21;
        int age21 = 21;
        int $salary = 50000;

        System.out.println(myAge);

        /*
           Invalid Variable Names:

           int 1age = 10;      // Cannot start with number
           int my age = 10;    // Space not allowed
           int class = 10;     // Reserved keyword
        */
    }
}