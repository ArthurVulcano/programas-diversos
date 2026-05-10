package Lista_ead;

import java.util.Scanner;

public class Media_aritmetica {
    public static class ope {
        double[] vet = new double[10];
        int cont = 0;
        int cont2 = 0;
        double media = 0;

        public void receb(Scanner sm) {
            double soma = 0;
            for (int i = 0; i < vet.length; i++) {
                vet[i] = sm.nextDouble();


                soma += vet[i];
                cont++;

            }

            media = soma / cont;
            for (double num : vet) {
                if (num > media) cont2++;
            }
            sm.close();

        }

        public void morbid() {
            System.out.println("===Numeros digitados:===");
            for (double num : vet) {
                System.out.println(num);
            }
            System.out.println("==Sua media é==:" + "\n" +media);
            System.out.println("Os numeros que estão acima da media são: " + cont2);
        }

        static void main(String[] args) {
            Media_aritmetica.ope media = new Media_aritmetica.ope();
            media.morbid();

        }
    }
}


