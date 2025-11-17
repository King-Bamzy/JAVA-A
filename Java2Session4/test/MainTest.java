/*
*Creating threads using Thread
*class and using methods of the class
*/
package Java2Session4.test;
/* 
* NamedThread is created to implement the interface Runnable
*/
class NamedThread implements Runnable {
/* this will store name of the thread */
String name;
/ **
This method of Runnable is implemented to specify the action
that will be done when the thread begins execution.
*/
public void run () {
int count = 0; //will store the number of threads
while (count < 3) {
name = Thread. currentThread () .getName ();
System.out.println (name);
count++;
}
}
}
public class MainTest {
public static void main (String args [ ] ) {
NamedThread objNewThread= new NamedThread () ;
Thread objThread = new Thread (objNewThread) ;
objThread.start ();
}
}