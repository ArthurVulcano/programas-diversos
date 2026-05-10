package Lista_ead;

import java.util.Scanner;

public class FiltroDeString {
    static void main(String[] args) {
        filtro_de_string.ope ope = new filtro_de_string.ope();
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite 10 palavras quaisquer!");
        ope.death(sm);
        ope.mostrar();
        sm.close();
    }
}
