/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revisão2.poo.a2;

import java.util.List;

/**
 *
 * @author Alessandro
 */
public class Proprietario {
    private String nome;
    private String sexo;
    private String cpf;
    private List<Veiculos> listaVeiculos;
    
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
    
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf () {
        return this.cpf;
    }
    
    
    public void setListaVeiculos (List<Veiculos> veiculos) {
        this.listaVeiculos = veiculos;
    }
    
    public List<Veiculos> getListaVeiculos () {
        return this.listaVeiculos;
    }
    
    public void imprimirProprietario () {
        System.out.println("Nome do(a) proprietario(a): " + this.nome);
        System.out.println("Sexo do(a) proprietario(a): " + this.sexo);
        System.out.println("CPF do(a) proprietario(a): " + this.cpf);
        
        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculos automoveis = listaVeiculos.get(i);
            automoveis.imprimirVeiculo();            
        }
    
    }
}
