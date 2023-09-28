package school.sptech;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite uma data");
        LocalDate data = LocalDate.parse(leitor.nextLine(), formatter);

        if (data.isEqual(LocalDate.now())){
            System.out.printf("""
                O dia %s é hoje %s
                """, data, data.getDayOfWeek());

        }else if (data.isAfter(LocalDate.now())){
        System.out.printf("""
                O dia %s será %s
                """, data, data.getDayOfWeek());
        } else {
            System.out.printf("""
                O dia %s foi %s
                """, data, data.getDayOfWeek());

        }

    }
}
