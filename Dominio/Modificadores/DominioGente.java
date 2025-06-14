package EstudoClasses.Dominio.Modificadores;

public class DominioGente {
    //Vamos estudar sobre o private. Serve para diminuir o quanto uma classe consegue saber da outra
    private String nome ;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
        if (idade < 0) {
            System.out.println("Idade invalida");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
