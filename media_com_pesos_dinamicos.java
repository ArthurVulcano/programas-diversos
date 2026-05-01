package mninlista;

import java.util.Scanner;

public class media_com_pesos_dinamicos {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Ola! deseja executar o programa?");
        String l = sm.next();
        if (l.equalsIgnoreCase("Sim")) {
            int x;
            do {
                System.out.println("Digite a primeira nota:");
                x = sm.nextInt();
                if (x < 0){
                    System.out.println("Programa encerrado, a primeira nota foi negativa!");
                    break;
                }
                System.out.println("Digite a segunda nota:");
                int x2 = sm.nextInt();

                System.out.println("Digite a terceira nota:");
                int x3 = sm.nextInt();

                int maior = x;
                int menor = x;
                int meio;

                if (x2 > maior) maior = x2;
                if (x3 > maior) maior = x3;
                if (x2 < menor) menor = x2;
                if (x3 < menor) menor = x3;
                meio = x + x2 + x3 - maior - menor;
                double media = ((double) maior * 5 + meio * 3 + menor * 2) / 10.0;
                if ((media >= 7 && menor >= 4)) {
                    System.out.println("Aprovado especial");

                } else {
                    System.out.println("Não se qualificou");
                }
            } while (x != 0);
        }else {
            System.out.println("O programa não foi iniciado! Tchau ;(" );
        }
        sm.close();
    }
}