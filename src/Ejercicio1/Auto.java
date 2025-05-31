package Ejercicio1;

public class Auto implements Vehiculo {

    private int velocidadActual;

    public Auto(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void arrancar() {
        System.out.println("El auto arranco");
    }

    @Override
    public void acelerar(int velocidad) {
        this.velocidadActual = velocidad;
        System.out.println("El auto acelero a " + this.velocidadActual + " km");
    }

    @Override
    public void frenar() {
        this.velocidadActual = 0;
        System.out.println("El auto freno");
        System.out.println("Velocidad actual: " + this.velocidadActual + " km");
    }

}
