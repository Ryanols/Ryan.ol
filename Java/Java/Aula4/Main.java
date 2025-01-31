package Aula4;


import java.util.Random;

public class Main {
    public static void main (String[] args) {
        //Repetições
        Random gerar = new Random();


        //Usando o while
        /*int i = 0;
        while(i <= 6) {
            int aleatorio = gerar.nextInt(60); //O nextInt vai gerar numeros aletorios.
            System.out.println(aleatorio);
            i ++;
        }*/

        //Usando o for
        for (int i = 0; i <= 6; i++) {
            int aleatorio = gerar.nextInt(60); //O nextInt vai gerar numeros aletorios.
            System.out.println(aleatorio);
        }




    }
}
