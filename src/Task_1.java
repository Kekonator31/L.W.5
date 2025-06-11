import java.time.*;
import java.util.Scanner;

public class Task_1 {


    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        Scanner sc = new Scanner(System.in);

        LocalDate vacationStart = LocalDate.of(2025, 7, 15);

        System.out.println("Vacation date: " + vacationStart);

        System.out.println("Today date: " + today);

        int days = Period.between(today, vacationStart).getDays();
        int month = Period.between(today, vacationStart).getMonths();

        System.out.println("To vacation left " + days + " days and " + month + " months");

    }
}