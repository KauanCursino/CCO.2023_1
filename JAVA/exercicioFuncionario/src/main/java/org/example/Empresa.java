package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFunc(Funcionario f){
        funcionarios.add(f);
        funcionarios.toString();
    }

    public void exibirTodos(){
        for (Funcionario f: funcionarios){
            f.toString();
        };
        System.out.println(funcionarios);
    }

    public void exibirTotalSalario(){

    }
}
