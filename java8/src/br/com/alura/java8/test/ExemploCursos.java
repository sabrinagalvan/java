package br.com.alura.java8.test;

import br.com.alura.java8.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.sort(Comparator.comparing(c -> c.getAlunos()));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(System.out::println);

//        cursos.forEach(c -> System.out.println(c.getNome()));

//        cursos.stream()
//            .filter(c -> c.getAlunos() >= 100)
//            .map(c -> c.getAlunos())
//            .forEach(total -> System.out.println(total));

//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .map(Curso::getAlunos)
//                .forEach(System.out::println);

//        int sum = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .mapToInt(Curso::getAlunos)
//                .sum();

//        OptionalDouble media = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .mapToInt(Curso::getAlunos)
//                .average();

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();

        System.out.println(sum);

//        Optional<Curso> optionalCurso = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .findAny();
//
//        Curso curso = optionalCurso.orElse(null);
//        System.out.println(curso.getNome());
//
//        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .findAny()
//                .ifPresent(c -> System.out.println(c.getNome()));
//
//        List<Curso> resultado = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toList());

//        cursos = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toList());

//        cursos.stream()
//                .forEach(c -> System.out.println(c.getNome()));

//        Map<String, Integer> map = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toMap(
//                        c -> c.getNome(),
//                        c -> c.getAlunos()));
//        System.out.println(map);

       cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
               .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

    }

}
