package LogicaProgramação.Aula09;

public class Inicializacao {
    public static void main(String[] args) {
        //Podemos iniciar arrays com tamanhos diferentes
        int[][] arrayBase = new int[3][];
        arrayBase[0] = new int[2];
        arrayBase[1] = new int[5];
        arrayBase[2] = new int[3];

        //Podemos ja coplcoar seus valores
        arrayBase[0] = new int[]{1,2};

        for (int[] arrayAux : arrayBase) {
            for (int num : arrayAux) {
                System.out.print(num  + " ");
                //podemos usar print pois o println pula linha
            }
        }
    }
}
