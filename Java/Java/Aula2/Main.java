package Aula2;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
    //Funções podem ser chamadas em outros blocos de códigos
    soma(10, 15); //Eu posso tabto passar os parametros quanto vazer com variaveis

    }

    static void soma (int x , int y) {
        //static void é usado para criar uma nova função, sendo padrão e obrigatorio
        var somar = x + y;
        System.out.println(somar);
    }
}
