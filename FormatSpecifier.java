public class FormatSpecifier {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int i = 55 / 22; // i will be 2 (integer division)

        // Decimal integer
        System.out.printf("55/22 = %d%n", i); // Output: 55/22 = 2

        // Pad with zeros (width 5)
        double q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %05.3f%n", q); // Output: 1.0/2.0 = 0.500

        // Scientific notation (width 7, 2 decimal places)
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e%n", q); // Output: 5000/3.0 =  1.67e+03

        // Negative infinity
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e%n", q); // Output: -10.0/0.0 = -Inf

        // Multiple arguments (PI value, E value)
        System.out.printf("pi = %.3f, e = %.4f%n", Math.PI, Math.E);
    }
}