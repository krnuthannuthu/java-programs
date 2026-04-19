package Lab3;
/*
Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
*/

public class ReverseStringDemo {

    // User defined function
    public static String reverseString(String str) {

        if (str == null) {
            return null;
        }

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String input = "Java Programming";

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }
}