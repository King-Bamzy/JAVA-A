package Java2Session4;
public class ScopedValuesExample {

public static void main (String [ ] args) {
// Creating a scoped value
scoped int myScopedValue = 42;

// Using the scoped value within its scope

int result =myScopedValue + 10;
System.out.println ("Result inside the scope: " + result) ;

}

// Attempting to use the scoped value outside its scope would result in
//an error
// int outsideScopeResult = myScopedValue + 20; // This would generate
//an error

}