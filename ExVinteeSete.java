package tdeum;

import java.util.Scanner;
// não consegui implementar a logica dos primos.
public class ExVinteeSete {
    public static void main(String[] args) {

        int numero;
        int primo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        if (numero %2 ==0){
            System.out.println("é par");
        }
        else {
            System.out.println("é impar");
        }






    }


}
