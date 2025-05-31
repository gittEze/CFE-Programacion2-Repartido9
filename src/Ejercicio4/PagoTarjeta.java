package Ejercicio4;

public class PagoTarjeta extends MetodoDePago {

    private String numeroTarjeta;

    public PagoTarjeta(String nombre, String numeroTarjeta) {
        super(nombre);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    void procesarPago(double monto) {
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero de tarjeta: " + this.numeroTarjeta);
        System.out.println("Monto: " + monto);
    }
}
