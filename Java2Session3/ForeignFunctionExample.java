package Java2Session3;

public class ForeignFunctionExample {
static {
System. loadLibrary ("myLibrary") ; // Load the native
//library
}
/ / Declare the native method
public native void callNativeFunction () ;
public static void main (String [ ] args) {
ForeignFunctionExample example = new ForeignFunctionExample () ;
example.callNativeFunction () ; // Call the native function
}
}