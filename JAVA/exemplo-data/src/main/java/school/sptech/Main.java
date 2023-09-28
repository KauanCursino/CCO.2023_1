package school.sptech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        LocalDate data = LocalDate.of(2023, 9, 28);
        System.out.println(data);

        LocalDate dataDeAgora = LocalDate.now();
        System.out.println(dataDeAgora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(data));



        LocalDate dataApartirDoTexto = LocalDate.parse("28/11/2000", formatter);
        System.out.println(dataApartirDoTexto);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
        System.out.println(formatter1.format(dataHora));

        Integer diaDaSemana = dataDeAgora.getDayOfWeek().getValue();
        System.out.println(diaDaSemana);
    }
}