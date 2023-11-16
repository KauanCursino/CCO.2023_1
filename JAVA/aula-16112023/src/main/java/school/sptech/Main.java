package school.sptech;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Este método funciona, sempre irá roda de tanto em tanto tempo porém é considerado gambiarra
        /*while (true){
            System.out.println("Amor = Bruna");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }*/


        Scanner in = new Scanner(System.in);

        System.out.println("Mensagem para rotina:");
        String mensagemParaExibir = in.nextLine();

        System.out.println("Para sair pressione qualquer tecla");


        //É como um agendador de tarefas
        Timer agendador = new Timer();

        exibeMensagemTask tarefa1 =
                new exibeMensagemTask(
                        "Ar condicionado",
                        1000,
                        5000
                );
        agendador.schedule(tarefa1,tarefa1.getDelay(),tarefa1.getPeriodo());

        in.nextLine();
        agendador.cancel();

    }
}