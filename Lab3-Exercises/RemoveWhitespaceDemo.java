package Lab3;

/*
Q5. Write a Java Program for Eliminating all whitespace characters from a string using user
defined function removeWhitespace()
*/

public class RemoveWhitespaceDemo {

    // User defined function
    public static String removeWhitespace(String str) {

        if (str == null) {
            return null;
        }

        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        String input = "  Java   Programming   Language  ";

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("After removing whitespace: \"" + removeWhitespace(input) + "\"");
    }
}