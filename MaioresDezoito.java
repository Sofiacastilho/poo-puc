package tdeum;

import java.util.Scanner;

public class MaioresDezoito {

    public static void main(String[] args) {

        int idade;
        int maiorm = 0;
        int maiorf = 0;
        int contm = 0;
        int contf = 0;
        Scanner teclado = new Scanner(System.in);

        for (contm = 0; contm<10; contm ++){
            System.out.println("Digite sua idade (homem): ");
            idade = teclado.nextInt();
            
                    if (idade >=18){
                        maiorm ++;
                    }

        }
        System.out.println(maiorm + " homens são maiores de idade.");

        for (contf = 0; contf<10; contf ++){
            System.out.println("Digite sua idade (mulher): ");
            idade = teclado.nextInt();

            if (idade >=18){
                maiorf ++;
            }

        }
        System.out.println(maiorf + " mulheres são maiores de idade.");

    }
}
