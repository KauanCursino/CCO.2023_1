  package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

  private String nome;
  private List<Aluno> alunos;

  public Faculdade(String nome) {
    this.nome = nome;
    this.alunos = new ArrayList<>();
  }

  /*
      Deve verificar se existe um aluno com o nome informado, caso não exista,
      retorne false;
  */
  public Boolean existsAlunoPorNome(String nome) {
    for (Aluno aluno : alunos) {
      if (aluno.getNome() != null && aluno.getNome().equalsIgnoreCase(nome)) {
        return true;
      }
    }
    return false;
  }

  /*
      Deve matricular um aluno na faculdade (inserir na lista), se a lista já
      possuir um aluno com o nome informado, não deve matricular;
  */
  public void matricularAluno(Aluno aluno) {
    boolean alunoExists = false;
    for (int i = 0; i < alunos.size(); i++) {
      if (alunos.get(i).equals(aluno)) {
        alunoExists = true;
        break;
      }
    }
    if (!alunoExists && aluno != null) {
      alunos.add(aluno);
    }

  }

  /*
      Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
      um aluno com o RA informado, não faça nada.
  */
  public void cancelarMatricula(String ra) {
    for (Aluno aluno : alunos) {
      if (aluno.getRa().equals(ra)) {
        aluno.setAtivo(false);
        break;
      }
    }
  }

  /*
      Deve retornar a quantidade de alunos contidos na lista (matriculados);
  */
  public Integer getQuantidadeAlunos() {
    return alunos.size();
  }

  /*
      Deve retornar a quantidade de alunos matriculados (contidos na lista)
      no semestre informado;
  */
  public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
    for (Aluno aluno : alunos) {
    }
    return 0;
  }

  /*
      Deve retornar a quantidade de alunos com matrícula cancelada (contidos na lista);
  */
  public Integer getQuantidadeAlunosComMatriculaCancelada() {
    int contador = 0;
    for (Aluno aluno : alunos) {
      if (!aluno.isAtivo()) {
        contador++;
      }
    }
    return contador;
  }

  public String getNome() {
    return nome;
  }
}