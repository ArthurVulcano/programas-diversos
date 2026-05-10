package Lista_ead;

import java.util.Scanner;
    public class Soma_total {


        public static void main(String[] args) {
            somaTotal.ValorT valorT = new somaTotal.ValorT();

            Scanner sm = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("Digite o numero: " + (i + 1));
                int n = sm.nextInt();
                valorT.processar(n);


            }
            System.out.println("O valor total da soma é de:" + valorT.getSoma());
            sm.close();



        }
    }


