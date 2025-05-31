package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(8);
        figuras[1] = new Rectangulo(11,7);

        for (Figura f : figuras) {
            f.calcularArea();
        }

    }
}
