package Java2Session4;

public class VirtualThreadExample {
public static void main (String [ ] args) {
/* Creating a virtual thread using the Thread. startVirtualThread
method */
Thread virtualThread = Thread. startVirtualThread ( () ->{
for (int i=1; i <= 5; i++) {
System. out.println ("Virtual Thread: " +i) ;
try {
// Simulating some work in the virtual thread
Thread. sleep (1000);
} catch (InterruptedException e) {
e.printStackTrace ();
}
}
});
/* The main thread continues executing while the virtual thread is
running concurrently*/
for (int i=1; i <= 5; i++) {
System. out.println ("Main Thread: " +i) ;
try {
// Simulating some work in the main thread
Thread. sleep (500);
} catch (InterruptedException e) {
e.printStackTrace ();

}
}
/* Wait for the virtual thread to complete before ending the program */
try{

}catch (Exception e) { }
virtualThread.join();
}
}