package tdeum;

import java.util.Scanner;

public class Variaveis {
    //Questões 13 e 14.
    // OBS: nao consegui fazer o scanner do float funcionar, deixei em comentario.

    public static void main(String[] args) {

        String nome;
        int idade;
        int numerosorte;
        float endereco;
        int telefone;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();

        System.out.println("Digite seu numero da sorte: ");
        numerosorte = teclado.nextInt();

        /*System.out.println("Digite seu endereço: ");
        endereco = teclado.nextFloat(); */

        System.out.println("Digite seu telefone: ");
        telefone = teclado.nextInt();

        System.out.println("nome: " + nome);
        System.out.println("onde mora: ");
        System.out.println("idade: " + idade);
        System.out.println("Numero da sorte: " + numerosorte);
        System.out.println("Numero de telefone: " + (double) (telefone));

    }





}
