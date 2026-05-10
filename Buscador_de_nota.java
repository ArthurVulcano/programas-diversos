package Lista_ead;

import java.util.Scanner;

public class Buscador_de_nota {
    public static class mordor{
        double[] vet = new double[8];
        public void preencer(Scanner sm){
            for (int i = 0; i < vet.length; i++){
                vet[i] = sm.nextInt();
            }
            sm.close();

        }
        public void mostrar(){
            for (double num : vet){
                if (num < 5.0){
                    System.out.println("alerta! notas abaixo de 5.0");
                    break;
                }
            }

        }

        static void main(String[] args) {
            mordor mordor = new mordor();
            mordor.mostrar();
        }
    }

}
