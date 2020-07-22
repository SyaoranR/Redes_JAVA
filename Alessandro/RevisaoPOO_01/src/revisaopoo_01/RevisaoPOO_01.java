/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaopoo_01;

import br.com.revisao.poo.a2.Dependentes;
import br.com.revisao.poo.a2.Gerente;
import br.com.revisao.poo.a2.Parentesco;
import java.util.Scanner;

/**
 *
 * @author Alessandro
 */
public class RevisaoPOO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dados_Gerente();
    }
    
    public static void Dados_Gerente () {
        Scanner sc = new Scanner(System.in);
        Gerente lider = new Gerente();
        System.out.println("Informe o nome do funcionario gerente");
        lider.setNome(sc.next());
        System.out.println("Informe o CPF do funcionario gerente");
        lider.setCpf(sc.next());
        System.out.println("Informe o salario do funcionario gerente");
        lider.setSalario(sc.nextFloat());
        
        
        System.out.println("Informe a senha do funcionario gerente");
        lider.setSenha(sc.next());
        System.out.println("Informe o numero de funcionarios gerenciados");
        lider.setN_func_gerenciados(sc.nextInt());
        
        int n_dependentes;
        System.out.println("Informe o numero de dependentes");
        n_dependentes = sc.nextInt();
        
        Dependentes[] vetorDependentes = new Dependentes[n_dependentes];
        
        for (int i = 0; i < vetorDependentes.length; i++) {
            //Boletim desempenho = vetBoletim[i];
            Dependentes dependente = new Dependentes();
            System.out.println("Entre com o nome do dependente");
            dependente.setNome(sc.next());
            System.out.println("Entre com a idade do dependente");
            dependente.setIdade(sc.nextInt());
            
            System.out.println("Entre com o com o grau de parentesco");
            Parentesco parentesco = new Parentesco();
            parentesco.setGrau_Parentesco(sc.next());
            dependente.setParentesco(parentesco);
            
            vetorDependentes[i] = dependente; // para preencher o vetor
                      
        }
        
        lider.setDependentes(vetorDependentes); // linha necessaria para 
        //preencher os dependentes
        lider.imprimirDados();
        
    }
    
    
    
}
