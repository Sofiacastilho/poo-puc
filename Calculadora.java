package tdeum;

import java.util.Scanner;
//Questões 19 à 23

public class Calculadora {

    public static void main(String[] args) {

        int valorA; // valor ref a divisão
        int valorB; // valor ref a divisão
        int valorC; // valor ref a <15 e >100
        float valorD; // valor ref ao ponto flutuante
        int valorE; // valor ref à multiplicação de int por double
        double valorF; // valor ref à multiplicação de int por double
        int divisao; // variavel ref a divisão
        int multiplicação;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        valorA = teclado.nextInt();

        System.out.println("Digite o valor de B: ");
        valorB = teclado.nextInt();

        divisao = valorA / valorB;
        System.out.println("Valor da divisao: " + divisao);

        System.out.println("Digite o valor de C: ");
        valorC = teclado.nextInt();

        if (valorC <15 || valorC>100) {
            System.out.println("Valor menor que 15 ou maior que 100.");
        }
        else {
            System.out.println("Valor entre 15 e 100.");
        }


        System.out.println("Digite o valor flutuante de D: ");
        valorD = teclado.nextFloat();

        if (valorD>1.99 && valorD<5.99){
            System.out.println("Valor entre 1.99 e 5.99");
        }
        else { System.out.println("Valor fora dos paramentros");
        }

        if (valorC == valorD) {
            System.out.println("Valores iguais de C e D.");
        }
        else {
            System.out.println("Valores diferentes de C e D");
        }

        System.out.println("Digite o valor de E: ");
        valorE = teclado.nextInt();

        System.out.println("Digite o valor de F: ");
        valorF = teclado.nextDouble();

        multiplicação = (int) (valorE * valorF);

        System.out.println("Multiplicação de E por F deu: " + multiplicação);
    }
}
