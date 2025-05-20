package LogicaProgramação.Aula07;

public class Vetores {
    public static void main(String[] args) {
        //Podemos declarar de outra forma. Seria int ages[];
        int[] ages = new int[3];
        //Somente tipos de referencia podem ser incializados como null.
        ages[0] = 20;
        ages[1] = 16;
        ages[2] = 21;

        //Podemos usar o for para que seja iterado por todo o vetor
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        //Arrays não podem ser alterados dinamicamente.
    }
}
