package Lab1;
//4. Write a Java program to display elements and their positions in a linked list
//(using l_listobj.get(p))

import java.util.*;

public class DisplayPositions {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding elements
     list.add("Red");
     list.add("Blue");
     list.add("Green");
     list.add("Yellow");
     list.add("Black");

     // Display elements with positions
     System.out.println("Elements with their positions:");

     for (int p = 0; p < list.size(); p++) {
         System.out.println("Position " + p + " : " + list.get(p));
     }
 }
}