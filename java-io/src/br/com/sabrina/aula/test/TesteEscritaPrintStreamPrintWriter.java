package br.com.sabrina.aula.test;

import javax.swing.*;
import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
        //Fluxo de saida com arquivo
//        OutputStream fos = new FileOutputStream("desenvolvedor-escrita3.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//        BufferedWriter bw = new BufferedWriter(new FileWriter("desenvolvedor-escrita3.txt"));
//        PrintStream ps = new PrintStream(new File("desenvolvedor-escrita3.txt"));
        PrintWriter ps = new PrintWriter("desenvolvedor-escrita3.txt", "UTF-8");
        ps.println("Testando 3");
        ps.println();
        ps.println();
        ps.println();
        ps.println("exeção, complô, autruísta");
        ps.close();
        System.out.println();
    }
}