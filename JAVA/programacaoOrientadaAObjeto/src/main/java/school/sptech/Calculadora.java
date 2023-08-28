package school.sptech;

public class Calculadora {

    Integer numeroOperacoes = 0;


    void somar(Integer n1, Integer n2){
        System.out.println("Resultado: " + (n1 + n2));
        numeroOperacoes++;
    }
    void subtrair(){
        numeroOperacoes++;
        return;
    }
    void multiplicar(){
        numeroOperacoes++;
    }
    void dividir(){
        numeroOperacoes++;
    }
}
