package MyPackage;

import java.util.*;
import java.io.*;

public class CollectionDemo {
  public static void start(){
    ArrayList<Integer> al = new ArrayList<>();

    // Appending new elements at the end of the list
    for (int i = 1; i <= 5; i++)
      al.add(i);

    // Printing elements
    System.out.println(al);

    // Remove element at index 3
    al.remove(3);

    // Displaying the ArrayList after deletion
    System.out.println(al);

    // Printing elements one by one
    for (int i = 0; i < al.size(); i++)
      System.out.print(al.get(i) + " ");


  }
}
