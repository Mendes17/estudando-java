import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {

    public static void main(String[] args) {

        // Cria um formatador para exibir a data no formato "dia/mês/ano"
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Cria um formatador para exibir data e hora no formato "dia/mês/ano horas:minutos"
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Obtém a data atual (sem hora) no fuso horário local
        LocalDate d01 = LocalDate.now();

        // Obtém a data e hora atuais no fuso horário local
        LocalDateTime d02 = LocalDateTime.now();

        // Obtém a data e hora atuais no padrão UTC (Coordinated Universal Time)
        Instant d03 = Instant.now();

        // Converte uma string em uma data (formato ISO 8601) sem hora
        LocalDate d04 = LocalDate.parse("2022-07-20");

        // Converte uma string em uma data e hora no formato ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        // Converte uma string em uma data e hora no formato ISO 8601 com fuso horário UTC
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Converte uma string em uma data e hora com fuso horário específico (UTC-3)
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // Converte uma string formatada em uma data usando o formatador fmt1
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        // Converte uma string formatada em data e hora usando o formatador fmt2
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        // Cria uma data específica usando o método "of", com ano, mês e dia
        LocalDate d10 = LocalDate.of(2024, 12, 26);

        // Cria uma data e hora específica usando o método "of", com ano, mês, dia, hora e minuto
        LocalDateTime d11 = LocalDateTime.of(2024, 12, 26, 20, 46);

        // Exibe cada data ou data e hora no console, convertendo-as para string no formato padrão
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
