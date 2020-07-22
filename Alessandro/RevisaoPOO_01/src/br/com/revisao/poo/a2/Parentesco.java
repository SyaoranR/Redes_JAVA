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
public class Parentesco {
    private String grau_Parentesco;
    
    public void setGrau_Parentesco (String grau_Parentesco) {
        this.grau_Parentesco = grau_Parentesco;
    }
    
    public String getGrau_Parentesco () {
        return this.grau_Parentesco;
    }
    
    public void imprimirDados () {
        System.out.println("Grau de parentesco: " + this.grau_Parentesco);
    }
    
}
