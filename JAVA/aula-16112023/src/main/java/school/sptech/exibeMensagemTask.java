package school.sptech;

import java.util.TimerTask;

public class exibeMensagemTask extends TimerTask {

    private String mensagem;
    private int delay;
    private int periodo;

    public exibeMensagemTask(String mensagem, int delay, int periodo) {
        this.mensagem = mensagem;
        this.delay = delay;
        this.periodo = periodo;
    }

    @Override
    public void run() {
        System.out.println("Mensagem: %s".formatted(mensagem));
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getDelay() {
        return delay;
    }

    public int getPeriodo() {
        return periodo;
    }
}
