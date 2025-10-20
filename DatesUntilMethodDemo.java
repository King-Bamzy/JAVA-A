import java.time.LocalDate;
import java.time.period 
import java.time.month
import java.util.stream. Stream;
public class DatesUntilMethodDemo {
public static void main(string args[])
Print the days between today and 0d March 2021

Stream<LocalDate> dates - LocalDate.now() datesUntil (LocalDate, parse ("2021-03-01"));

dates .forBach (System.out: :println);
}