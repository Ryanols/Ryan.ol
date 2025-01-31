package Aula11;

public class Main {
    public static void main (String[] args) {
        //POO
        //Fazer com que tudo que temos possa ser trazida para ser tratado como forma de objetos

        //As classes são moldes para criarmos os objetos. Basicamente criamos intruções prontas para chamarmos depois.
        //As classes devem definir propriedades/caracteristicas e comportamentos/metodos

        Usuario a1 = new Usuario();
        a1.setPrinome("Ryan");
        a1.Ultinome = "Oliveira";

        a1.estalogado(true);

        System.out.println(a1.getPrinome());


    }
}
