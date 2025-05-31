package Ejercicio2;

public class Circulo implements Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = 3.14 * (this.radio*this.radio);
        System.out.println("El area del circulo es: " + area);
    }
}
