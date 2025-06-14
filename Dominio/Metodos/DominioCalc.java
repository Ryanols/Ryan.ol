package EstudoClasses.Dominio.Metodos;

public class DominioCalc {
    //O void serve como nada. Siginifica vazio. Quando colocamos como void ela nao nos dara um retorno.
    public void somaDoisNum() {
        System.out.println(10 + 10);
    }

    public void subDoisNum(){
        System.out.println(10 - 5);
    }

    public void multiDOisNum(int num , int num2){
        //Isso que fiz sao os parametros dentros das classes
        System.out.println(num * num2);
    }

    //Vamos ver agora quando queremos que algo seja retornado
    public double diviDoisNum(double num , double num2) {
        if ( num2 != 0) {
            return num / num2;
        }
        return 0;
        //Obrigatorio ter um return no final

    }

    public void testeSemretorno(double num , double num2) {
        if (num2 == 0) {
            System.out.println("Nao tem divisão por 0");
            return;
            //Esse returtn serve como uym break mas somen quando usamos o void
        }
        System.out.println(num / num2);
    }
}
