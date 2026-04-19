package Lab3;

/*
Q8. Write a Java Program for Verifying if a string contains only numeric characters using user
defined function isNumeric()
*/

public class NumericCheckDemo {

    // User defined function
    public static boolean isNumeric(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "123456";
        String s2 = "123a56";
        String s3 = "";

        System.out.println(s1 + " is numeric? " + isNumeric(s1));
        System.out.println(s2 + " is numeric? " + isNumeric(s2));
        System.out.println("Empty string is numeric? " + isNumeric(s3));
    }
}