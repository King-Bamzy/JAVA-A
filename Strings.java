public class Strings {
    String str = "Hello"; // Initialize a String variable
    // Use the Integer wrapper class (used for tostring() demo)
    Integer strLength = 5; 

    /** Displays strings using various String class methods */
    /** @return void */
    public void displayStrings() {
        // using various String class methods
        System.out.println("String length is:" + str.length());
        System.out.println("Character at index 2 is:" + str.charAt(2)); // 'l'
        System.out.println("Concatenated string is:" + str.concat("World")); // "HelloWorld"
        
        // String comparison
        System.out.println("String comparison is:" + str.compareTo("World")); // Negative value since H < W
        
        System.out.println("Index of o is:" + str.indexOf("o")); // 4
        System.out.println("Last index of l is:" + str.lastIndexOf("l")); // 3
        
        // Replacement
        System.out.println("Replaced string is:" + str.replace('e', 'a')); // "Hallo"
        
        // Substring
        // The second argument (5) is exclusive
        System.out.println("Substring is:" + str.substring(2, 5)); // "llo" 
        
        // Integer to String conversion
        System.out.println("Integer to String is:" + strLength.toString()); // "5"
        
        // Trimming (assuming str1 is initialized elsewhere)
        String str1 = " Hello ";
        System.out.println("Untrimmed string is:" + str1); // " Hello "
        System.out.println("Trimmed string is:" + str1.trim()); // "Hello"
    }

    /** @param args the command line arguments */
    public static void main(String[] args) {
        // Instantiate class, Strings
        Strings objString = new Strings(); // line 1
        
        // Invoke the displayStrings() method
        objString.displayStrings();
    }
}
