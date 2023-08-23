package br.com.alura.test;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Sabrina Galvan");
        alunos.add("Juliana Galvan");
        alunos.add("Tiago Parreiral");
        alunos.add("Rodrigo Nunes");
        alunos.add("Marieni Cangussu");
        alunos.add("Nico Steppat");

        boolean bibiEstaMatriculada = alunos.contains("Bibi Galvan");
        alunos.remove("Nico Steppat");
        System.out.println(bibiEstaMatriculada);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);



    }

}
