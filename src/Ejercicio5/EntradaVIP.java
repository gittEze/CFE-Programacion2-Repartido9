package Ejercicio5;

public class EntradaVIP extends Entrada {

        public EntradaVIP(String numEntrada, int horaAcceso) {
            super(numEntrada, horaAcceso);
        }

        @Override
        void validarEntrada() {
            boolean validar = true;
            System.out.println("Acceso disponible.");
        }

        @Override
        void mostrarInfo() {
            System.out.println("Entrada VIP");
            super.mostrarInfo();
        }
}

