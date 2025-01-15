import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {

    public static void main(String[] args) {

        // Converte uma string em uma data (somente data) no formato ISO 8601
        LocalDate d01 = LocalDate.parse("2022-07-20");

        // Converte uma string em uma data e hora no formato ISO 8601
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");

        // Converte uma string em uma data e hora com fuso horário UTC (ISO 8601)
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        // Define um formatador para exibir apenas a data no formato "dd/MM/yyyy"
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Define um formatador para exibir data e hora no formato "dd/MM/yyyy HH:mm"
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Define um formatador para exibir data e hora no formato "dd/MM/yyyy HH:mm",
        // ajustado ao fuso horário local do sistema
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Define um formatador padrão ISO para exibir data e hora no formato ISO 8601
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        // Define um formatador padrão ISO para exibir data e hora instantânea (Instant) no formato ISO 8601
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        // Formata e exibe a data d01 no formato "dd/MM/yyyy"
        System.out.println("d01: " + d01.format(fmt1));

        // Formata e exibe a data e hora d02 no formato "dd/MM/yyyy HH:mm"
        System.out.println("d02: " + d02.format(fmt2));

        // Formata e exibe a data e hora d02 no formato padrão ISO 8601
        System.out.println("d02: " + d02.format(fmt4));

        // Formata e exibe a data e hora instantânea d03 no formato "dd/MM/yyyy HH:mm",
        // ajustada ao fuso horário local do sistema
        System.out.println("d03: " + fmt3.format(d03));

        // Formata e exibe a data e hora instantânea d03 no formato "dd/MM/yyyy HH:mm" novamente
        System.out.println("d03: " + fmt3.format(d03));
    }
}