package br.com.alura.test;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções Java", "Sabrina Galvan");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 24));

        Aluno a1 = new Aluno("Sabrina Galvan", 7777);
        Aluno a2 = new Aluno("Juliana Galvan", 8888);
        Aluno a3 = new Aluno("Tiago Parreiral", 9999);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados: ");

//        javaColecoes.getAlunos().forEach(a -> {
//            System.out.println(a);
//        });

//        for (Aluno a : javaColecoes.getAlunos()) {
//            System.out.println(a);
//        }

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        //Vector<Aluno> vetor = new Vector<>();

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno sabrina = new Aluno ("Sabrina Galvan", 7777);
        System.out.println("A aluna Sabrina, está matriculada?");
        System.out.println(javaColecoes.estaMatriculado(sabrina));

        System.out.println("O a1 é equals a Sabrina?");
        System.out.println(a1.equals(sabrina));

        // obrigatoriamente o seguinte é true:

        System.out.println(a1.hashCode() == sabrina.hashCode());

    }

}
