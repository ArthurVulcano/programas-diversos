package mninlista;

import java.util.Scanner;

public class calculadora_de_faturas_de_agua {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo! Gostaria de iniciar o programa? ;)");
        String l = sm.next();
        if (l.equalsIgnoreCase("Sim")) {
            int x;
            System.out.println("Esse programa somente funciona com o NUMERO DE METROS CUBICOS (m³)");
            do {

                System.out.println();
                System.out.println("Digite seu número");
                x = sm.nextInt();
                if (x == 0) {
                    break;
                }


                if ( x > 0 && x <= 15) {
                    System.out.println("O valor a ser pago será de:  R$ 35,00.");
                }
                else if (x > 15 && x <= 30 ) {
                    int cont = x - 15;
                    double total = 35.00 + (4.50 * cont);

                    System.out.printf("O valor a pagar será de: %.2f%n", total);

                } else {
                    System.out.println("O valor a pagar sera de:" + (35.00 + 7.00));
                }
                System.out.println();
                System.out.println("Digite zero(0) para encerrar");
            } while (true);
            System.out.println("Programa encerrado");


        }else System.out.println("programa não iniciado! Tchau ;)");
        sm.close();
    }

}
