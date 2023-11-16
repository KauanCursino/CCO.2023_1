package school.sptech;

// ENUM é um tippo despecial de classe de JAVA, mas que existe em outras linguagens de programação
//Serve para trabalhar com valores fixos
public enum DiasDaSemanaEnum {

    //Atributps e/ou valores variáveis que são "final" utilizam o padrão MACRO_CASE

    //é possivel a criação de novos atributos no método main, como new Domingo...
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-feira"),
    TERCA(3, "Terça-feira"),
    QUARTA(4, "Quarta-feira"),
    QUINTA(5, "Quinta-feita"),
    SEXTA(6, "Sexta-feira"),
    SABADO(7, "Sábado");

    private int codigo;
    private String descricao;

    DiasDaSemanaEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static DiasDaSemanaEnum of(int codigo){
        switch (codigo){
            case 1:
                return DOMINGO;
            case 2:
                return  SEGUNDA;
            case 3:
                return TERCA;
            case 4:
                return QUARTA;
            case 5:
                return QUINTA;
            case 6:
                return SEXTA;
            case 7:
                return SABADO;
        }
                return null;
    };

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "%d - %s".formatted(codigo, descricao);
    }
}
