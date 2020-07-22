/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revisao.poo.a2;

/**
 *
 * @author Alessandro
 */
public class Dependentes {
    private String nome;
    private int idade;
    private Parentesco parentesco;
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setParentesco (Parentesco parentesco) {
        this.parentesco = parentesco;
    }
    
    public Parentesco getParentesco() {
        return this.parentesco;
    }
    
    public void imprimirDados () { 
        System.out.println("-------------------------------------------------");
        System.out.println("Nome dependente: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Grau de parentesco: " + 
                this.parentesco.getGrau_Parentesco());
    }
    
}
