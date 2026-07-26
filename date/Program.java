package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;
import java.time.Duration;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-04-21");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:20");
        Instant d06 = Instant.parse("2022-07-20T01:30:20Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:20-03:00");
        LocalDate d08 = LocalDate.parse("20/08/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/08/2026 01:30", fmt2);

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        Instant pastWeekinstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekinstant = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0,0));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date y1 = sdf1.parse("25/06/2026");
        Date y2 = sdf2.parse("25/06/2026 15:42:04");


        System.out.println(d01.toString());
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(r1);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);
        System.out.println(pastWeekinstant);
        System.out.println(nextWeekinstant);
        System.out.println(t1.toDays());
        System.out.println(y1);
        System.out.println(y2);
    }
}
