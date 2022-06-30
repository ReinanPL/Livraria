package Projeto.java.Models;
import java.util.*;

public class Entrada {
    public static Scanner input = new Scanner(System.in);

    /**
     * Função para ler o teclado
     * @return Retorna a um input Inteiro
     */
    public static int obterInteiroTeclado() { //
        input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * Função para ler o teclado
     * @return Retorna a um input String
     */
    public static String obterStringTeclado() {
        input = new Scanner(System.in);
        return input.nextLine();
    }
    /**
     * Função para ler o teclado
     * @return Retorna a um input Double
     */
    public static double obterDoubleTeclado() {
        input = new Scanner(System.in);
        return input.nextDouble();
    }
    
}
