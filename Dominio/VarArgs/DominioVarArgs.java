package EstudoClasses.Dominio.VarArgs;

public class DominioVarArgs {
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

public void somaArray2(int... numeros) {
    int soma = 0;
    for (int num : numeros) {
        soma += num;
    }
    System.out.println(soma);
    //O varargs tem que ser o ultimo elemento do colocado no parametro
    //Se caso rtenhamos algum oputro atributo antes ele vaio ocupar um, lugar na meoria ea soma vai ter menos 1 para cad aributo


}
}
