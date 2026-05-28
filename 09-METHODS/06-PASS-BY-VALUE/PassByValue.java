/*
   Pass By Value
   Concept:
   - Copy of value is passed
*/

public class PassByValue {

    static void changeValue(int number) {
        number = 100;
    }

    public static void main(String[] args) {

        int number = 10;

        changeValue(number);

        System.out.println(number);
    }
}