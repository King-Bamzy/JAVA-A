package Java2Session4;

public class OSThreadsExample {
public static void main (String [ ] args) {
Thread thread1 = new Thread ( () -> {
for (int i =1; i <= 5; i++) {
System.out.println ("Thread 1: " +i);
try {
Thread.sleep (1000);
} catch (InterruptedException e) {
    e.printStackTrace ();
}
}
});

Thread thread2 = new Thread ( () -> {
for (int i =1; i <= 5; i++) {
System.out.println ("Thread 2: "+i);
try {
Thread.sleep (1000);
} catch (InterruptedException e) {
e.printStackTrace ();
}
}
});

thread1.start ();
thread2.start ();

try {
thread1.join ();
thread2.join ();
} catch (InterruptedException e) {
e.printStackTrace () ;
}

System.out.println ("Main Thread: Done!") ;

}
}