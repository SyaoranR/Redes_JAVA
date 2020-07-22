package avaliacaopoo2;

import br.com.poo.avaliacao.Apartamentos;
import br.com.poo.avaliacao.Condominio;
import br.com.poo.avaliacao.Condomino;
import br.com.poo.avaliacao.Edificios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Authors Alessandro e Augusto

public class AvaliacaoPOO2 {

    public static void main(String[] args) {
        
        List<Condominio> lista_de_condominio = new ArrayList();
        Scanner leia = new Scanner(System.in);
        System.out.println("");
        
        String cadCondominio = "s";
           
        
        while (cadCondominio.equalsIgnoreCase("s")) {            
            Condominio condominio = new Condominio();
            System.out.print("Nome do condominio: ");
            condominio.setNome(leia.next());

            String cadBloco = "s";

            List<Edificios> lista_de_edificios = new ArrayList();
            condominio.setLista_de_bloco(lista_de_edificios);
            
            while (cadBloco.equalsIgnoreCase("s")) {
                Edificios edificios = new Edificios();

                System.out.print("Nome do edificio: ");
                edificios.setNome(leia.next());
                
                lista_de_edificios.add(edificios);
                
                String cadApts = "s";
                
                List<Apartamentos> lista_de_apts = new ArrayList();
                edificios.setLista_de_apartamentos(lista_de_apts);
                
               
                                               
                while (cadApts.equalsIgnoreCase("s")) {
                    Apartamentos apts = new Apartamentos();                    
                    System.out.print("Descricao do apartamento: ");
                    apts.setDescricao(leia.next());
                    
                    lista_de_apts.add(apts);
                    
                    Condomino morador = new Condomino();
                    System.out.print("Nome do condomino: ");
                    morador.setNome(leia.next());
                                        
                    System.out.print("Cpf do condomino: ");
                    morador.setCpf(leia.next());
                    apts.setCondomino(morador);

                    System.out.print("Mais apartamentos? 's' ou 'n'? ");
                    cadApts = leia.next();            

                }

                System.out.print("Mais blocos? 's' ou 'n'? ");
                cadBloco = leia.next();                

            }

            lista_de_condominio.add(condominio);
            System.out.print("Mais condominios? 's' ou 'n' ");
            cadCondominio = leia.next();    

        }


        for (int i = 0; i < lista_de_condominio.size() ; i++) {
            Condominio cond = lista_de_condominio.get(i);
            //System.out.println("----------------Condominio----------------");
            cond.DadosCondominio();
        }
        
                
    }
    
}
