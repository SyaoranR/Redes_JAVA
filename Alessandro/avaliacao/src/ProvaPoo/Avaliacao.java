package ProvaPoo;

import br.com.avaliacao.poo.Canais;
import br.com.avaliacao.poo.Eletrodomestico;
import br.com.avaliacao.poo.Tipo_tvs;
import br.com.avaliacao.poo.Tv;
import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Tipo_tvs descri = new Tipo_tvs();
        Scanner sc = new Scanner(System.in);               
        System.out.print("Tipo da TV: ");
        descri.setDescricao(sc.next());
        ////////////////////////////////////////////
        Tv tele = new Tv();
        tele.setTipo(descri);
        System.out.print("L para Ligado e D para desligado: "); 
        if (sc.next().equalsIgnoreCase("L")) {
            tele.setLigado(true);
        } else {
            tele.setLigado(false);
        }
        System.out.print("Voltagem da TV: ");
        tele.setVoltagem(sc.nextInt());
        System.out.print("Consumo: ");
        tele.setConsumo(sc.next());
        ////////////////////////////////////////////////
        
        System.out.print("Tamado da TV: ");
        tele.setTamanho(sc.nextInt());
        System.out.print("Preço da TV: ");
        tele.setValor(sc.nextFloat());
        
        
        if (tele.getTamanho()>32){
            tele.setDesconto((tele.getValor()*10)/100);
        }
        
        ////////////////////Vetor ///////////////////////////
        Canais[] canaises = new Canais[2];
        for (int i = 0; i < canaises.length; i++) {
            //Canais canaise = canaises[i];
            Canais canais = new Canais();
            System.out.print("Numero do canal: ");
            canais.setNumero(sc.nextFloat());
            System.out.print("Título: ");
            canais.setTitulo(sc.next());
            canaises[i]=canais;
        }
        System.out.println("======= Saída de Dados ============");
        System.out.println("");
        tele.setCanais(canaises);
        tele.imprimirDados();
        
    }
}
