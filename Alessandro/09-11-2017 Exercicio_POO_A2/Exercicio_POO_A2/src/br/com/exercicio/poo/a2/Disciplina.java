/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio.poo.a2;

/**
 *
 * @author Alessandro e Willy
 */
public class Disciplina {
    private String nome_Disciplina;
    private int cargaHoraria_Disciplina;
       
    public void setNome_Disciplina(String nome_Disciplina) {
        this.nome_Disciplina = nome_Disciplina;
    }
    
    public String getNome_Disciplina() {
        return nome_Disciplina;
    }
        
    public void setCargaHoraria_Disciplina(int cargaHoraria_Disciplina) {
        this.cargaHoraria_Disciplina = cargaHoraria_Disciplina;
    }
    
    public int getCargaHoraria_Disciplina() {
        return cargaHoraria_Disciplina;
    }
    
}
