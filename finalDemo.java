public class finalDemo {
    // Declare and initialize a final variable
    final float PI = 3.14F; // variable to store the value of PI
    /**
     * Displays the value of PI
     * 
     * @param pi a float variable storing the value of PI
     * @return void
     */
    public void display(float pi) {
        System.out.println("The value of PI is: " + pi);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the finalDemo class
        final FinalDemo objFinalDemo = new FinalDemo();
        // Invoke the display() method
        objFinalDemo.display(22.7F)
    }
}
