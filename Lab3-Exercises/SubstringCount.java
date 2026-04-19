package Lab3;

/*
Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
*/

public class SubstringCount {

    // User defined function
    public static int countOccurrences(String mainStr, String subStr) {

        if (mainStr == null || subStr == null || subStr.length() == 0) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {

        String mainString = "Java is fun. Java is powerful. Java is popular.";
        String subString = "Java";

        System.out.println("Main String: " + mainString);
        System.out.println("Substring: " + subString);

        int result = countOccurrences(mainString, subString);

        System.out.println("Number of occurrences: " + result);
    }
}