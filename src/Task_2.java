import java.time.Duration;
import java.time.LocalTime;

public class Task_2 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.parse("08:30");

        int classTime = 120;
        int breakTime = 10;
        int extendedBreakTime = 30;
        int fullClassTime = classTime * 4 + breakTime * 2 + extendedBreakTime;



        System.out.println("Class end time: " + time.plusMinutes(fullClassTime));
        System.out.println("Time students spend in class: " + Duration.between(time, time.plusMinutes(fullClassTime)).toHours() + " hours and " + Duration.between(time, time.plusMinutes(fullClassTime)).toMinutesPart() + " minutes");
        System.out.println("Hours spend during class: " + classTime * 4 / 60);
        System.out.println("Hours spend during break: " + (breakTime * 2 + extendedBreakTime) / 60);

    }
}