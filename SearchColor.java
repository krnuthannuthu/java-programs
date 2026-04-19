package Lab1;
//1. Write a java program for getting different colors through ArrayList interface 
//and search whether the color "Red" is available or not
//(Hint: Use ArrayListObj.contains())

import java.util.*;

public class SearchColor {
 public static void main(String[] args) {

     // Creating ArrayList
     ArrayList<String> colors = new ArrayList<>();

     // Adding colors
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Red");
     colors.add("Black");

     // Display list
     System.out.println("Colors in the list: " + colors);

     // Checking if "Red" is present
     if (colors.contains("Red")) {
         System.out.println("Red color is available in the list.");
     } else {
         System.out.println("Red color is NOT available in the list.");
     }
 }
}

