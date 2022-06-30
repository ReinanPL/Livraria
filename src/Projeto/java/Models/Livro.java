package Projeto.java.Models;



public class Livro implements Comparable<Livro> {
    // ATRIBUTOS
    private String nome;
    private String genero;
    private String autor;
    private int paginas;
    private Double preco;

    /**
     * Construtor
     * @param nome
     * @param genero
     * @param autor
     * @param paginas
     * @param preco
     */
    public Livro(String nome, String genero, String autor, int paginas, Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.paginas = paginas;
        this.autor = autor;
        this.preco = preco;
    }
    
    public Livro(String nome) {
    this.nome = nome;
    }

    // GETTERS && SETTERS
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean equals(Object o) {	
		Livro outro = (Livro) o;
       return this.getNome().equals(outro.getNome());
	}
  
    public int compareTo(Livro outro){
        Livro outraLivro = (Livro)outro;
        return this.preco.compareTo(outraLivro.preco);
    }
    

    
    

    
    
    

}
