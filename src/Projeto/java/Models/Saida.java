package Projeto.java.Models;

import java.util.*;

public class Saida {
    /**
     * Função: Seja Bem Vindo.
     * 
     * @return Retorna uma mensagem de Seja bem vindo
     */
    public static void sejaBemVindo() { // função Seja bem vindo
        System.out.println("|-------------- Seja bem vindo a livraria -------------|");
    }

    /**
     * Função: menu livraria.
     * 
     * @return cada número digitado irá definir um caso diferente
     */
    public static int menuPrincipal(){ //
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("|------------- Menu principal da livraria -------------|");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|- Digite [1]           Adicionar Novo Livro          -|");
        System.out.println("|- Digite [2]         Acessar Lista de Livros         -|");
        System.out.println("|- Digite [3]             Procurar Livro              -|");
        System.out.println("|- Digite [4]             Remover Livro               -|");
        System.out.println("|- Digite [5]       Modificar o Preço do Livro        -|");
        System.out.println("|- Digite [0]           Sair da livraria :(           -|");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|----------- Digite o numero de sua escolha: ----------|");
        System.out.println();

        return Entrada.obterInteiroTeclado();
        
    }

    public static int menuFinal() {
        System.out.print("Para retornar ao menu digite [0]:\n");
        return Entrada.obterInteiroTeclado();
    }

    /**
     * Função Imprimir Lista
     */

    public static void imprimir(Livro l) { // função para imprimir os 3 atributos do objeto

        System.out.printf("| %-20s | %-20s | %-20s |\n", l.getNome(), l.getGenero(), l.getAutor());

    }

    /**
     * Função Imprimir Busca
     */
    public static void imprimirBusca(Livro l) {// função para imprimir os 5 atributos do objeto

        String PaginaPretoBranco = ((Manga) l).getPaginaPretoBranco() ? "Sim" : "Não";
        String LerTrasPraFrente = ((Manga) l).getLerTrasPraFrente() ? "Sim" : "Não";

        System.out.println();
        System.out.println("Nome : " + l.getNome());
        System.out.println("Genero : " + l.getGenero());
        System.out.println("Autor : " + l.getAutor());
        System.out.println("Nº de Paginas : " + l.getPaginas());
        System.out.println("Preço : " + l.getPreco());
        System.out.println("Páginas em Preto e Branco : " + PaginaPretoBranco);
        System.out.println("Leitura da Esquerda pra Direita : " + LerTrasPraFrente);
        System.out.println();

    }

    /**
     * Função puxar lista de livros registrados
     * 
     * @param registro
     */
    public static void listarLivros(ArrayList<Livro> lista) { // função para imprimir todos os objetos com os
        // respectivos atributos
        String Nome = "Nome";
        String Genero = "Genero ";
        String Autor = "Autor";
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("|--------------------------------------------------------------------|");
        System.out.printf("| %-20s | %-20s | %-20s |\n", Nome, Genero, Autor);
        System.out.println("|--------------------------------------------------------------------|");
        for (int i = 0; i < lista.size(); i++) { // for para percorrer todo o array

            imprimir(lista.get(i));// puxa a função de imprimir os 3 atributos do array
        }
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println();

    }

    /**
     * Função Selecionar Tipop da Consulta
     */
    public static int selecionarTipoConsulta() {
        System.out.println();
        System.out.println("|-------------------------------------------------|");
        System.out.println("|- Digite [1]         Consultar por nome         -|");
        System.out.println("|- Digite [2]         Consultar por autor        -|");
        System.out.println("|- Digite [3]         Consultar por gênero       -|");
        System.out.println("|- Digite [0]         Retornar ao menu           -|");
        System.out.println("|-------------------------------------------------|");
        System.out.println();

        return Entrada.obterInteiroTeclado();

    }

    public static int selecionarTipoLista() {
        System.out.println();
        System.out.println("|------------------------------------------------------|");
        System.out.println("|- Digite [1]         Acessar Lista de Livros         -|");
        System.out.println("|- Digite [2]    Acessar Lista de Livros Por Preço    -|");
        System.out.println("|- Digite [3]     Acessar Lista de Livros Por Nome    -|");
        System.out.println("|- Digite [0]            Retornar ao menu             -|");
        System.out.println("|------------------------------------------------------|");
        System.out.println();

        return Entrada.obterInteiroTeclado();

    }

    /**
     * Função: imprimir por preço
     * 
     * @return Ira fazer uma listagem de todos os livros por preço
     */
    public static void printPorPreço(ArrayList<Livro> lista) {
        String Preco = "Preço";
        String Nome = "Nome ";
        String Autor = "Autor";
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("|-                       Listagem por preço                         -|");
        System.out.println("|--------------------------------------------------------------------|");
        System.out.printf("| %-20s | %-20s | %-20s |\n", Nome, Autor, Preco);
        System.out.println("|--------------------------------------------------------------------|");
        Collections.sort(lista);
        for (Livro l : lista) {
            System.out.printf("| %-20s | %-20s | %-20s |\n", l.getNome(), l.getAutor(), l.getPreco());
        }
        System.out.println("|--------------------------------------------------------------------|");
    }

    /**
     * Função: imprimir por Nome
     * 
     * @return Ira fazer uma listagem de todos os livros por Nome em ordem
     *         alfabética
     */
    public static void printPorNome(ArrayList<Livro> lista) {
        String Nome = "Nome ";
        String Autor = "Autor";
        String Preco = "Preço";
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("|-                        Listagem por nome                         -|");
        System.out.println("|--------------------------------------------------------------------|");
        System.out.printf("| %-20s | %-20s | %-20s |\n", Nome, Autor, Preco);
        System.out.println("|--------------------------------------------------------------------|");
        Collections.sort(lista, new LivroPorNome());
        for (Livro l : lista) {
            System.out.printf("| %-20s | %-20s | %-20s |\n", l.getNome(), l.getAutor(), l.getPreco());
        }
        System.out.println("|--------------------------------------------------------------------|");

    }

    /**
     * Função Consultar Livro
     *
     * @return função para puxar todos os atributos do livro pesquisado
     */
    public static void consultaLivro(ArrayList<Livro> lista) {
        int opt;
        try {
            opt = Saida.selecionarTipoConsulta();

            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
            System.out.println();
            System.out.println("Digite novamente a opção desejada");
            opt = Saida.selecionarTipoConsulta();
        }

        switch (opt) {

            case 1:
                System.out.print("Digite o nome do título a ser pesquisado: ");
                String consultaLivros = Entrada.obterStringTeclado();

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNome().equals(consultaLivros)) {
                        Saida.imprimirBusca(lista.get(i));
                    }
                }

                System.out.print(
                        "Este foi seu titulo pesquisado? Se não, tente conferir na Lista de Livros, se ele está registrado em nosso sistema! :)\n\n");

                break;
            case 2:
                System.out.print("Digite o autor do título a ser pesquisado: ");
                String consultaLivros2 = Entrada.obterStringTeclado();

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getAutor().equals(consultaLivros2)) {
                        Saida.imprimirBusca(lista.get(i));
                    }
                }

                System.out.print(
                        "Este foi seu autor pesquisado? Se não, tente conferir na Lista de Livros, se ele está registrado em nosso sistema! :)\n\n");

                break;
            case 3:

                System.out.print("Digite o gênero do título a ser pesquisado: ");
                String consultaLivros3 = Entrada.obterStringTeclado();

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getGenero().equals(consultaLivros3)) {
                        Saida.imprimirBusca(lista.get(i));
                    }
                }

                System.out.print(
                        "Este foi seu genero pesquisado? Se não, tente conferir na Lista de Livros, se ele está registrado em nosso sistema! :)\n\n");

                break;
        }
    }

    /**
     * Função: remover livro
     * 
     * @return Saida de texto para remover um livro
     */
    public static void removerLivro() {
        System.out.println("Informe o nome do livro que deseja remover");
        String Nome = Entrada.obterStringTeclado();
        int op = 0;
        if (Livraria.buscaPeloNome(Nome) != null) {
            try {
                System.out.println();
                System.out.println("Deseja remover o livro selecionado?");
                System.out.println();
                System.out.println("|----------------------------------------------|");
                System.out.println("|- Digite [1]      Se deseja remover o livro  -|");
                System.out.println("|- Digite [2]        Se deseja cancelar       -|");
                System.out.println("|----------------------------------------------|");
                System.out.println();
                op = Entrada.obterInteiroTeclado();
            } catch (InputMismatchException e) {
                System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
                System.out.println();
                System.out.println("Digite novamente a opção desejada");
                op = Entrada.obterInteiroTeclado();

            }
            if (op == 1) {
                Livraria.remover(Nome);
                System.out.println();
                System.out.println("Livro removido com sucesso!");
                System.out.println();

            } else {
                
                System.out.println("Remoção cancelada");
            }
        } else {
            System.out.println("Livro não encontrado no sistema");

        }

    }

    /**
     * Função: mudar preço
     * 
     * @return Saida de texto para modificar o preço de um livro
     */
    public static boolean mudarPreco(String Nome, double preco) {
        System.out.println("Informe o nome do livro");
        Nome = Entrada.obterStringTeclado();

        if (Livraria.buscaPeloNome(Nome) != null) {
            try {
                System.out.println();
                System.out.println("Informe o novo preço do livro");
                preco = Entrada.obterDoubleTeclado();

            } catch (InputMismatchException e) {
                System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
                System.out.println();
                System.out.println("Informe novamente o novo preço do livro");
                preco = Entrada.obterDoubleTeclado();
            }
            Livraria.setPreco(Nome, preco);
            System.out.println("Preço alterado com sucesso");
            return true;
        } else {
            System.out.println();
            System.out.println("Livro não encontrado no sistema");
            System.out.println();
            return false;
        }
    }
}