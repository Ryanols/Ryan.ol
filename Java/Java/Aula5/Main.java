package Aula5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Java interativo

        //Para podermos fazer com que o usuário use o prompt temos que ter um objeto do tipo scanner. Ele vem de um biblioteca
        Scanner escanear = new Scanner(System.in);

        System.out.println("Escreva seu nome:");
        //O nextLine serve para colocar o que for escaneado dentro de um variavel
        String nome = escanear.nextLine();

        System.out.println("Opa" + nome);
    }
}
