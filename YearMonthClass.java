import java.time.YearMonth; // to use the Year and Month info

public class YearMonthClass {
    public static void main(String[] args) {
        System.out.println("The Present Year Month: " + YearMonth.now());

        // To display only the month value
        System.out.println("Month alone: " + YearMonth.parse("2021-02").getMonthValue());

        // To display only the year value alone
        System.out.println("Year alone: " + YearMonth.parse("2021-02").getYear());

        // Leap year check
        System.out.println("This year is a Leap year: " + YearMonth.parse("2021-02").isLeapYear());
    }
}