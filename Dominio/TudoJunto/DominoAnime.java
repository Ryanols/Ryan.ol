package EstudoClasses.Dominio.TudoJunto;

public class DominoAnime {
    private String nome;
    private String tipo;
    private int eps;
    private  String genero;

    //Esse init serve como um set mas podemos colocar mais de um no mesmo set
    //Os construtores senvem para darmos origem aos objetos
    public void init(String nome , String tipo , int eps) {
        this.eps = eps;
        this.tipo = tipo;
        this.nome = nome;
    }

    public void init(String nome , String tipo , int eps , String genero) {
        this.init(nome , tipo , eps);
        this.genero = genero;
    }

    public String getNome() {
        return this.nome;
    }
    public String getTipo() {
        return this.tipo;
    }

    public int getEps(){
        return this.eps;
    }
}
