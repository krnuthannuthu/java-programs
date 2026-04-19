package Lab3;

/*
Q4. Write a Java Program for Checking if a string reads the same backward as forward
(ignoring case and punctuation) using user defined function isPalindrome()
*/

public class PalindromeCheck {

    // User defined function
    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        // Remove punctuation and spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "Madam";
        String s2 = "A man, a plan, a canal: Panama";
        String s3 = "Hello World";

        System.out.println("\"" + s1 + "\" is palindrome? " + isPalindrome(s1));
        System.out.println("\"" + s2 + "\" is palindrome? " + isPalindrome(s2));
        System.out.println("\"" + s3 + "\" is palindrome? " + isPalindrome(s3));
    }
}