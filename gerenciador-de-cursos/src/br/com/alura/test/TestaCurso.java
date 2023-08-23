package br.com.alura.test;

import br.com.alura.modelo.Curso;
import br.com.alura.modelo.Aula;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções Java", "Sabrina Galvan");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(javaColecoes.getAulas());

    }

}
