package school.sptech;

import com.sun.source.tree.CatchTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        Existem dois tipos de anormalidades em JAVA
        Exception, Error
         */

        //TOP 3 Exceptions:
        //NullPointerException
        //IndexOutOfBoundsException
        //FileNotFoundException

        //TOP 3 ERRORS:
        //StackOverFlowError
        //OutOfMemoryError
        //VirtualMachineError


        Scanner leitor = new Scanner(System.in);


        try {
            System.out.println("Digite um número de 0 a 10: ");
            Integer numero = leitor.nextInt();

            if (numero < 0 || numero > 10){
                throw new NumeroForaDoIntervalException("São aceitos somente números entre 0 e 10!");
            }

            System.out.println("Digite outro número:");
            Integer numero2 = leitor.nextInt();

            Integer divisao = numero/numero2;
            System.out.println("O resultado da divisão é: " + divisao);

        } catch (InputMismatchException | NumeroForaDoIntervalException e){
            System.out.println("Número inválido");
            if (e.getMessage() != null){
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e){
            System.out.println("Não é possível divisdir um número por 0");
        }

        //As exceptions podem ser subdividadas
        // Checked exceptions e Unchecked exceptions

        Calculadora calculadora = new Calculadora();

        try{
        calculadora.dividir(10, 8);

        }catch (DivisaoPorZeroException e){
            System.out.println("Não é possviel dividir por 0");
        }


    }
}