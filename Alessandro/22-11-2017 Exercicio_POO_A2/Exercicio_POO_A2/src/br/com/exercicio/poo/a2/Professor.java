/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio.poo.a2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alessandro e Willy
 */
public class Professor {
    private String nome;
    private String sexo;
    private int idade;
    private int cargaHoraria;
    //private List<Disciplina> listaDisciplinas = new ArrayList();
    // ou private List<Disciplina> listaDisciplinas 
    // = new ArrayList<Disciplina>();
    private List<Disciplina> listaDisciplinas; // instanciando na principal
    private float valorHoraAula;
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo () {
        return this.sexo;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public void setCargaHoraria (int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria () {
        return this.cargaHoraria;
    }
    
    public void setListaDisciplinas (List<Disciplina> disciplinas) {
        this.listaDisciplinas = disciplinas;
    }
    
    public List<Disciplina> getListaDisciplinas () {
        return this.listaDisciplinas;
    }
    
    public void setValorHoraAula (float valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    
    public float getValorHoraAula () {
        return this.valorHoraAula;
    }
    
    public void imprimir () {
        System.out.println("Nome do(a) professor(a) : " + this.nome);
        System.out.println("Sexo do(a) professor(a) : " + this.sexo);
        System.out.println("Idade do(a) professor(a) : " + this.idade);
        System.out.println("Carga horaria do(a) professor(a) : " + 
                this.cargaHoraria);
        
        for (int i = 0; i < listaDisciplinas.size(); i++) {
            Disciplina disciplinas = listaDisciplinas.get(i);
            System.out.println("Nome da disciplina: " + 
                    disciplinas.getNome_Disciplina());
            System.out.println("Carga horaria: " + 
                    disciplinas.getCargaHoraria_Disciplina());
        }
        
        System.out.println("Valor por hora de aula do(a) professor(a) : " + 
                this.valorHoraAula);
    }
}
