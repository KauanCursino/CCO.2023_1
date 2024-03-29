package school.sptech;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<UsuarioBanco> usuarios = List.of(
        new UsuarioBanco(1L, "João", "Silva", "joao@example.com", "senha123", 25, false),
        new UsuarioBanco(2L, "Maria", "Santos", "maria@example.com", "senha456", 30, true),
        new UsuarioBanco(3L, "Carlos", "Ferreira", "carlos@example.com", "senha789", 22, false),
        new UsuarioBanco(4L, "Ana", "Oliveira", "ana@example.com", "senhaabc", 28, true),
        new UsuarioBanco(5L, "Lucas", "Costa", "lucas@example.com", "senhadef", 35, false),
        new UsuarioBanco(6L, "Julia", "Rodrigues", "julia@example.com", "senha123", 27, true),
        new UsuarioBanco(7L, "Felipe", "Mendes", "felipe@example.com", "senha456", 32, false),
        new UsuarioBanco(8L, "Mariana", "Pereira", "mariana@example.com", "senha789", 20, true),
        new UsuarioBanco(9L, "Gustavo", "Ramos", "gustavo@example.com", "senhaabc", 29, false),
        new UsuarioBanco(10L, "Camila", "Lima", "camila@example.com", "senhadef", 26, true),
        new UsuarioBanco(11L, "Rafael", "Almeida", "rafael@example.com", "senha123", 31, false),
        new UsuarioBanco(12L, "Isabela", "Gomes", "isabela@example.com", "senha456", 24, true),
        new UsuarioBanco(13L, "Diego", "Sousa", "diego@example.com", "senha789", 33, false),
        new UsuarioBanco(14L, "Patrícia", "Martins", "patricia@example.com", "senhaabc", 23, true),
        new UsuarioBanco(15L, "Rodrigo", "Fernandes", "rodrigo@example.com", "senhadef", 34, false)
    );

    // Sem alterar a lista original exiba:

    // 1 - Todos os usuários admin
    // 2 - A soma de todas as idades de todos os usuários
    // 3 - A soma de todas as idades de usuários admin
    // 4 - Todos os usuários admin com idade maior que 30 anos
    // 5 - Apenas o nome completo de todos os usuários
    // 6 - Apenas o nome completo de todos os usuários com idade maior que 25 anos
    // 7 - Maior idade da lista
    // 8 - Menor idade da lista
    // 9 - Todos os usuários convertidos para UsuarioApi
    // 10 - Usuários admin convertidos para UsuarioApi

    //1
    for (UsuarioBanco usuario : usuarios) {
        if (usuario.getAdmin() == true){
          System.out.println(usuario);
        }
    }

    //2
      int somaIdadesExercicio2 = usuarios.stream()
              .mapToInt(UsuarioBanco::getIdade)
              .sum();
      System.out.println("soma das idades: " + somaIdadesExercicio2);

    //3
      int somaIdadesExercicio3 = usuarios.stream()
              .filter(UsuarioBanco::getAdmin)
              .mapToInt(UsuarioBanco::getIdade)
              .sum();
      System.out.println("soma das idades dos ADM: " + somaIdadesExercicio3);

    //4
    Double somaIdadesExercicio4 = 0.0;
    for (UsuarioBanco usuario : usuarios){
      if (usuario.getAdmin() == true && usuario.getIdade() > 30){
          somaIdadesExercicio4 += usuario.getIdade();
      }
    }
      System.out.println("soma das idades dos ADM maiores que 30 anos: " + somaIdadesExercicio4);

    //5
    for (UsuarioBanco usuario : usuarios){
        System.out.println(usuario.getPrimeiroNome() + " " + usuario.getUltimoNome());
    }

    //6
    System.out.println("--------");
    for (UsuarioBanco usuario : usuarios){
        if (usuario.getIdade() > 25){
            System.out.println( usuario.getPrimeiroNome() + " " + usuario.getUltimoNome());
        }
    }

    //7
      Integer maiorIdade =  usuarios.stream()
              .mapToInt(UsuarioBanco::getIdade)
              .max().getAsInt();
      System.out.println("Maior idade da lista: " + maiorIdade);

    //8
      Integer menorIdade = usuarios.stream()
              .mapToInt(UsuarioBanco::getIdade)
              .min().getAsInt();
      System.out.println("Menor idade da lista: " + menorIdade);


  }

}