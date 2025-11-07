package Java2Session2;
import java. util .*;
public class TestQueue <DataType> {
private LinkedList<DataType> items = new
LinkedList<DataType>();
public void enqueue (DataType item){
items.addLast (item) ;
}
public DataType dequeue () {
return items.removeFirst () ;
}
public boolean isEmpty () {
return (items.size() == 0);
}
public static void main (String[] args) {
TestQueue<String> testObj = new TestQueue<>();
testObj.enqueue ("Hello") ;
testObj.enqueue ("Java");
System.out.println ((String) testObj.dequeue());
}
}

