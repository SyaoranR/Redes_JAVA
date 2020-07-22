/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.a2.labRedes.aulaPOO;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private String sexo;
    //private String nome, sexo;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public Pessoa (String nome) {
        this.nome = nome;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    public String getNome() {
        return this.nome;
    }
    
    /*
    public String getSexo() {
        return sexo;
    }
    */
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }  
    
    public String getSexo () {
        if (this.sexo.equalsIgnoreCase("M")) {
            return "Masculino";
        } else {
            return "Feminino";
        }
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }  
          
    public int getIdade() {
        return this.idade;
    }
    
    public String votoObrigatorio () {
        if(this.idade >= 18) {
            return "voto obrigatorio";
        } else {
            return "voto não obrigatório";
        }
    }
    
    public void imprimirDados (){
        System.out.println("Nome: " + this.nome);
        //System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + getSexo()); // para retornar Masculino
        //ou Feminino [observar o metodo getSexo()]
        System.out.println("Idade: " + this.idade + " anos e possui " + 
                votoObrigatorio());
    }
    
}