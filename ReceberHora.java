package tdeum;

import java.util.Scanner;

public class ReceberHora {
    public static void main(String[] args) {

       float valor_por_hora = 10.25F;
       float horas_de_trabalho;
       float quanto_recebe;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas você trabalhou?");
        horas_de_trabalho = teclado.nextFloat();

        quanto_recebe = horas_de_trabalho * valor_por_hora;

        if (quanto_recebe < 50){
            System.out.println("Atenção, dirija-se à direção do hotel.");
        }

        System.out.println("Receberá R$" + (int) quanto_recebe);


    }
}
