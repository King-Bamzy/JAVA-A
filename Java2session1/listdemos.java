package Java2;

import java. util. ArrayList;
import java.util.List;
public class listdemos{
public static void main (String[] args) {
List<String> listObj = new ArrayList<String> ();
System. out.println ("The initial size is : " + listObj.size() ) ;

for (int ctr=1; ctr <= 10; ctr++) {
listObj.add ("Value is : " + new Integer (ctr) );

System.out.println ("The size after adding elements is : " +
listObj.size());
listObj.set (5, "Hello World");
System.out.println ("Value of fifth element is: "
+(String) listObj. get (5));

}

}

}
