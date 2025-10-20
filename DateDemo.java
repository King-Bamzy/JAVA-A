import java.time.*; // Import the package for Date-Time API classes
public class DateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Current date
        LocalDate dateOfBirth = LocalDate.of(2010, 06, 05);
        // Code to retrieve the birthday month and day
        MonthDay bday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        // Code to retrieve the current month and day
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(bday)) {
            System.out.println("**Happy Colorful and Joyful Birthday Buddy**");
        } else {
            System.out.println("Nope, today is not your B'day");
        }
    }
}
