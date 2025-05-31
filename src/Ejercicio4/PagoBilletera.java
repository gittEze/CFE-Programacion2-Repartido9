package Ejercicio4;

public class PagoBilletera extends MetodoDePago {

    private String email;

    public PagoBilletera(String nombre, String email) {
        super(nombre);
        this.email = email;
    }

    @Override
    void procesarPago(double monto) {
        System.out.println("Nombre: " + this.titular);
        System.out.println("Email: " + this.email);
        System.out.println("Monto: " + monto);
    }
}
