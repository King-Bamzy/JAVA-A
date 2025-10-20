public class VariableScope2 {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int num = 2;
        double result = Math.sqrt(num); // Assuming Math.sqrt is used for context

        // Formats the output string
        // %d for integer, %f for float/double, %.4f specifies 4 decimal places
        System.out.format("The square root of %d is %.4f%n", num, result);
    }
}