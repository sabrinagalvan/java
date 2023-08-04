package br.com.alura.java8.test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("Editora casa do código");
        palavras.add("Caelum");

        System.out.println(palavras);

//        ___________________________________________________________

//        class ComparadorPorTamanho implements Comparator<String> {
//          @Override
//          public int compare(String s1, String s2) {
//              if (s1.length() < s2.length())
//                  return -1;
//              if (s1.length() > s2.length())
//                  return 1;
//              return 0;
//        }

//        Comparator<String> comparador = new ComparadorPorTamanho();
//        palavras.sort(comparador);

//        palavras.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() < s2.length())
//                    return -1;
//                if (s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//         });

//        palavras.sort((String s1, String s2) -> {
//            if (s1.length() < s2.length())
//                return -1;
//            if (s1.length() > s2.length())
//                return 1;
//            return 0;
//        });

//        palavras.sort(( s1, s2) -> {
//            if (s1.length() < s2.length())
//                return -1;
//            if (s1.length() > s2.length())
//                return 1;
//            return 0;
//        });

//        palavras.sort(( s1, s2) -> {
//            return Integer.compare(s1.length(), s2.length());
//        });

//        palavras.sort(( s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        Function<String, Integer> funcao = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);

//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);

//        Comparator<String> comparador = Comparator.comparing(s -> s.length());
//        palavras.sort(comparador);

//        palavras.sort(Comparator.comparing(s -> s.length()));

        palavras.sort(Comparator.comparing(String::length));

//        ___________________________________________________________

//        class ImprimeNaLinha implements Consumer<String> {
//          @Override
//          public vois accept(String s) {
//              System.out.println(s);
//          }
//        }

//        Consumer<String> consumidor = new ImprimeNaLinha;
//        palavras.forEach(consumidor);

//        Consumer<String> consumidor = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        palavras.forEach(consumidor);

//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        palavras.forEach((String s) -> {
//            System.out.println(s);
//        });

//        Consumer<String> impressor = s -> System.out.println(s);
//        palavras.forEach(impressor);

//        Consumer<String> impressor = System.out::println;
//        palavras.forEach(impressor);

//        palavras.forEach(s -> System.out.println(s));

        palavras.forEach(System.out::println);

    }

}
