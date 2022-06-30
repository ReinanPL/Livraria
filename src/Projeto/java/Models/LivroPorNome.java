package Projeto.java.Models;

import java.util.Comparator;

public class LivroPorNome implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
    Livro a1 = (Livro) o1;
    Livro a2 = (Livro)o2;

    return a1.getNome().compareTo(a2.getNome());
    }


}