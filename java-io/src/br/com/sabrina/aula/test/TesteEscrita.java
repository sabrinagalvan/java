package br.com.sabrina.aula.test;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //Fluxo de saida com arquivo
        OutputStream fos = new FileOutputStream("desenvolvedor-escrita.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("testando");
        bw.newLine();
        bw.newLine();
        bw.write("exeção, complô, autruísta");
        bw.close();
    }
}