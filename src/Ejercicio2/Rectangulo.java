package Ejercicio2;

public class Rectangulo implements Figura{

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        double area = this.ancho * this.alto;
        System.out.println("El area del rectangulo es: " + area);
    }

}
