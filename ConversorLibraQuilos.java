package tdeum;

import java.util.Scanner;

public class ConversorLibraQuilos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int comando;

        System.out.println("Comando 1 para converter libra em quilos.");
        System.out.println("Comando 2 para converter quilos em libra.");
        comando = entrada.nextInt();

        if (comando == 1) {
            System.out.print("Informe o peso em libras: ");
            float libras = entrada.nextFloat();

            float quilos = (float) (libras * 0.454);

            System.out.println("O peso em quilos é: " + quilos);
        }

        if (comando == 2) {
            System.out.print("Informe o peso em quilos: ");
            float quilos = entrada.nextFloat();

            float libras = (float) ( quilos / 0.454);

            System.out.println("O peso em libras é: " + libras);
        }






    }

}
