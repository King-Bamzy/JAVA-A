import java.util.Scanner; // (Import is assumed, though not shown in the image)

public class FormattedInput {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Creates an object and passes the inputstream object
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        // Accepts integer value from the user
        int intValue = s.nextInt();

        System.out.println("Enter a decimal number:");
        // Accepts integer value from the user
        float floatValue = s.nextFloat();

        System.out.println("Enter a string value:");
        // Accepts string value from the user
        String strValue = s.next();

        System.out.println("Values entered are: " + intValue + " " + floatValue + " " + strValue);
        // Note: The code snippet shows System.out.println(intValue + " " + floatValue + " " + strValue);
    }
}