package Aula11.Teste;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner escanear = new Scanner(System.in);
        Scanner escanear2 = new Scanner(System.in);


        Pessoa a1 = new Pessoa();

        System.out.println("Vamos começar seu cadastro. Primeiro seu nome completo:");
        a1.nomeComp = escanear.nextLine();

        System.out.println("Agora sua idade:");
        a1.idade = escanear.nextInt();

        System.out.println("Por ultimo sua profissão:");
        a1.profissao = escanear2.nextLine();

        System.out.println(a1.nomeComp);
        System.out.println(a1.idade);
        System.out.println(a1.profissao);

    }
}
