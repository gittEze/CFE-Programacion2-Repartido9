package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        PagoBilletera b1 = new PagoBilletera("Pablo","pablo1998@gmail.com");
        b1.procesarPago(6000);

        System.out.println();

        PagoTarjeta t1 = new PagoTarjeta("Javier","891277923991");
        t1.procesarPago(5050);

    }
}
