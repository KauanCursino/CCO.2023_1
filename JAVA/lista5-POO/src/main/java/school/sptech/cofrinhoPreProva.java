package school.sptech;

public class cofrinhoPreProva {

    private String meta;
    private Integer valor;
    private Boolean quebrado;

    public void cofrinho(String meta, Integer valor, Boolean quebrado){
        this.meta = meta;
        this.valor = valor;
        this.quebrado = quebrado;
    }

    public String getMeta() {
        return meta;
    }

    public Integer getValor() {
        return valor;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void depositarValor(){

    }
}
