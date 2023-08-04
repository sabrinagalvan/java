package br.com.alura.java8.test;

import br.com.alura.java8.modelo.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.sort(Comparator.comparing(c -> c.getAlunos()));

//        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(System.out::println);

        cursos.forEach(c -> System.out.println(c.getNome()));

    }

}
