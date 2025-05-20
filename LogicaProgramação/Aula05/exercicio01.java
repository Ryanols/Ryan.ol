package LogicaProgramação.Aula05;

public class exercicio01 {
    public static void main(String[] args) {
        //Imprimir todos os numeros pares de 0 ate 1M ou seja 1.000.000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
           //Outra forma de ser feita é trocando a quabtidade do incremento. Em vez de i++ poderia ser  i+=2
        // Porem se no futuro o numero que começarmos a contar mudar vai dar erro

        }
    }
}
