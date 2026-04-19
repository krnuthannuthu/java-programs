package Lab1;

//5. Write a java program for getting different colors through ArrayList interface 
//and delete nth element from the ArrayList object by using remove by index

import java.util.*;

public class RemoveNthElement {
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

     // Choose nth element to remove (example: n = 3 → index = 2)
     int n = 3;

     if (n > 0 && n <= colors.size()) {
         colors.remove(n - 1); // remove by index
         System.out.println("After removing " + n + "th element: " + colors);
     } else {
         System.out.println("Invalid position!");
     }
 }
}