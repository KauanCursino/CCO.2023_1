package school.sptech;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorDouble = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 6){

            if (escolha == 0){

            System.out.println("""
                    1.Adicionar livro,
                    2.Adicionar DVD,
                    3.Adicionar Servico,
                    4.Exibir itens do carrinho,
                    5.Exibir total de venda,
                    6.Fim
                    """);
            escolha = leitorInt.nextInt();

                switch (escolha){
                    case 1:
                        int codigoLivro;
                        Double precoCustoLivro;
                        String nome;
                        String autor;
                        String isbn;
                        System.out.println("""
                            Digite as infermações deste livro:
                            
                            Código do livro:
                            """);
                        codigoLivro = Integer.parseInt(leitorInt.next());

                        System.out.println("Preço:");
                        precoCustoLivro = Double.valueOf(leitorString.next());

                        System.out.println("Nome:");
                        nome = leitorString.next();

                        System.out.println("Autor:");
                        autor = leitorString.next();

                        System.out.println("isbn:");
                        isbn = leitorString.next();

                        Livro livro = new Livro(codigoLivro, precoCustoLivro, nome, autor, isbn);
                        System.out.println(livro);

                    case 2:
                        int codigoDvd;
                        Double precoCustoDvd;
                        String nomeDvd;
                        String gravadora;
                        System.out.println("""
                            Digite as infermações deste DVD:
                            
                            Código do DVD:
                            """);
                        codigoDvd = Integer.parseInt(leitorInt.next());

                        System.out.println("Preço:");
                        precoCustoDvd = Double.valueOf(leitorString.next());

                        System.out.println("Nome:");
                        nomeDvd = leitorString.next();

                        System.out.println("Autor:");
                        gravadora = leitorString.next();

                        DVD dvd = new DVD(codigoDvd, precoCustoDvd, nomeDvd, gravadora);
                        System.out.println(dvd);
                    case 3:
                        String descricao;
                        int codigoServico;
                        int quantHoras;
                        double valorHora;
                        System.out.println("""
                            Digite as infermações deste Serviço:
                            
                            Descrição do Serviço:
                            """);
                        descricao = leitorString.next();

                        System.out.println("Código:");
                        codigoServico = Integer.parseInt(leitorInt.next());

                        System.out.println("Quantidade de horas:");
                        quantHoras = Integer.parseInt(leitorInt.next());

                        System.out.println("Valor da hora:");
                        valorHora = leitorDouble.nextDouble();

                        Servico servico = new Servico(descricao, codigoServico, quantHoras, valorHora);
                        System.out.println(servico);
                    case 4:
                        Carrinho carrinho = new Carrinho();
                        carrinho.exibeItensCarrinho();
                    case 5:
                        Carrinho carrinho1 = new Carrinho();
                        carrinho1.calcularTotalVenda();
                    case 6:
                        return;
                }
            }
            escolha = 0;
        }
    }
}
