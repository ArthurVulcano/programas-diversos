package Lista_ead;

import java.util.Scanner;

public class Contador_de_pares {


    public static class operac{
        Integer[] vet = new Integer[15];
        public void preenc(Scanner sm){
            for (int i = 0; i < vet.length; i++) {
                vet[i] = sm.nextInt();
            }
            sm.close();
            }
            public void mostra() {
                int cont = 0;
                for (int num : vet) {
                    if (num % 2 == 0) cont++;


                }
                System.out.println("A quantidade de numeros pares no vetor é de: " + cont);
            }

        static void main(String[] args) {
            operac ope = new operac();
            ope.mostra();

        }






    }
}
