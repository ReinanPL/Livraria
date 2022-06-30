package Projeto.java.Models;

public class Manga extends Livro  {
    // atributos
    private boolean PaginaPretoBranco;
    private boolean LerTrasPraFrente;

    // construtor
    public Manga(String nome, String genero, String autor, int paginas, double preco, boolean paginaPretoBranco,
            boolean lerTrasPraFrente) {
        super(nome, genero, autor, paginas, preco);
        PaginaPretoBranco = paginaPretoBranco;
        LerTrasPraFrente = lerTrasPraFrente;
    }
    public Manga(String nome ){
        super(nome);
    }

    // getters & setters
    public boolean getPaginaPretoBranco() {
        return PaginaPretoBranco;
    }

    public void setPaginaPretoBranco(boolean paginaPretoBranco) {
        PaginaPretoBranco = paginaPretoBranco;
    }

    public boolean getLerTrasPraFrente() {
        return LerTrasPraFrente;
    }

    public void setLerTrasPraFrente(boolean lerTrasPraFrente) {
        LerTrasPraFrente = lerTrasPraFrente;
    }

}
