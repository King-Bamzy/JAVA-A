public class ForLoopWithNoInitialization {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Counter variable declared and initialized outside loop
        int num = 1;
        // Boolean variable initialized to false
        boolean flag = false;

        /*
         * The for loop starts with num value 1 and
         * continues till value of flag is not true
         */
        for (; !flag; num++) {
            System.out.println("Value of num: " + num);
            if (num >= 5) {
                flag = true; // Loop terminates when num reaches 5
            }
        } // End of for loop
    }
}