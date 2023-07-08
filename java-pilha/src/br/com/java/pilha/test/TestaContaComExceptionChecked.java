package br.com.java.pilha.test;

import br.com.java.pilha.modelo.Conta;
import br.com.java.pilha.modelo.MyException;

public class TestaContaComExceptionChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try{
            c.deposita();
        } catch(MyException ex) {
            System.out.println("tratamento ...");
        }
    }
}