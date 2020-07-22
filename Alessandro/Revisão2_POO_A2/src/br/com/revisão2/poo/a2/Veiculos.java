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
public class Veiculos {
    private Marca marca;
    private String modelo;
    private int ano;
    private String placa;
    private List<Acessorios> listaAcessorios;
    
    public void setMarca (Marca marca) {
        this.marca = marca;
    }
    
    public Marca getMarca () {
        return this.marca;
    }
    
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo () {
        return this.modelo;
    }
    
    
    public void setAno (int ano) {
        this.ano = ano;
    }
    
    public int getAno () {
        return this.ano;
    }
    
    
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    
    public String getPlaca () {
        return this.placa;
    }
    
    
    public void setListaAcessorios (List<Acessorios> acessorios) {
        this.listaAcessorios = acessorios;
    }
    
    public List<Acessorios> getListaAcessorios () {
        return this.listaAcessorios;
    }
    
    public void imprimirVeiculo(){
        System.out.println("---------------------Veiculo---------------------");
        System.out.println("Marca do veiculo: " + this.marca.getNome_marca());
        System.out.println("Modelo do veiculo: " + this.modelo);
        System.out.println("Ano do veiculo: " + this.ano);
        System.out.println("Placa do veiculo: " + this.placa);
        System.out.println("Codigo do Acessorio | Descricao do acessorio ");
        for (int i = 0; i < listaAcessorios.size(); i++) {
            Acessorios atributos = listaAcessorios.get(i);
            System.out.println(atributos.getCod() + " -) " + 
                    atributos.getDescricao());
           
        }
    }    
    
}
