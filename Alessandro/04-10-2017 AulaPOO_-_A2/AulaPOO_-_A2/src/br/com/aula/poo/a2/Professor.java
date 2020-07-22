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
public class Professor extends Pessoa {
    private int cargaHorariaMensal;
    private float valorHora;
    
    public void setCargaHorariaMensal (int cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }
    
    public int getCargaHorariaMensal () {
        return this.cargaHorariaMensal;
    }
    
    public void setValorHora (float valorHora) {
        this.valorHora = valorHora;
    }
    
    public float getValorHora () {
        return this.valorHora;
    }

    public float Salario () {
        return getValorHora() * getCargaHorariaMensal();
    }
    
    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods,
        // choose Tools | Templates.
        System.out.println("Carga Horaria do Professor: " + 
                this.cargaHorariaMensal);
        System.out.println("Valor por hora do Professor: " + this.valorHora);
        /* Essse ou o de baixo
        System.out.println("Salario Mensal: " + 
                (getValorHora() * getCargaHorariaMensal()));
        */
        System.out.println("Salario Mensal: " + Salario());
    }
    
    
}
