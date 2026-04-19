package Lab3;
/*
Q9. Write a Java Program for Creating a random string of a specified length using user
defined function generateRandomString()
*/

import java.util.Random;

public class RandomStringDemo {

    // User defined function
    public static String generateRandomString(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        String result = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result = result + characters.charAt(index);
        }

        return result;
    }

    public static void main(String[] args) {

        int length = 10;

        System.out.println("Random String of length " + length + ": " 
                + generateRandomString(length));
    }
}