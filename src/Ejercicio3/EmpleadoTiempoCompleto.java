package Ejercicio3;

public class EmpleadoTiempoCompleto implements Empleado, TrabajadorExtra {

    private double salarioBase;
    private int licenciaPendiente;

    public EmpleadoTiempoCompleto(double salario, int licencia){
        this.salarioBase = salario;
        this.licenciaPendiente = licencia;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario base es de $" + this.salarioBase);
    }

    @Override
    public void solicitarLicencia(int dias) {
        if ((this.licenciaPendiente + dias) <= 10){
            System.out.println("La solicitud de " + (this.licenciaPendiente+dias) + " dias de licencia fue aprobada.");
        } else {
            System.out.println("La solicitud de " + (this.licenciaPendiente+dias) + " dias de licencia ha sido denegada.");
        }
    }

    @Override
    public void calcularHorasExtra(int horas) {
        double salarioExtra = ((this.salarioBase/160) * horas * 1.5);
        double salarioTotal = salarioExtra + this.salarioBase;
        System.out.println("El salario extra es de $" + salarioExtra + " y el salario total es de $" + salarioTotal);
    }

    @Override
    public void tomarVacaciones(int dias) {
        System.out.println("El empleado ha tomado " + dias + " dias de vacaciones.");
    }
}
