package tdeum;

import java.util.Scanner;

public class AreaTrapezio {

    public static void main(String[] args) {

        int H;
        int b;
        int B;
        int area;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da altura:");
        H = teclado.nextInt();

        System.out.println("Digite o valor da base menor:");
        b = teclado.nextInt();

        System.out.println("Digite o valor da base maior:");
        B = teclado.nextInt();


        area= ( H * (b + B)) / 2;

        System.out.println("A área do trapezio sera de: "+ area);



    }
}
