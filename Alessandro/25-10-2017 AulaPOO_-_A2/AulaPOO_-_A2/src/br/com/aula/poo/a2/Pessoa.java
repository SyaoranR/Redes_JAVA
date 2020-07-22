/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.poo.a2;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
    
    /*
    public String getSexo () {
        return this.sexo;
    }
    */
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public String getSexo() {
        if (this.sexo.equalsIgnoreCase("M")) {
            return "Masculino";
        } else {
            return "Feminino";
        }
    }
    
    public String Voto () {
        if (this.idade < 18) {
            return "voto nao obrigatorio";
        } else {
            return "voto obrigatorio";
        }
    }
    
    public void imprimirDados () {
        System.out.println("--------------Dados Informados--------------");
        System.out.println("Nome: " + this.nome);
        // System.out.println("Sexo: " + this.sexo); nao usado
        System.out.println("Sexo: " + getSexo()); // usar este
        System.out.println("Idade: " + this.idade + " e possui " + Voto());
    }

}
