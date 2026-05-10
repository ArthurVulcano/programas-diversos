package Lista_ead;

import java.util.Scanner;

public class MaiorEMenor {
    static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        Maior_e_menor.Operacc Mm = new Maior_e_menor.Operacc();
        System.out.println("Digite 12 numeros");
        Mm.receb(sm);
        Mm.calcu();
        sm.close();
    }
}
