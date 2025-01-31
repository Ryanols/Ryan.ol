package Aula8;

public class Main {
    public static void main (String[] args) {
        //Conversão dos tipos ou casting
        double d = 10.1;
        short s = 2;

        //float x = d / s;  Dessa forma da erro. Tenmos que declarar dessa forma para mudar o tipo
        float x = (float) d / s;
        System.out.print(x);
    }
}
