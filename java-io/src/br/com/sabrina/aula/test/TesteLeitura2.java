package br.com.sabrina.aula.test;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();
            System.out.format(new Locale("pt", "BR"),"%s - %04d - %06d, %18s: %08.2f %n", tipoConta, agencia, numero, titular, saldo);
            linhaScanner.close();
//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);
        }
        scanner.close();
    }
}