package tdeum;

import java.util.Scanner;
// Questões 15 à 18
//OBS: não entendi como implementar a questão 18.

public class Frase {
    public static void main(String[] args) {

        String frase;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();


        System.out.println(frase + " - Exemplo String");
        System.out.println("Sua frase possui " + frase.length() + " caracteres.");
    }
}
