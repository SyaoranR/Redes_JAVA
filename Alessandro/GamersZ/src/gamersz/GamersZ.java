/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamersz;

import br.com.gamersz.poo.a2.Categoria;
import br.com.gamersz.poo.a2.Console;
import br.com.gamersz.poo.a2.Game;
import br.com.gamersz.poo.a2.Gamer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class GamersZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Gamer> listaGamers = new ArrayList(); 
        // aloca uma lista na memoria
        
        Scanner leia = new Scanner(System.in);
        
        String listarGamers = "s";
        
        while (listarGamers.equalsIgnoreCase("s")) {
            Gamer jogador = new Gamer();
            
            System.out.println("Entre/Informe");
            System.out.println("Nome do(a) gamer: ");
            jogador.setNome(leia.next());
            System.out.println("Idade do(a) gamer: ");
            jogador.setIdade(leia.nextInt());
            System.out.println("Habilidade do(a) gamer: ");
            jogador.setHabilidade(leia.nextInt());
            
            String listarGames = "s";
            List<Game> listaGames = new ArrayList();
            jogador.setListaGames(listaGames); // preencher a lista
            
            while (listarGames.equalsIgnoreCase("s")) {
                Game jogo = new Game();
                
                System.out.println("Entre/Informe");
                System.out.println("Nome do game: ");
                jogo.setNomeDoGame(leia.next());
                System.out.println("Dificuldade do game: ");
                jogo.setDificuldade(leia.nextInt());
                
                System.out.println("Categoria do game: ");
                Categoria estilo = new Categoria();
                estilo.setCategoria(leia.next()); 
                jogo.setCategoria(estilo); 
                // "traduz" o tipo "Categoria" para uma String
                
                System.out.println("Console do game: ");
                Console plataforma = new Console();
                plataforma.setNomeDoConsole(leia.next()); 
                jogo.setConsole(plataforma); 
                // "traduz" o tipo "Console" para uma String
                
                listaGames.add(jogo); // adiciona o jogo na lista
                
                System.out.println("Este Gamer possui mais jogos? 's' ou 'n'");
                listarGames = leia.next();
            }
            
            listaGamers.add(jogador); // adiciona o jogador na lista
            System.out.println("Mais gamers para listar? 's' ou 'n'");
            listarGamers = leia.next();
            
        }
        
        // vai ser imprimido ate o fim da lista
        for (int i = 0; i < listaGamers.size() ; i++) {
            Gamer player = listaGamers.get(i);
            System.out.println("--------------------Gamer--------------------");
            player.pegarDados();
        }
                
    }
    
}
