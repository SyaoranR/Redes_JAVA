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
public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;
    private Dependentes[] dependentes;
    private int menores = 0; // conta os dependentes com menos de 18 anos
        
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setSalario (float salario) {
        this.salario = salario;
    }
    
    public float getSalario() {
        return this.salario;
    }
    
    public void setDependentes (Dependentes[] dependentes) {
        this.dependentes = dependentes;
    }
    
    public Dependentes[] getDependentes() {
        return this.dependentes;
    }
        
    public void setMenores (int menores) {
        this.menores = menores;
    }
    
    public int getMenores() {
        return this.menores;
    }
    
    public float Bonus () {
        return (this.menores * 112.00f); 
    }
    
    public void imprimirDados () {
        System.out.println("----//----//----Dados Informados----//----//----");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario + "0");
        for (int i = 0; i < getDependentes().length; i++) {
            Dependentes dependente = getDependentes()[i];
            if (getDependentes()[i].getIdade() < 18) {
                this.menores++;
            }
        } 
        
        /*
        for (int i = 0; i < getDependentes().length; i++) {
            Dependentes dependente = getDependentes()[i];
            dependente.imprimirDados(); nao e aqui nessa classe o print
        }
        */
        
    }
    
}
