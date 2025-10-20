import java.time.Year; // Class to use Year values in calculations

class SampleYear {
    public static void main(String[] args) {
        System.out.println("The Present Year (): " + Year.now());
        System.out.println("The year 2022 is a Leap year: " + Year.isLeap(2022)); // to display whether 2022 is a leap year or not
        System.out.println("The year 2024 is a Leap year: " + Year.isLeap(2024)); // to display whether 2024 is a leap year or not
    }
}