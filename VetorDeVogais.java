package Lista_ead;

import java.util.Scanner;

public class VetorDeVogais {
    static void main(String[] args) {
        vetor_De_Vogais.ope gorguts = new vetor_De_Vogais.ope();
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite 20 CARACTERES quaisquer e eu direi quantas vogais estão presentes.");
        gorguts.receb(sm);
        gorguts.powrslav();
        sm.close();

    }
}
