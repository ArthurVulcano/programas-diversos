package Lista_ead;

import java.util.Scanner;

public class MediaAritmetica {
    static void main(String[] args) {
        Media_aritmetica.ope ope = new Media_aritmetica.ope();
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite 10 numeros! ;)");
        ope.receb(sm);
        ope.morbid();
        sm.close();
    }
}
