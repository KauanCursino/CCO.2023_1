package school.sptech;

public class AlunoGraduacao extends Aluno{

    private Double nota3;

    public AlunoGraduacao(String nome, String ra, Double nota1, Double nota2, Double nota3) {
        super(nome, ra, nota1, nota2);
        this.nota3 = nota3;
    }

    @Override
    public Double getMedia() {
//        return super.getMedia() * .4 + this.nota3 * .6;
        return (this.nota1 + this.nota1 + this.nota3) / 3;
    }
}
