package Java2Session2;

interface Command<X extends Throwable> {
public void calculate (Integer arg) throws X;

public class ExTest implements Command <ArithmeticException> {
public void calculate (Integer num) throws ArithmeticException
{
int no = num.valueOf (num);
System.out.println ("Value is: " + (no/0));
}
}
}