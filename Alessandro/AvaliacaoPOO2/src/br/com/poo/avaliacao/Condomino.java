package br.com.poo.avaliacao;

// Authors Alessandro e Augusto

public class Condomino {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void DadosMorador() {
        System.out.println("Nome do Condomino no apartamento: " + 
                this.nome);
        System.out.println("Cpf do Condomino no apartamento: " + 
                this.cpf);             
    }
}
