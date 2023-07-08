package br.com.sabrina.aula.test;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("desenvolvedor.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}