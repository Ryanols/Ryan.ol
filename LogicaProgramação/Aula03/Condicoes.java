package LogicaProgramação.Aula03;

public class Condicoes {
    public static void main(String[] args) {

        //Temos no java outro metodo de fazer condições.
        //Operadore ternario é assim --> (condição) ? verdadeira : falsa
        //Ex:

        double salary = 6000;
        String mensagedonate = "Eu vou poder doar";
        String donotdonate = "Não vou poder";
        String result = salary >= 5000 ? mensagedonate : donotdonate;
        System.out.println(result);

    }
}
