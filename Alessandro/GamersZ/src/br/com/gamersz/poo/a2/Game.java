/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gamersz.poo.a2;

/**
 *
 * @author Aluno
 */
public class Game {
    private String nomeDoGame;
    private int dificuldade;
    private Categoria categoria; // variavel do tipo Categoria (classe Categoria)
    private Console console; // variavel do tipo Console (classe Console)
    
    
   public void setNomeDoGame (String nomeDoGame) {
       this.nomeDoGame = nomeDoGame;
   }
   
   public String getNomeDoGame () {
       return this.nomeDoGame;
   }
   
   public void setDificuldade (int dificuldade) {
       this.dificuldade = dificuldade;
   }
   
   public int getDificuldade () {
       return this.dificuldade;
   }
   
   public void setCategoria (Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Categoria getCategoria () {
        return this.categoria;
    }
   
   public void setConsole (Console console) {
       this.console = console;
   }
   
   public Console getConsole () {
       return this.console;
   }
   
   public void imprimirGame() {
       System.out.println("-----------------------Game-----------------------");
       System.out.println("Nome do game: " + this.nomeDoGame);
       System.out.println("Dificuldade do game: " + this.dificuldade);
       System.out.println("Categoria do game: " + 
               this.categoria.getCategoria()); 
        // "pegar a String" na classe Categoria      
       System.out.println("Console do game: " + 
               this.console.getNomeDoConsole()); 
        // "pegar a String" na classe Console      
   }
}
