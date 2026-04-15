import java.util.Scanner;

public class classificacao_de_imc {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Deseja começar o programa ?");
        String okk = sm.next();
        while (okk.equals("sim")) {
            System.out.println("Digite seu peso");
            double p = sm.nextDouble();
            System.out.println("Digite sua altura");
            double a = sm.nextDouble();
            double oper = p / (a * a) ;
            String ope = (oper < 18.5) ? "Abaixo do peso ideal" :
                    ( oper < 25.0) ? "Peso normal" : ( oper < 29.9  ) ? "Sobrepeso" :
                            (oper < 34.9) ? "obesidade GRAU I" : (oper < 40.0 ) ?
                                    "Obesidade GRAU II" : "Obesidade grau III";
            System.out.println(ope);
            System.out.println("Deseja contiuar ?");
            okk = sm.next();
            if (!okk.equals("sim")) {
                System.out.println("Programa encerrado");


            }
            sm.close();
        }
    }
}
