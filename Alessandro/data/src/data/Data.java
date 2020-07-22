package data;

import java.util.Scanner;

public class Data {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String sexo;
        System.out.println("Digite o sexo");
        sexo = leia.next();
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Feminino");

        }
    }
}
