public class PrintMultiplesWithForLoop {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, product;

        // The for loop with all three declaration parts
        for (num = 1; num <= 5; num++) {
            product = num * 10;
            // \t is tab, \n is new line
            System.out.printf("%d * 10 = %d\n", num, product);
        } // Moves the control back to the for loop
    }
}