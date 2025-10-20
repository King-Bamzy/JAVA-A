package Session8;
 interface person {
    default void display1 (String msg){
        msg+=" from display1"
        printMessage (msg);
    }
    default void display2 (String msg){
        msg+=" from display2"
        printMessage (msg);
    }
    private void printlnMessage (String msg){
        System.out.println(msg);
    }
}
public class Employee implements person {
    public void printInterface() {
        display1("Hello there");
        display2("Hi there");
    }
    public static void main(String[] args) {
        Employee objEmployee = new Employee();
        objEmployee.printInterface();
    }
}
