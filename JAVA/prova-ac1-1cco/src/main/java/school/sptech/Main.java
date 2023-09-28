package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(0.00);

        ContaCorrente conta2 = new ContaCorrente(1.00);

        conta1.depositar(2.00);
        conta1.sacar(3.00);
        conta1.transferir(1.00, conta2);
        conta2.transferir(3.00, conta1);
    }
}