package Lista_ead;

import java.util.Scanner;

public class Maior_e_menor {
    public static class Operacc {
        int[] vet = new int[12];

        public void receb(Scanner sm) {
            for (int i = 0; i < vet.length; i++) {
                vet[i] = sm.nextInt();

            }
            sm.close();
        }



                public void calcu(){
                    int maior = Integer.MIN_VALUE;
                    int menor = Integer.MAX_VALUE;
                    for (int i : vet) {
                        if (maior < i) maior = i;
                        if (menor > i) menor = i;
                    }


                    System.out.println("O maior numero é:" + maior);
                    System.out.println("O menor numero é:" + menor);


        }

    }

        static void main(String[] args) {
            Operacc oper = new Operacc();
            oper.calcu();


    }
}