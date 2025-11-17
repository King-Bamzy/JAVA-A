import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputApplication {
    public static void main(String[] args) throws Exception {
        OutputStream outputStreamObj = null;
        FilterOutputStream filterOutputStreamObj = null;
        FileInputStream filterInputStreamObj = null;
        byte[] bufObj = {81, 82, 83, 84, 85};
        int i = 0;
        char c;
        
        // encloses the creation of stream objects within try-catch block
        try {
            // creates output stream objects
            outputStreamObj = new FileOutputStream("C:/Java/test.txt");
            filterOutputStreamObj = new FilterOutputStream(outputStreamObj);
            
            // writes to the output stream from bufObj
            filterOutputStreamObj.write(bufObj);
            
            // forces the byte contents to be written to the stream
            filterOutputStreamObj.flush();
            
            // creates an input stream object
            filterInputStreamObj = new FileInputStream("C:/Java/test.txt");
            
            while ((i = filterInputStreamObj.read()) != -1) {
                // converts integer to character
                c = (char) i;
                // prints the character read
                System.out.println("Character read after conversion is: " + c);
            }
            
        } catch (IOException e) {
            // checks for any I/O errors
            System.out.print("Close() is invoked prior to write()");
            e.printStackTrace();
        } finally {
            // releases system resources associated with the stream
            if (outputStreamObj != null)
                outputStreamObj.close();
            if (filterOutputStreamObj != null)
                filterOutputStreamObj.close();
            if (filterInputStreamObj != null)
                filterInputStreamObj.close();
        }
    }
}