import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekinstant = d03.  minus(7, ChronoUnit.DAYS);
        Instant nextWeekinstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekinstant = " + pastWeekinstant);
        System.out.println("nextWeekinstant = " + nextWeekinstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekinstant, d03);
        Duration t4 = Duration.between(d03, pastWeekinstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());

    }

}
