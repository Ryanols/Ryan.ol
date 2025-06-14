package EstudoClasses.Dominio.Metodos;

public class Calculadora {
    public static void main(String[] args) {
        DominioCalc somar = new DominioCalc();
        somar.somaDoisNum();
        //Atributos sao quando damos valores e metodos são quando nos damos o que ela faz.
        //Ex aqui estamos somente chamando o nosso metodo.

        DominioCalc sub = new DominioCalc();
        sub.subDoisNum();

        DominioCalc multi = new DominioCalc();
        multi.multiDOisNum(10 , 5);

        DominioCalc dividir = new DominioCalc();
        double resultado = dividir.diviDoisNum(20 , 0);
        System.out.println(resultado);

        DominioCalc teste = new DominioCalc();
        teste.testeSemretorno(20  , 0);
    }
}
