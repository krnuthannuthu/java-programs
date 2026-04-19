package Lab3;

/*
Q6. Write a Java Program for Capitalizing the first letter of each word using user defined
function capitalizeWords()
*/

public class CapitalizeWordsDemo {

    // User defined function
    public static String capitalizeWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return str;
        }

        String[] words = str.toLowerCase().split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result = result + Character.toUpperCase(word.charAt(0))
                        + word.substring(1) + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {

        String input = "java programming language is powerful";

        System.out.println("Original String: " + input);
        System.out.println("Capitalized String: " + capitalizeWords(input));
    }
}