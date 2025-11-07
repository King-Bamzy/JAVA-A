package Java2;

import java. util.ArrayList;
import java.util.List;
public class ListDemo {
public static void main (String[] args) {
List<String> listObj = new ArrayList<String> ();
for (int ctr=1; ctr <= 10; ctr++) {
listObj.add ("Value is : " + new Integer (ctr) );

System. out.println ("The size is : " + listObj.size() );
}

}

}