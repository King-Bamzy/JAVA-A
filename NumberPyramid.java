public class NumberPyramid {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        outer: // Label for the outer loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is the outer loop.");
            
            for (int j = 1; j <= 3; j++) {
                if (j > i) {
                    System.out.println("Hello"); // Executes only once when i=1, j=2
                    /*
                     * Terminates the loop counting j and continues the
                     * next iteration of the loop counting i (outer loop)
                     */
                    continue outer; 
                }
                System.out.print(j); // Prints j values before continue
            } // End of inner for loop
            
            System.out.println("\nThis is the outer loop."); // This will not execute if 'continue outer' runs
        } // End of outer for loop
        
        System.out.println("Good-Bye");
    }
}