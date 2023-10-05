package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    private List<Sessao> sessoes = new ArrayList<>();


    public Cinema() {
        this.nome = nome;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void adicionarSessao(Sessao sessao){
        if (sessao != null){
        sessoes.add(sessao);
        }else{
            return;
        }
    }
    public Integer getQuantidadeSessoes3d(){
        Integer filmes3d = 0;
        for (Sessao sessao: sessoes){
            if (sessao.getSessao3d()){
                filmes3d++;
            }
        }
        return filmes3d;
    }
    public List<Sessao> getSessoesPorNomeFilme(String filme){
        List<Sessao> sessoesPorNome = new ArrayList<>();
        for (Sessao sessao : sessoes){
            if (sessao.getFilme().equalsIgnoreCase(filme)){
                sessoesPorNome.add(sessao);

            }
        }
        return sessoesPorNome;
    }
    public Double getMediaIngressosVendidos(){
        Double media = 0.0;
        for (Sessao sessao: sessoes) {
            media += sessao.getIngressosVendidos();
        }
        if (media == 0.0){
            return 0.0;
        }
        return media.doubleValue() / sessoes.size();
    }
    public Double calcularTotalVendas(){
        Double contador = 0.0;
        for (Sessao sessao: sessoes){
            contador += sessao.calcularPrecoDoIngresso() * sessao.getIngressosVendidos();
        }

        return contador;
    }

}
