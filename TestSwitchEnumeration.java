public class TestSwitchEnumeration {

    /** An enumeration of Cards Suite */
    enum Cards {
        Spade, Heart, Diamond, Club
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // enum variable is used to control a switch statement
        Cards card = Cards.Diamond;

        switch (card) {
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        } // End of switch-case statement
    }
}
// Expected run: DIAMOND