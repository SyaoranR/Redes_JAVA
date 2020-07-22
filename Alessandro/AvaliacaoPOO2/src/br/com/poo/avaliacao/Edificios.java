package br.com.poo.avaliacao;

import java.util.List;

// Authors Alessandro e Augusto

public class Edificios {
    private String nome;
    private List<Apartamentos> lista_de_apartamentos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Apartamentos> getLista_de_apartamentos() {
        return lista_de_apartamentos;
    }
    public void setLista_de_apartamentos(List<Apartamentos> lista_de_apartamentos) {
        this.lista_de_apartamentos = lista_de_apartamentos;
    }
    
    public int Qtd_apartamentos () {
        return lista_de_apartamentos.size();
    }
    
    public void DadosEdifi() {
        System.out.println("-------------------Edificio---------------------");
        System.out.println("Nome do edificio: " + this.nome);
        
        for (int i = 0; i < lista_de_apartamentos.size(); i++) {
            Apartamentos apt = lista_de_apartamentos.get(i);
            apt.DadosApt();
        }
        
        System.out.println("Quantidade de apartamentos: " + 
                    Qtd_apartamentos());
    
    }
    
}
