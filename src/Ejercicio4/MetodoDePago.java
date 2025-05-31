package Ejercicio4;

public abstract class MetodoDePago {

    protected String titular;

    public MetodoDePago(String nombre) {
        this.titular = nombre;
    }

    abstract void procesarPago(double monto);
}
