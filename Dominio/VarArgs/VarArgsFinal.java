package EstudoClasses.Dominio.VarArgs;

public class VarArgsFinal {
    public static void main(String[] args) {
        DominioVarArgs varArgs = new DominioVarArgs();
        int[] listaNum = {1,8,6,9,4,7};
        varArgs.somaArray(listaNum);

        DominioVarArgs varArgs1 = new DominioVarArgs();
        varArgs1.somaArray2(1,2,3,8,4,6);
    }
}



