package Lista_ead;



public class somaTotal {

    public static class ValorT {

        private int soma = 0;

        public int processar(int n) {
            int resultado = n;
            soma += resultado;
            return resultado;
        }

        public int getSoma() {
            return soma;
        }
    }
}