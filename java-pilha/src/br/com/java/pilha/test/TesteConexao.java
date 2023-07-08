package br.com.java.pilha.test;

import br.com.java.pilha.modelo.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
        try(Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }
        //-----------------------------------------
//        modelo.Conexao con = null;
//        try {
//            con = new modelo.Conexao();
//            con.leDados();
//        } catch(IllegalStateException ex) {
//            System.out.println("Deu erro na conexão");
//        } finally {
//            System.out.println("finally");
//            if(con != null) {
//                con.close();
//            }
//        }
    }
}