package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        EntradaGeneral g1 = new EntradaGeneral("E1299", 23);
        g1.mostrarInfo();
        g1.validarEntrada();

        System.out.println();

        EntradaGeneral g2 = new EntradaGeneral("E3811", 18);
        g2.mostrarInfo();
        g2.validarEntrada();

        System.out.println();

        EntradaVIP v1 = new EntradaVIP("R2812", 17);
        v1.mostrarInfo();
        v1.validarEntrada();

        System.out.println();

        EntradaVIP v2 = new EntradaVIP("R2123",23);
        v2.mostrarInfo();
        v2.validarEntrada();

    }
}
