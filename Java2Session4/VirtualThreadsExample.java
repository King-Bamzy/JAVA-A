package Java2Session4;

import java. util. concurrent. ExecutorService;
import java. util.concurrent. Executors;
import java. util.concurrent.TimeUnit;

public class VirtualThreadsExample {
public static void main (String [] args) {
    ExecutorService executor = Executors.newVirtualThreadExecutor();

executor.submit ( () -> {
for (int i =1; i <= 5; i++) {
System.out.println ("Virtual Thread 1: " +i);
try {
Thread.sleep (1000);
} catch (InterruptedException e) {
e.printStackTrace ();
}
}
});

executor.submit ( () -> {
for (int i=1; i <= 5; i++) {
System.out.println ("Virtual Thread 2: " +i) ;
try {
Thread.sleep (1000);
} catch (InterruptedException e) {
e.printStackTrace ();
}
}
});

executor.shutdown ();
try {
executor. awaitTermination (Long. MAX_VALUE,
TimeUnit. NANOSECONDS);

} catch (InterruptedException e) {
e.printStackTrace () ;
}
System.out.println ("Main Thread: Done!");
}
}