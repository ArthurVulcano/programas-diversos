package Lista_ead;

import java.util.Scanner;

public class ExibicaoDeNomes {
     public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        Exibicao_de_nomes.Nomes n = new Exibicao_de_nomes.Nomes();
        System.out.println("Digite 5 nomes de qualquer cidade que desejar!");

        n.preenc(sm);
        n.mostrar();
        sm.close();
    }


}
