package Aula3_Calculadora;


public class Main {
    public static void main (String[] args) {
        //Precisamos transformar a string em numeros
        int num1 = Integer.parseInt(args[1]);//Transforma para inteiro
        int num2 = Integer.parseInt(args[2]);

        if(args[0].equals("somar")) {
            somar(num1 , num2);

        } else if (args[0].equals("sub")) {
            sub(num1 , num2);
        } else {
            System.out.println("Nenhuma das ações disponiveis escolhidas.");
        }
        // O equals serve para igualdade, meioq ue uma comparação

        }
        static void somar(int num1 , int num2) {
            System.out.println(num1 + num2);
        }

        static void sub(int num1 , int num2) {
            System.out.println(num1 - num2);

        }
}


