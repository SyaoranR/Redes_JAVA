package br.com.poo.avaliacao;

// Authors Alessandro e Augusto

import java.util.List;

public class Condominio {
    private String nome;
    private List <Edificios> lista_de_bloco;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List <Edificios> getLista_de_bloco() {
        return lista_de_bloco;
    }
    public void setLista_de_bloco(List <Edificios> lista_de_bloco) {
        this.lista_de_bloco = lista_de_bloco;
    }
    
    public int Qtd_edificios () {
        return lista_de_bloco.size();
    }
    
    public void DadosCondominio() {
        System.out.println("-------------------Condominio-------------------");
        System.out.println("Nome do Condominio: " + this.nome);
        
        for (int i = 0; i < lista_de_bloco.size(); i++) {
            Edificios edifi = lista_de_bloco.get(i);
            edifi.DadosEdifi();
        }
        System.out.println("Quantidade de edificios: " + Qtd_edificios());
    }
}
