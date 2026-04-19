package Lab1;

//5. Write a Java program that swaps two elements (first and third elements) in a linked list
//(using Collections.swap(l_list, 0, 2))

import java.util.*;

public class SwapElements {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding elements
     list.add("Red");
     list.add("Blue");
     list.add("Green");
     list.add("Yellow");
     list.add("Black");

     // Display original list
     System.out.println("Original LinkedList: " + list);

     // Swapping first (0) and third (2) elements
     Collections.swap(list, 0, 2);

     // Display updated list
     System.out.println("After swapping 1st and 3rd elements: " + list);
 }
}