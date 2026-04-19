package Lab3;

/*
Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis
using user defined function truncate()
*/

public class TruncateStringDemo {

    // User defined function
    public static String truncate(String str, int maxLength) {

        if (str == null) {
            return null;
        }

        if (str.length() <= maxLength) {
            return str;
        }

        if (maxLength <= 3) {
            return str.substring(0, maxLength);
        }

        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {

        String input = "Java programming is very powerful and useful";

        System.out.println("Original String: " + input);

        System.out.println("Truncated (10): " + truncate(input, 10));
        System.out.println("Truncated (20): " + truncate(input, 20));
    }
}