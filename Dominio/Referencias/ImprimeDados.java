package EstudoClasses.Dominio.Referencias;

public class ImprimeDados {
    public void imprimir(DominoEstudanteNovo estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
