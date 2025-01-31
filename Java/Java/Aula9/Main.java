package Aula9;

public class Main {
    public static void main (String[] args0) {
        //Manipulando strings
        String falar = "Ola pessoas";

        //O metodo length serve para contar quantos carcteres existe na nossa frase
        System.out.println(falar.length());

        //Para procurar algum determinado caracter
        System.out.println(falar.contains("p"));

        //Procurar por indice
        System.out.println(falar.indexOf("O"));

        //Caso tenmha caracter repetido mostra a ultima vez que aparaceu
        System.out.println(falar.lastIndexOf("s"));

        //Colocar os caracteres em maiusculo e minusculo
        System.out.println(falar.toUpperCase());
        System.out.println(falar.toLowerCase());

        //Remover espaços desnecessários
        System.out.println(falar.trim());

        //Pegar partes da frase a partri do seu indice
        System.out.println(falar.substring(4));

        //Comparação
        System.out.println(falar.equals("Ola Pessoas"));



    }
}
