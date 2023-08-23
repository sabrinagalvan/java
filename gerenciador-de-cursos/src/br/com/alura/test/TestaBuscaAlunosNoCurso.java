package br.com.alura.test;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Curso;
import br.com.alura.modelo.Aula;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) throws NoSuchFieldException {

        Curso javaColecoes = new Curso("Dominando as coleções Java", "Sabrina Galvan");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 24));

        Aluno a1 = new Aluno("Sabrina Galvan", 7777);
        Aluno a2 = new Aluno("Juliana Galvan", 8888);
        Aluno a3 = new Aluno("Tiago Parreiral", 9999);
        Aluno a4 = new Aluno("Marieni Cangussu", 7777);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);
        javaColecoes.matricular(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com a matrícula 7777?");
        Aluno aluno = javaColecoes.buscaMatriculado(7777);
        System.out.println("aluno: " + aluno);

        Map<Integer, Set<Aluno>> matriculaParaAlunos;

    }

}
