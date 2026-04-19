package Lab1;

//1. Write a Java program to iterate through all elements in a linked list 
//starting at the specified position (2nd) using iterator 
//(Hint: Iterator iteratorobj = listobj.listIterator(1))

import java.util.*;

public class IterateFromPosition {
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
     System.out.println("LinkedList: " + list);

     // Creating iterator starting from 2nd position (index 1)
     Iterator<String> iterator = list.listIterator(1);

     // Iterating from 2nd position
     System.out.println("Elements from 2nd position:");
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
 }
}