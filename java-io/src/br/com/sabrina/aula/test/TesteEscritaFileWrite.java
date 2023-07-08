package br.com.sabrina.aula.test;

import java.io.*;

public class TesteEscritaFileWrite {
    public static void main(String[] args) throws IOException {
        //Fluxo de saida com arquivo
//        OutputStream fos = new FileOutputStream("desenvolvedor-escrita2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
        BufferedWriter bw = new BufferedWriter(new FileWriter("desenvolvedor-escrita2.txt"));
        bw.write("Testando 2");
        bw.newLine();
        bw.newLine();
        bw.write("exeção, complô, autruísta");
        bw.close();
    }
}