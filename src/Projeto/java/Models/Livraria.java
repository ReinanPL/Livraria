package Projeto.java.Models;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Livraria {

    public static ArrayList<Livro> lista = new ArrayList<>();

    /**
     * Função: busca pelo nome
     * 
     * @return função para descobrir se o livros está no array list
     */
    public static Livro buscaPeloNome(String Nome) {
        int indexLista = lista.indexOf(new Manga(Nome));
        if (indexLista >= 0) {
            return lista.get(indexLista);
        }
        return null;
    }
   
    /**
     * Função: remover livro
     * 
     * @return função para remover o livro do arraylist
     */
    public static boolean remover(String Nome) {
        Livro LivroExcluir = new Manga(Nome);
        Livraria.lista.remove(LivroExcluir);
        return true;
    }

    /**
     * Função: set livro
     * 
     * @return função para mudar o preço do livro
     */
    public static boolean setPreco(String Nome, double preco) {
        Livro lista = buscaPeloNome(Nome);
        if (lista != null) {
            lista.setPreco(preco);
            return true;
        }
        return false;
    }

    /**
     * Função: acessar listas
     * 
     * @return função para acessar os tipos de listagens
     */
    public static void acessarListas() {
        int opt;
        try {
            opt = Saida.selecionarTipoLista();

            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
            System.out.println();
            System.out.println("Digite novamente a opção desejada");
            opt = Saida.selecionarTipoLista();

        }

        switch (opt) {
            case 1:

                System.out.println();
                Saida.listarLivros(lista);// puxar a função listarLivros
                Saida.menuFinal();

                break;

            case 2:

                System.out.println();
                Saida.printPorPreço(lista);
                Saida.menuFinal();

                break;

            case 3:

                System.out.println();
                Saida.printPorNome(lista);
                Saida.menuFinal();

                break;
        }

    }

}
