package Lab1;
//2. Write a Java program to iterate a linked list in reverse order 
//(using objlist.descendingIterator())

import java.util.*;

public class ReverseIteration {
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

     // Reverse iteration using descendingIterator()
     System.out.println("Elements in reverse order:");
     Iterator<String> iterator = list.descendingIterator();

     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
 }
}