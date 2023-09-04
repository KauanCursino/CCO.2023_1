package school.sptech;

public class ProgressaoAritmetica {

    Integer primeiroTermo;
    Integer n;
    Integer razao;
    public ProgressaoAritmetica(Integer primeiroTermo,Integer n, Integer razao){
        this.primeiroTermo = primeiroTermo;
        this. n = n;
        this.razao = razao;
    }

    public Integer calcularTermo(){
        Integer somaFinal = 0;
        somaFinal = primeiroTermo + (n - 1) * razao;
        return somaFinal;


    }


}
