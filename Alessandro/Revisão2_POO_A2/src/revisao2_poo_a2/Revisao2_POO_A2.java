/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2_poo_a2;

import br.com.revisão2.poo.a2.Acessorios;
import br.com.revisão2.poo.a2.Marca;
import br.com.revisão2.poo.a2.Proprietario;
import br.com.revisão2.poo.a2.Veiculos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alessandro
 */
public class Revisao2_POO_A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 06 - 12 - 2017
        
        List<Acessorios> listaDosAcessorios = new ArrayList();
        Scanner leia = new Scanner(System.in);
        System.out.println("Acessorios");
        for (int i = 0; i < 4; i++) {
            Acessorios apertrechos = new Acessorios();
            apertrechos.setDescricao(leia.next());
            apertrechos.setCod(i + 1);
            listaDosAcessorios.add(apertrechos);
        }

        List<Veiculos> listaVeiculos = new ArrayList();
        String cadVeiculo = "s";
        while (cadVeiculo.equalsIgnoreCase("s")) {
            Veiculos automovel = new Veiculos();
            // OUTRA forma de Intancia
            automovel.setListaAcessorios(new ArrayList<Acessorios>());
            System.out.println("Marca do veiculo: ");
            Marca logotipo = new Marca();
            logotipo.setNome_marca(leia.next());
            automovel.setMarca(logotipo);

            System.out.println("Modelo do veiculo: ");
            automovel.setModelo(leia.next());
            System.out.println("Ano do veiculo: ");
            automovel.setAno(leia.nextInt());
            System.out.println("Placa do veiculo: ");
            automovel.setPlaca(leia.next());

            listaVeiculos.add(automovel);
            String con = "s";
            while (con.equalsIgnoreCase("s")) {

                System.out.println("Escolha o(s) acessorio(s) de seu carro");
                for (int j = 0; j < listaDosAcessorios.size(); j++) {
                    System.out.println(listaDosAcessorios.get(j).getCod() + " - "
                            + listaDosAcessorios.get(j).getDescricao());
                }
                int codigo = leia.nextInt();
                Acessorios a = getAcessoriosCodigo(codigo, listaDosAcessorios);
                automovel.getListaAcessorios().add(a);
                System.out.println("Mais acessorios? 's' ou 'n'?");
                con = leia.next();

            }
            System.out.println("Cadastrar mais carros? 's' ou 'n'?");
            cadVeiculo = leia.next();
        }

        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculos auto = listaVeiculos.get(i);
            auto.imprimirVeiculo();
        }

    }

    public static Acessorios getAcessoriosCodigo(int codigo,
            List<Acessorios> listAcessory) {
        for (int i = 0; i < listAcessory.size(); i++) {
            Acessorios atributo = listAcessory.get(i);
            if (codigo == atributo.getCod()) {
                return atributo;
            }
        }
        return null;
    }

    // 28 - 11 - 2017
    
    /*
     List<Proprietario> listaProprietarios = new ArrayList();
     Scanner leia = new Scanner(System.in);
        
     String listarProprietario = "s";
           
        
     while (listarProprietario.equalsIgnoreCase("s")) {            
     Proprietario dono = new Proprietario();
     System.out.println("Nome do(a) proprietario(a): ");
     dono.setNome(leia.next());
     System.out.println("Sexo do(a) proprietario(a): ");
     dono.setSexo(leia.next());
     System.out.println("CPF do(a) proprietario(a): ");
     dono.setCpf(leia.next());
            
     String listarVeiculo = "s";
            
     List<Veiculos> listaVeiculos = new ArrayList();
     dono.setListaVeiculos(listaVeiculos);
            
     while (listarVeiculo.equalsIgnoreCase("s")) {
     Veiculos automovel = new Veiculos();
                
     System.out.println("Marca do veiculo: ");
     Marca logotipo = new Marca();
     logotipo.setNome_marca(leia.next());
     automovel.setMarca(logotipo);

     System.out.println("Modelo do veiculo: ");
     automovel.setModelo(leia.next());
     System.out.println("Ano do veiculo: ");
     automovel.setAno(leia.nextInt());
     System.out.println("Placa do veiculo: ");
     automovel.setPlaca(leia.next());
                
     listaVeiculos.add(automovel);
                
     String listarAcessorio = "s";
                
     List<Acessorios> listaAcessorios = new ArrayList();
     automovel.setListaAcessorios(listaAcessorios);
                
     while (listarAcessorio.equalsIgnoreCase("s")) {
     Acessorios atributo = new Acessorios();                    
     System.out.println("Descricao do acessorio: ");
     atributo.setDescricao(leia.next());
                    
     listaAcessorios.add(atributo);
                    
     System.out.println("Este veiculo possui mais acessorios? "
     + "'s' ou 'n' ");
     listarAcessorio = leia.next();            
                    
     }
                
     System.out.println("Este(a) proprietario(a) possui mais "
     + "veiculos? 's' ou 'n' ");
     listarVeiculo = leia.next();                
            
     }
            
     listaProprietarios.add(dono);
     System.out.println("Mais proprietarios? 's' ou 'n' ");
     listarProprietario = leia.next();    
            
     }
        
           
     for (int i = 0; i < listaProprietarios.size() ; i++) {
     Proprietario possuidor = listaProprietarios.get(i);
     System.out.println("----------------Proprietario----------------");
     possuidor.imprimirProprietario();
     }
        
     }
     */
}
