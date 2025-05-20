package LogicaProgramação.Aula05;

public class Laços {
    public static void main(String[] args) {
        int count = 0;
        while (count < 11) {
            System.out.println(count);
            count += 1;
        }

        do {
            System.out.println("Verdade");
        } while (count < 10);

        //Se eu quiser usar alguma variaval eu posso mas tenho que colocar do jeito que esta nese for. Tem que ster valor atribuido.
        //Normalmente quabdo temos mais de um for seguimos a logica das letras. I J K L
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
