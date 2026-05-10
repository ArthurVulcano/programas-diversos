package Lista_ead;

import java.util.Scanner;

public class ContadorDePares {
 public static void main(String[] args) {
     Scanner sm = new Scanner(System.in);
     Contador_de_pares.operac oper = new Contador_de_pares.operac();
     System.out.println("Olá! Digite 15 numeros quaisquer e eu direi quais são pares.");
     oper.preenc(sm);
     oper.mostra();
     sm.close();


    }
}
