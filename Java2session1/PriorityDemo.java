package Java2session1;

import java. util .*;
public class PriorityDemo {
public static void main (String [ ] args) {
PriorityQueue<String> queue =new PriorityQueue<String>();
queue. offer ("New York") ;
queue. offer ("Kansas") ;
queue. offer ("California");
queue.offer ("Alabama") ;
System.out.println ("1. "+queue.poll () ) ; // removes item
System.out.println ("2. "+ queue.poll () ) ; // removes item
System.out.println ("3. "+ queue.peek());
System.out.println ("4. "+ queue.peek());
System.out.println ("5. " + queue. remove () ) ; // removes item
System.out.println ("6. " + queue.remove () ) ; // removes item
System.out.println ("7. "+ queue.peek () );
System. out.println ("8. "+ queue. element () ) ; // throws
//Exception
}
}