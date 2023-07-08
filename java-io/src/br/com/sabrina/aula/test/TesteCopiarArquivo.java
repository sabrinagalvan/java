package br.com.sabrina.aula.test;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket();
        InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("desenvolvedor.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        OutputStream fos = s.getOutputStream(); //System.out; //new FileOutputStream("desenvolvedor-copiar-arquivo.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        String linha = br.readLine();
        while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }
        br.close();
        bw.close();
    }
}