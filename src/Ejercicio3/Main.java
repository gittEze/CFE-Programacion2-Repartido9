package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto e1 = new EmpleadoTiempoCompleto(28500,5);

        e1.calcularSalario();
        e1.solicitarLicencia(5);
        e1.solicitarLicencia(6);
        e1.calcularHorasExtra(10);
        e1.tomarVacaciones(15);
    }
}
