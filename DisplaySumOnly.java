public class DisplaySumOnly {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 2;
        int sum = num1 + num2;

        System.out.println
        ("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        System.out.print(num1 + " and ");
        System.out.print(num2);
        System.out.print(" sum is ");
        System.out.println(sum);
        System.out.println(""); // Prints a blank line

        sum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 + ", " + num2 + " and " + num3 + " is " + sum + ".");
    }
}