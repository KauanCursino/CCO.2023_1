package school.sptech;

public class Aluno {

    protected String nome;
    protected String ra;

    protected Double nota1;
    protected Double nota2;

    public Aluno(String nome, String ra, Double nota1, Double nota2) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMedia(){
        return (nota1 + nota2) / 2;
    }
}
