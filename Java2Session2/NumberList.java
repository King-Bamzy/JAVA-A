package Java2Session2;

public class NumberList <T> {
public<T> void display (T[] val) {
for ( T element : val)

System.out.printf ("Values are as follows: %s \n" ,
element) ;

}

public static void main (String [] args) {
Integer [] intValue = {1, 7, 9, 15};
NumberList<Integer> listObj = new NumberList<> ();
listObj.display (intValue);
}
}