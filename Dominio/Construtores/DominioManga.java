package EstudoClasses.Dominio.Construtores;

public class DominioManga {

    private String nome;
    private String tipo;
    private int eps;
    private  String genero;

    public DominioManga(String nome , String tipo , int eps , String genero) {
        this.nome = nome;
        this.eps = eps;
        this.genero = genero;
        this.tipo = tipo;
    }
    //Os construtores podem substituir os inits
    //Existe a sobrecarga de construtores


    public String getNome() {
        return this.nome;
    }
    public String getTipo() {
        return this.tipo;
    }

    public int getEps(){
        return this.eps;
    }

    public String getGenero(){
        return this.genero;
    }
}
