package Lista_ead;

public class Multiplicador_visual {
    public static class Morian {
        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        public void mostrar() {
            for (int num : vet) {
                System.out.println(num * 5);


            }

        }

        static void main(String[] args) {
            Morian morian = new Morian();
            morian.mostrar();
        }

    }
}