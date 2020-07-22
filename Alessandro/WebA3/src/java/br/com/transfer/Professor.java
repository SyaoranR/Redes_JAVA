/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.transfer;

/**
 *
 * @author Labredes
 */
public class Professor {
    private int id_prof;
    private String nome;
    private float vl_hora_aula;

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVl_hora_aula() {
        return vl_hora_aula;
    }

    public void setVl_hora_aula(float vl_hora_aula) {
        this.vl_hora_aula = vl_hora_aula;
    }
    
}
