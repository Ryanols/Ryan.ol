package EstudoClasses.Dominio.Construtores;

import EstudoClasses.Dominio.TudoJunto.DominoAnime;

public class MangaFinal {
        public static void main(String[] args) {
            DominioManga anime = new DominioManga("Pokemon" , "Mangá" , 500 , "Aventura");

            System.out.println(anime.getEps());
            System.out.println(anime.getTipo());
            System.out.println(anime.getNome());
            System.out.println(anime.getGenero());


        }
    }



