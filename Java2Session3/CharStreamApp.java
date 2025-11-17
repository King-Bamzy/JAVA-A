package Java2Session3;
import java.io.FileReader;
import java.io. FileWriter;
import java.io. IOException;
public class CharStreamApp {
public static void main (String [ ] args) throws IOException {
FileReader inObjStream=null;
FileWriter outObjStream=null;
try {
inObjStream =new FileReader ("c:/java/hello.txt");
outObjStream =new FileWriter ("charoutputagain.txt");
int ch;
while ((ch = inObjStream. read () ) !=- 1) {
outObjStream.write (ch);
}
outObjStream. close () ;
} finally {
if (inObjStream != null) {
inObjStream.close();

}
}
}
}