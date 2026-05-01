package mninlista;

import java.util.Scanner;

public class simulador_de_crescimento_populacional_variavel {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo ;), deseja iniciar o programa?");
        String l = sm.next();
        if (l.equalsIgnoreCase("Sim")) {
            System.out.println("Esse programa executa um simulador de crecimento!");
            int cont = 1;
            double cB;
            double cA;
            do {
                System.out.println("digite seu ANO");
                int an = sm.nextInt();
                an = cont++;
                System.out.println("Digite uma taxa de crescimento que você desejar!");
                double n = sm.nextDouble();
                n = n / 100;
                cA = 50000;
                cB = 150000;
                double calc = n * cA;
                cA += calc;
                cB = cB * 1.5;
                if (calc - cB < 10000 || cont % 5 == 0)
                    System.out.println("Atenção: Cidades se aproximando em tamanho!");


            } while (cA < cB);
            System.out.println("Programa encerrado, a população da Cidade A ultrapassou a de B");
        }
        sm.close();
    }
}

