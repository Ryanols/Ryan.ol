package LogicaProgramação.Aula08;

public class IniciarArrys {
    public static void main(String[] args) {
        //Vamos usar o foreach

        //Essa é uma nova forma de iniciar os arrays
        int[] number = {1,2,3,4,5};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        //Existe um for que serve somente para percorrer
        //A variável de referência tem que ser do mesmo tipo que o nosso array.

        for (int cont : number ) {
            System.out.println(cont);
        }
        //para fazer um foreach é so escrever iter
    }
}
