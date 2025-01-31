package Aula11;

public class Usuario {

    private boolean logado;
    private String Prinome;
    public String Ultinome;


    //Quando colocamos como publico isso nos permite  modificar ela. Já o privado não.
    //O private serve par quando temos algum dado que não queremos que ele seja alterado.

    //Esse comando permiote alterar o comportamento no outro codigo usando o private
    public void estalogado(boolean logar) {
        logado = logar;
    }
    //Quando temos um tipo de dado definido para a nossa classe, não usamos void e sim o tipo do dado. EX
    //public int ou public String


    //SETTER e GETTER
    //Set vem de mudar e get de pegar. BAsicamente alteramos tanto sua visibilidade como caracteristicas em uma classe e pegamos em outra

    public void setPrinome(String Prinome) {
        //Como estamos criando oum paramatro com o mesmo nome precisamos usar o this
        this.Prinome = Prinome.toUpperCase(); //Pegamos a variavel e colocamos o parametro dentro dela
    }

    public String getPrinome() {
        return Prinome;
    }


}
