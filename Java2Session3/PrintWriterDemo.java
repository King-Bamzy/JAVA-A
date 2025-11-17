package Java2Session3;
import java.io. IOException;
import java.io. InputStreamReader;
import java.io. OutputStreamWriter;
import java.io. PrintWriter;
public class PrintWriterDemo {
public static void main (String [ ] args) throws Exception {
InputStreamReader reader = new InputStreamReader (System.in);
OutputStreamWriter writer =new OutputStreamWriter (System.out);
PrintWriter pwObj = new PrintWriter (writer, true);
int tmp=0;
char ch;
try {
while (tmp != -1) {
tmp =reader.read () ;
ch = (char) tmp;
pwObj.println ("echo" +ch);

}
}
catch (IOException e) {
System.out.println ("IO error:" +e) ;
}
}
}