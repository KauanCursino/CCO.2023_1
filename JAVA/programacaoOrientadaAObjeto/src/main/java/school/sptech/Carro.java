package school.sptech;

public class Carro {
        //Não são variáveis globais
        //Essas caracteristicas são chamadas de ATRIBUTOS DE INSTÂNCIA

        String modelo;
        String marca;
        Integer anoLancamento;

        Double velocidadeAtual = 0.0;


        /*esse foi acelerar é a mesma coisa que:
            function acelerar(){
            console.log('Vrummmmmm...)
            }
         */
        //As funções em JAVAsão chamadas de métodos
        //void = o que essa função vai retornar, nesse caso nada, acelerar = nome da função e () = os parâmetros da função
         void acelerar(){
            System.out.println("VRUUUUUMMMMMMMM...");
            velocidadeAtual += 2.5;
        }
        void frear(){
                System.out.println("RRIIRRRRMMMM");
                velocidadeAtual -= 2.5;
        }




}
