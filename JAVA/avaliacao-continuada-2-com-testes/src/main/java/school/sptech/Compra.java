package school.sptech;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Produto> produtos = new ArrayList<>();

    private String nomeCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void adicionarProduto(Produto produto){
        if (produto ==null){
            return;
        }else {
            produtos.add(produto);
        }
    }
    public void removerProduto(int indice){

        if (indice < produtos.size() && indice >= 0){
            produtos.remove(indice);
        }else {
            return;
        }
    }
    public Integer getQuantidadeProdutos(){
        Integer qtdProdutos = 0;
        for (Produto produto : produtos){
        qtdProdutos++;
        }
        return qtdProdutos;
    }
    public Integer getQuantidadeProdutosFrageis(){
        List<Produto> qtdProdutosFrageis = new ArrayList<>();
        for (Produto produto : produtos){
            if (produto.getFragil()){
                qtdProdutosFrageis.add(produto);
            }
        }
    return qtdProdutosFrageis.size();
    }

    public List<Produto> getProdutosPorCategoria(String categoria){
        List<Produto> produtosPorCategoria = new ArrayList<>();
        for (Produto produto : produtos){
            if (produto.getCategoria().equalsIgnoreCase(categoria)){
                produtosPorCategoria.add(produto);
            }
        }

        return produtosPorCategoria;
    }
    public Produto getProdutoPorNome(String nome){
        for (Produto produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public Double calcularTotalFrete(){
        Double totalFrete = 0.0;
        for (Produto produto : produtos){
            totalFrete += produto.calcularFrete();
        }
        return totalFrete;
    }
    public Double calcularTotalProdutos(){
        Double totalProdutos = 0.0;
        for (Produto produto : produtos){
            totalProdutos += produto.getPreco();
        }
        return totalProdutos;
    }
    public Double calcularTotalCompra(){
        Double totalCompra = 0.0;
        for (Produto produto : produtos){
            totalCompra += produto.getPreco() + produto.calcularFrete();
        }

        return totalCompra;
    }
}
