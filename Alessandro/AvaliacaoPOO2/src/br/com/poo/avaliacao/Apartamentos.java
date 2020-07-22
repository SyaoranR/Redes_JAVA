package br.com.poo.avaliacao;

// Authors Alessandro e Augusto

public class Apartamentos {
    private String descricao;
    private Condomino condomino;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Condomino getCondomino() {
        return condomino;
    }
    public void setCondomino(Condomino condomino) {
        this.condomino = condomino;
    }
    
    public void DadosApt() {
            System.out.println("-----------------Apartamento-----------------");
            System.out.println("Descricao do apartamento: " + this.descricao);
            condomino.DadosMorador();            
    }
}
