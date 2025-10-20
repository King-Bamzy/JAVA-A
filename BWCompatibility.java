import java.time.LocalDateTime;   // to initiate local date and time
import java.time.ZonedDateTime;   // to initiate zoned date and time
import java.util.Date;            // to work with the old Date class
import java.time.Instant;         // to get Instant from Date
import java.time.ZoneId;          // to get system default zone

public class BWCompatibility {
    public static void main(String[] args) {
        BWCompatibility bwCompatibility = new BWCompatibility();
        bwCompatibility.sampleBK();
    }

    public void sampleBK() {
        // To display the current date using Date
        Date sampleCurDay = new Date();
        System.out.println("Desired Current date: " + sampleCurDay);

        // To display the Instant of current date
        Instant sampleNow = sampleCurDay.toInstant();

        // To get the current system default time zone
        ZoneId sampleCurZone = ZoneId.systemDefault();

        // To display the current local date
        LocalDateTime sampleLoDaTi = LocalDateTime.ofInstant(sampleNow, sampleCurZone);
        System.out.println("Desired Current Local Date-Time: " + sampleLoDaTi);

        // To display the desired current zoned date
        ZonedDateTime sampleZoDaTi = ZonedDateTime.ofInstant(sampleNow, sampleCurZone);
        System.out.println("Desired Current Zoned Date-Time: " + sampleZoDaTi);
    }
}