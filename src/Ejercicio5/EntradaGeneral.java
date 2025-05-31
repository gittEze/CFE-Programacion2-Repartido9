package Ejercicio5;

public class EntradaGeneral extends Entrada {

    public EntradaGeneral(String numEntrada, int horaAcceso) {
        super(numEntrada, horaAcceso);
    }

    @Override
    void validarEntrada() {
        if (this.horaAcceso >= 10 && this.horaAcceso <= 22) {
            boolean validar = true;
            System.out.println("Acceso disponible.");
        } else {
            System.out.println("Acceso denegado. Solo habilitado de 10 HS a 22 HS.");
            boolean validar = false;
        }
    }

    @Override
    void mostrarInfo() {
        System.out.println("Entrada general");
    }
}
