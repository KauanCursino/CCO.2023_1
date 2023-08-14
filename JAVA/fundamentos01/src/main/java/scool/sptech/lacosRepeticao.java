package scool.sptech;

public class lacosRepeticao {
    public static void main(String[] args) {
        for (Integer i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        Integer contador = 0;
        while (contador <= 10) {
            contador++;
            System.out.println(contador);
        }

        Integer contador2 = 0;
        do {
            System.out.println(contador2);
            contador2++;
        } while (contador2 <= 10);

    }
}
