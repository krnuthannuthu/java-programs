package Lab1;

//3. Write a Java program to insert the specified element at the end of a linked list
//(using l_listobj.offerLast("Pink"))

import java.util.*;

public class InsertAtEnd {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding initial elements
     list.add("Red");
     list.add("Blue");
     list.add("Green");

     // Display original list
     System.out.println("Original LinkedList: " + list);

     // Inserting "Pink" at the end
     list.offerLast("Pink");

     // Display updated list
     System.out.println("After inserting Pink at end: " + list);
 }
}