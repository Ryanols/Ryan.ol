package EstudoClasses.Dominio.Modificadores;

public class GentreFinal {
    public static void main(String[] args) {
        DominioGente gente = new DominioGente();
        gente.setIdade(21);
        gente.setNome("Ryan");
        //Aqui usamos o metodo set para colocar valores neles
        System.out.println(gente.getNome());
        System.out.println(gente.getIdade());
        
    }
}
