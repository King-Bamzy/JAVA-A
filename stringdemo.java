public class stringdemo {
    public static void main(String[] args) {
        String hi = "hello";
        //method to check the length of the string
        System.out.println(hi.length());

        //position of each letters in a string
        System.out.println(hi.charAt(0));
        System.out.println(hi.charAt(1));
        System.out.println(hi.charAt(2));
        System.out.println(hi.charAt(3));
        System.out.println(hi.charAt(4));
        //System.out.println(hi.charAt(5));
        System.out.println(hi);
        //joinining another word through concatenation;
        System.out.println(hi.concat(" Enoch"));
        System.out.println(hi.compareTo("world"));
        System.out.println(hi.indexOf('e'));
        System.out.println(hi.lastIndexOf("1"));
        System.out.println(hi.replace("h", "y"));
        System.out.println(hi.replace("e", "a"));
        System.out.println(hi.substring(2,5));
        System.out.println(hi.substring(0,5));
        int length = hi.length();
        System.out.println(hi.toString());

        String river = "Mississippi";
        System.out.println(river.lastIndexOf("i"));
        System.out.println(river.lastIndexOf("s"));
        System.out.println(river.lastIndexOf("p"));
    }
}
