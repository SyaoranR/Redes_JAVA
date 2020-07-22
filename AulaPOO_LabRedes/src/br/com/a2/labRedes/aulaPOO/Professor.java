/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.a2.labRedes.aulaPOO;

/**
 *
 * @author ALuno
 */
public class Professor extends Pessoa {
    private int cargaHoraria;
    private float valorHora;
    
    public void setCargaHoraria (int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria (){
        return this.cargaHoraria;
    }
    
    public void setValorHora (float valorHora) {
        this.valorHora = valorHora;
    }
    
    public float getValorHora (){
        return this.valorHora;
    }
    
    public float getSalario () {
        return this.cargaHoraria * this.valorHora;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, 
        //choose Tools | Templates.
        System.out.println("Carga Horaria do professor: " + this.cargaHoraria);
        System.out.println("Valor por Hora do professor: R$" + this.valorHora + "0");
        //System.out.println("Salario total do professor: R$" +
                //(this.cargaHoraria * this.valorHora) + "0");
        System.out.println("Salario do professor: R$" + getSalario() 
                + "0");
    }
    
    
    
}
