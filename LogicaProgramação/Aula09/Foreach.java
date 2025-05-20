package LogicaProgramação.Aula09;

public class Foreach {
    public static void main(String[] args) {
        //Existe uma maneira de percorrermos por arrays multidimensionais usando o foreach
        int[][] number = new int[3][3];
        number[0][0] = 20;
        number[0][1] = 15;
        number[0][2] = 1;

        number[1][0] = 20;
        number[2][1] = 15;
        number[2][2] = 15;

        //Cria uma variavel de referencia durante o for
        for (int[] arrayBase : number) {
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }
    }
}
