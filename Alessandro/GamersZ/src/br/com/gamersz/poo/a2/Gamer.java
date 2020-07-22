/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gamersz.poo.a2;

import java.util.List;

/**
 *
 * @author Aluno
 */
public class Gamer {
    private String nome;
    private int idade;
    private int habilidade;
    private List<Game> listaGames;
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public void setHabilidade (int habilidade) {
        this.habilidade = habilidade;
    }
    
    public int getHabilidade () {
        return this.habilidade;
    }
    
    public void setListaGames (List<Game> games) {
        this.listaGames = games;
    }
    
    public List<Game> getListaGames () {
        return this.listaGames;
    }
        
    public void pegarDados () {
        System.out.println("------------------- + Gamer + -------------------");
        System.out.println("Nome do(a) gamer: " + this.nome);
        System.out.println("Idade do(a) gamer: " + this.idade);
        System.out.println("Habilidade do(a) gamer: " + this.habilidade);
        for (int i = 0; i < listaGames.size(); i++) {
            Game games = listaGames.get(i);
            games.imprimirGame(); // chamando o metodo da classe Game
        }
    }    
}
