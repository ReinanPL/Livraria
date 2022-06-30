package Projeto.java;

import Projeto.java.Models.Livraria;
import Projeto.java.Models.Livro;
import Projeto.java.Models.Registro;
import Projeto.java.Models.Saida;



public class Principal {
    public static void main(String[] args) throws Exception {

        int op = 0;
        Livro l;   
        Registro.addLivro();

        Saida.sejaBemVindo();
        do { 
            op = Saida.menuPrincipal(); 
            switch (op) { 
                
                case 1:

                    l = Registro.registrarLivro();
                    Livraria.lista.add(l);
                    break;

                case 2:

                    Livraria.acessarListas();
                
                    break;

                case 3:

                    Saida.consultaLivro(Livraria.lista);
                    Saida.menuFinal();
                    break;

                
                case 4:
                    Saida.removerLivro();
                    Saida.menuFinal();
                    break;
                case 5:
                     Saida.mudarPreco(null,0);    
                     Saida.menuFinal();
                    break;

                case 0:

                    System.out.println("Sistema finalizado :)");

                    break;
            }
        } while (op != 0);
        System.exit(0);
    }
    
   
 
}
