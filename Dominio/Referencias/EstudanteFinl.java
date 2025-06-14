package EstudoClasses.Dominio.Referencias;

public class EstudanteFinl {
    public static void main(String[] args) {
        DominoEstudanteNovo estudantePronto = new DominoEstudanteNovo();
        estudantePronto.nome = "Ryan";
        estudantePronto.idade = 20;
        estudantePronto.sexo = 'M';

        ImprimeDados mostrarDados = new ImprimeDados();
        mostrarDados.imprimir(estudantePronto);
    }

}
