package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Kauan",
                "00000",
                10.0,
                7.0
        );
        AlunoGraduacao g1 = new AlunoGraduacao("Thiaguinho", "001", 10.5, 7.5, 6.0);
        System.out.println("Aluno: ");
        System.out.println(a1.getMedia());
        System.out.println("Aluno graduado:");
        System.out.println(g1.getMedia());
    }
}
