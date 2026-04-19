package Lab3;

/*
Q10. Write a Java Program for Counting the number of words in a string using user defined
function countWords()
*/

public class WordCountDemo {

    // User defined function
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        String input = "Java programming is very powerful and useful";

        System.out.println("String: " + input);
        System.out.println("Number of words: " + countWords(input));
    }
}