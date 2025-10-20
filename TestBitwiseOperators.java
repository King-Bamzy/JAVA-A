public class TestBitwiseOperators {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int x = 23; // 23 in binary is 10111
        int y = 12; // 12 in binary is 01100

        // Bitwise operations
        System.out.println("x & y: " + (x & y)); // Returns 4, i.e., 00100 (Bitwise AND)
        System.out.println("x | y: " + (x | y)); // Returns 31, i.e., 11111 (Bitwise OR)
        System.out.println("x ^ y: " + (x ^ y)); // Returns 27, i.e., 11011 (Bitwise XOR)

        int a = 43; // 43 in binary is 00101011
        int b = 1;

        // Bitwise shift operations
        System.out.println("a >> b: " + (a >> b)); // Returns 21 (Right Shift)
        System.out.println("a << b: " + (a << b)); // Returns 86 (Left Shift)
    }
}