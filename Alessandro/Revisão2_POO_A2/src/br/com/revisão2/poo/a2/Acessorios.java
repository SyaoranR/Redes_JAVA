/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revisão2.poo.a2;

/**
 *
 * @author Alessandro
 */
public class Acessorios {
    private String descricao;
    private int cod;
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao () {
        return this.descricao;
    }
    
    public void setCod (int codigo) {
        this.cod = codigo;
    }
    
    public int getCod () {
        return this.cod;
    }
    
}
