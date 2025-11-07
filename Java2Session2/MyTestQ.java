package Java2Session2;

class MyTestQ <DataType> extends TestQ<DataType> {
public static void main (String[] args) {
MyTestQ<String> test = new MyTestQ<String>();
test.enqueue ("Hello") ;
test.enqueue ("Java") ;
System. out.println ( (String) test.dequeue () );
}
}