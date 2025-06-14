package EstudoClasses.Dominio.TudoJunto;

public class AnimeFinal {
    public static void main(String[] args) {
        DominoAnime anime = new DominoAnime();
        anime.init("One Piece" , "TV" , 1110);
        //O init tem uma função que ele poder ser repetido. Criamos outro void para ele e colocamos novas infos.Isso se chama sobrecarga de metodos.
        anime.init("One Piece" , "TV" , 1110 , "Ação");
        System.out.println(anime.getEps());
    }
}

