package Java2Session2;

import java. util.ArrayList;
import java. util. Iterator;
import java.util.List;
public class GenericArrayListExample {
public static void main (String [] args) {
List<Integer> partObj =new ArrayList<>(3);
partObj.add(new Integer (1010));
partObj.add(new Integer(2020));
partObj.add(new Integer(3030));

System.out.println ("Part Numbers are as follows: ") ;
Iterator<Integer> value = partObj.iterator () ;
while (value.hasNext () ) {
Integer partNumberObj = value.next ();
int partNumber = partNumberObj. intValue ();
System.out.println (""+ +partNumber);
}
}
}