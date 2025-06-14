package EstudoClasses.Dominio.This;

public class DominioJogo {
    public String nome;
    public int lancamento;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.lancamento);
        //O this serve para que possamos acessar os atributos/algo de uma classe dentro dela mesmo
        //Nao é bom fazer isso pois estamos colcando funções a mais
    }
}
