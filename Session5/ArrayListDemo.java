package Session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    // Create an ArrayList instance
    ArrayList<Integer> marks = new ArrayList<>(); // line 1

    /** Stores marks in ArrayList */
    /** @return void */
    public void storeMarks() {
        System.out.println("Storing marks. Please wait..."); // line 2
        marks.add(67);
        marks.add(50);
        marks.add(45);
        marks.add(75);
    }

    /** Displays marks from ArrayList */
    /** @return void */
    public void displayMarks() {
        System.out.println("Marks are:");
        
        // 1. Iterating the list using for loop
        System.out.println("Iterating ArrayList using for loop:");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }

        System.out.println("-------------");
        
        // 2. Iterate the list using Iterator interface
        Iterator<Integer> imarks = marks.iterator(); // line 3
        System.out.println("Iterating ArrayList using Iterator:");
        while (imarks.hasNext()) { // line 4
            System.out.println(imarks.next()); // line 5
        }

        System.out.println("-------------");
        
        // 3. Sort the list
        Collections.sort(marks); // line 6
        System.out.println("Sorted list is: " + marks);
    }
    
    /** @param args the command line arguments */
    public static void main(String[] args) {
        // Instantiate class ArrayListDemo
        ArrayListDemo objArrayList = new ArrayListDemo();
        
        objArrayList.storeMarks();
        objArrayList.displayMarks();
    }
}
