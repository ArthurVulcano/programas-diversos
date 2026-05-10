package Lista_ead;

import java.util.Scanner;

public class BuscadorDeNota {
    static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        Buscador_de_nota.mordor mordor = new Buscador_de_nota.mordor();
        System.out.println("Digite 8 notas quaisquer!");
        mordor.preencer(sm);
        mordor.mostrar();
        sm.close();
    }
}
