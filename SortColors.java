package Lab1;

//3. Write a java program for getting different colors through ArrayList interface 
//and sort them using Collections.sort(ArrayListObj)

import java.util.*;

public class SortColors {
 public static void main(String[] args) {

     // Creating ArrayList
     ArrayList<String> colors = new ArrayList<>();

     // Adding colors
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Black");

     // Display original list
     System.out.println("Original List: " + colors);

     // Sorting the list
     Collections.sort(colors);

     // Display sorted list
     System.out.println("Sorted List: " + colors);
 }
}