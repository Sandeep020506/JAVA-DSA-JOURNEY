/*
   Nested If
   Concept:
   - If inside another if
*/

public class NestedIf {

    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Can drive");
            }
        }
    }
}