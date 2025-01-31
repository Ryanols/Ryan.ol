package Aula12;


import Aula11.Usuario;

public class Main {
    //POO com arrays
    public static void main(String[] args) {
        //Criamos uma array com 10 espaços na memória
        Usuario[] usuario1 = new Usuario[10];

        for ( int i = 0; i < usuario1.length; i++) {
            Usuario atual = new Usuario();
            atual.setPrinome("Nome:" + i);
            usuario1[i] = atual;
        }

        System.out.println(usuario1[4].getPrinome());
    }
}
