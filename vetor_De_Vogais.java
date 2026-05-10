package Lista_ead;

import java.util.Scanner;

public class vetor_De_Vogais {
    public static class ope {
        char[] vet = new char[20];
        int cont = 0;



        public void receb(Scanner sm) {
            for (int i = 0; i < vet.length; i++) {
                vet[i] = sm.next().charAt(0);


            }
            sm.close();
        }


        public void powrslav() {
            for (char vog : vet) {
                if (vog == 'a'
                        || vog == 'e'
                        || vog == 'i'
                        || vog == 'o'
                        || vog == 'u') {
                    cont++;
                }
            }
            System.out.println("A quantidade de vogais digitadas foram: " + cont);
        }
    }

    static void main(String[] args) {
        vetor_De_Vogais.ope ope = new vetor_De_Vogais.ope();
        ope.powrslav();
    }
}




