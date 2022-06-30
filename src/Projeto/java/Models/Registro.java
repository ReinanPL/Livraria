package Projeto.java.Models;



public class Registro {
/**
     * Função Registrar Livro
     *
     * Adiciona os livros pré cadastrados ao arraylist
     */
    public static void addLivro() { // função para adicionar os livros cadastrados ao arraylist
        Livraria.lista.add(new Manga("Black Clover", "Acao", "Yuki Tabata", 276, 7.90, true, true));
        Livraria.lista.add(new Manga("One Piece", "Aventura", "Echiro Oda", 247, 10.99, true, true));
        Livraria.lista.add(new Manga("Beserker", "Drama", "Kentaro Miuro", 136, 14.99, true, true));
        Livraria.lista.add(new Manga("Chainsaw Man", "Terror", "Tatsuki Fujimoto", 149, 15.00, true, true));
        Livraria.lista.add(new Manga("Death Note", "Suspense", "Tsugumi Ohba", 192, 19.99, true, true));
        Livraria.lista.add(new Manga("Sword Art Online", "Romance", "Reki Kawahara", 132, 9.99, true, true));
        Livraria.lista.add(new Manga("Crayon Shin Chan", "Comedia", "Yoshito Usui", 74, 4.90, true, true));
    }

    /**
     * Função Registrar Livro
     * 
     * Adicionar livros novos ao arraylist
     */
    public static Livro registrarLivro() {// função para registrar o livro do usuário

        // variáveis
        Livro l;
        String nome;
        String genero;
        String autor;
        int paginas;
        double preco;
        int PretoBranco;
        int TrasPraFrente;

        // Pedir pela variável e ler o teclado
        System.out.println("Digite o nome do livro:");
        nome = Entrada.obterStringTeclado();
        System.out.println("Digite o gênero do livro:");
        genero = Entrada.obterStringTeclado();
        System.out.println("Digite o autor do livro:");
        autor = Entrada.obterStringTeclado();
        System.out.println("Digite o número de páginas do livro:");
        paginas = Entrada.obterInteiroTeclado();
        System.out.println("Digite o preço do livro: (ex: 00.00)");
        preco = Entrada.obterDoubleTeclado();
        System.out.println("O livro é preto e branco? Sim[1] ou Nao[2]");
        PretoBranco = Entrada.obterInteiroTeclado();
        lerBoolean(PretoBranco);
        System.out.println("O livro é lido de trás pra frente? Sim[1] ou Nao[2]");
        TrasPraFrente = Entrada.obterInteiroTeclado();
        lerBoolean(TrasPraFrente);

        System.out.println();
        l = new Manga(nome, genero, autor, paginas, preco, lerBoolean(PretoBranco), lerBoolean(TrasPraFrente));
        return l;
    }
    
  /**
     * Função ler boolean
     *
     * Função para ler um inteiro e trasformar em boolean
     */
    public static boolean lerBoolean(int resp) {

        if (resp == 1) {
            return true;
        }

        return false;

    }

}
