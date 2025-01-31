package Aula10;

import java.util.Scanner;

public class Main {
        public static void main (String[] args) {
            //Comparando Strings
            String senha = "123456";
            System.out.println("Digite sua senha: ");

            Scanner escanear = new Scanner(System.in);
            String pass = escanear.nextLine();


            //O equals serve como um ==
            //Porem se  usarmos == sai um resultado diferente, pois ele compara os espaços na memória e não o conteudo
            System.out.println(senha.equals(pass));


        }
}
