// Java program to demonstrate unmodifiableCollection () method
// for UnsupportedOperationException
package Java2;
import java.util .*;

public class GFGS1 {
public static void main (String[] argv) throws Exception {
try {
// creating object of ArrayList<Character>
List<Character> list = new ArrayList<Character> () ;
// populate the list list.add ('X');
list.add ('Y');
// printing the list
System. out.println ("Initial list: " + list);
// getting unmodifiable list
// using unmodifiableCollection () method
Collection<Character> immutablelist =
Collections.unmodifiableCollection (list);
// Adding element to new Collection
System. out.println ("\nTrying to modify"+ " theunmodifiableCollection");
immutablelist.add ('Z');
}
catch (UnsupportedOperationException e) {
System. out.println ("Exception thrown : " + e);
};