import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraGlobalParaLocal {

    public static void main(String[] args) {


        Instant d01 = Instant.parse("2022-07-20T01:30:26Z");
        LocalDate d02 = LocalDate.parse("2022-07-20");
        LocalDateTime d03 = LocalDateTime.parse("2022-07-20T01:30:26");

        LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault()); // define a data de acordo com fuso horario do computador
        LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal")); // define a data de acordo com o fuso horario escolhido
        LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault()); // define a data e hora de acordo com fuso horario do computador
        LocalDateTime r4 = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal")); // define a data e hora de acordo com o fuso horario escolhido

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d02 dia = " + d02.getDayOfMonth()); // pega somente o dia da data especificada
        System.out.println("d02 mês = " + d03.getMonthValue()); // pega somente o mês(em numero) da data especificada
        System.out.println("d02 ano = " + d03.getYear()); // pega somente o ano da data especificada

        System.out.println("d03 hora = " + d03.getHour()); // pega somente a hora da data especificada
        System.out.println("d03 minuto = " + d03.getMinute()); // pega somente o minuto da data especificada
        System.out.println("d03 segundo = " + d03.getSecond()); // pega somente o segundo da data especificada

    }

}
