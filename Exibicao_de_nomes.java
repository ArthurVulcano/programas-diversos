package Lista_ead;

import java.util.Scanner;

public class Exibicao_de_nomes {


public static class Nomes{
        String[] vet = new String[5];
        public void preenc(Scanner sm){



        for (int i = 0; i < vet.length; i++) {
            vet[i] = sm.nextLine();

        }
        sm.close();
    }
    public void mostrar(){
        System.out.println("Cidades digitadas: ");
        for (String nome : vet) {
            System.out.println(nome);
        }
    }
}
    public static void main(String[] args) {
    Nomes n = new Nomes();
    n.mostrar();









    }
}
