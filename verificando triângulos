
import java.util.Scanner;

public class tipo_de_triangulo {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("deseja começar o programa?");
        String ok = sm.next();
        while(ok.equals("sim")){
            System.out.println("Digite seu numero");
            int x = sm.nextInt();
            System.out.println("Digite seu numero");
            int x2 = sm.nextInt();
            System.out.println("Digite seu numero");
            int x3 = sm.nextInt();
            String tri = (x + x2 > x3) ? "Pode-se formar um triangulo"
                    : "";
            if ( (x + x2 < x3) ){
                System.out.println("Não pode-se formar um triangulo");
                break;
            }
            System.out.println(tri);
            System.out.println();
            String tip = x == x2 && x == x3 ? "Triangulo equilatero" :
                    x == x2 ? "Triangulo isosceles"
                            : "Triangulo escaleno";
            System.out.println(tip);
            System.out.println();
            System.out.println("Deseja contunuar o programa?");
            ok = sm.next();
            if(!ok.equals("sim")){
                System.out.println("Programa encerrado");
                sm.close();

            }
        }
    }
}
