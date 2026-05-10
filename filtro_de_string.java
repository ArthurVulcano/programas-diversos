package Lista_ead;

import java.util.Arrays;
import java.util.Scanner;

public class filtro_de_string {
    public static class ope {
        String[] vet = new String[10];

        public void death(Scanner sm) {
            for (int i = 0; i < vet.length; i++) {
                vet[i] = sm.nextLine();


            }
            sm.close();

        }

        public void mostrar() {
            System.out.println("As palavras digitadas que possuem mais de 5 letras foram: ");
            for (String num : vet) {
                if (num.length() > 5) {
                    System.out.println(num);
                }

            }
        }
    }

    static void main(String[] args) {
        filtro_de_string.ope ope = new filtro_de_string.ope();
        ope.mostrar();
    }
}
