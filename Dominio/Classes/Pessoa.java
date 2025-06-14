package EstudoClasses.Dominio.Classes;

import Testes.ex03.DominioPessoa;

public class Pessoa{
    public static void main(String[] args) {
        DominioPessoa pessoa = new DominioPessoa();
        pessoa.nome = "Ryan";
        pessoa.idade = 20;
        System.out.println(pessoa.nome + pessoa.idade);
    }
}
