package Lab1;
//2. Write a java program for getting different colors through ArrayList interface 
//and remove the 2nd element and color "Blue" from the ArrayList 
//(using remove by index and remove by object)

import java.util.*;

public class RemoveColors {
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

     // Removing 2nd element (index 1)
     colors.remove(1);

     // Removing color "Blue"
     colors.remove("Blue");

     // Display updated list
     System.out.println("After removing: " + colors);
 }
}