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
public class Gerente extends Funcionario {
    private String senha;
    private int n_func_gerenciados;
    
    // criado so para fins de acesso da variavel idade
    private Dependentes dependente; 
    // criado so para fins de acesso da variavel idade
    
    public void setSenha (String senha) {
        this.senha = senha;
    }
    
    public String getSenha () {
        return this.senha;
    }
    
    public void setN_func_gerenciados (int n_func_gerenciados) {
        this.n_func_gerenciados = n_func_gerenciados;
    }
    
    public int getN_func_gerenciados () {
        return this.n_func_gerenciados;
    }
           
    public float TotalSalario () {
        return this.getSalario() + this.Bonus();
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, 
        //choose Tools | Templates.
        System.out.println("Bonus: " + this.Bonus() + "0");
        System.out.println("Total recebimento: " + TotalSalario() + "0");
        System.out.println("Senha: " + this.senha);
        System.out.println("Numero de funcionarios: " + 
                this.n_func_gerenciados); 
        
        
        for (int i = 0; i < getDependentes().length; i++) {
            Dependentes dependente = getDependentes()[i];
            dependente.imprimirDados(); 
        }
        
    }
    
    
    
}
