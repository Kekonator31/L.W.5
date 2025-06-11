import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Task_3 {
        public static void main(String[] args) {

            LocalDateTime now = ZonedDateTime.now().toLocalDateTime();

            ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
            ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
            ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

            DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm dd MM yyyy");

            System.out.println("Time:" + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm dd MM yyyy")));
            System.out.println("London time:" + londonTime.format(format));
            System.out.println("Tokyo time:" + tokyoTime.format(format));
            System.out.println("New York time:" + newYorkTime.format(format));

            System.out.println(ChronoUnit.HOURS.between(now, londonTime));
            System.out.println(ChronoUnit.HOURS.between(now, tokyoTime));
            System.out.println(ChronoUnit.HOURS.between(now, newYorkTime));
   }
}