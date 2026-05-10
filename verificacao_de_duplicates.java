package Lista_ead;

import java.util.Scanner;

public class verificacao_de_duplicates {
    public static class oper {
        int[] vet = {12, 47, 83, 19, 56, 12, 91, 34, 7, 68, 60,
                25, 47, 80, 3, 59, 22, 91, 44, 16, 73, 5, 38,
                71, 8, 56, 33, 20, 68, 11, 95, 41, 2, 77, 24,
                59, 88, 6, 35, 47, 18, 72, 9, 64, 30, 83, 15,
                52, 91, 4, 39, 56, 21, 68, 10, 47, 60, 27, 14,};
        boolean igual = false;
        int cont = 0;

        public void carcass(Scanner sm) {
            int valor = sm.nextInt();
            cont = 0;
            for (int j = 0; j < vet.length; j++) {
                if (valor == vet[j]) {
                    cont++;


                }
            }
            sm.close();
        }


        public void most() {


            if (cont > 1) {
                System.out.println("O seu numero aparece no vetor: " + cont + " vezes");
            } else {
                System.out.println("Nenhum numero se repete!");
            }

        }


        static void main(String[] args) {
            verificacao_de_duplicates.oper leprosy = new verificacao_de_duplicates.oper();
            leprosy.most();
        }


    }
}


