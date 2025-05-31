package Ejercicio5;

public abstract class Entrada {

    protected String numEntrada;
    protected int horaAcceso;

    public Entrada (String numEntrada, int horaAcceso) {
        this.numEntrada = numEntrada;
        this.horaAcceso = horaAcceso;
    }

    abstract void validarEntrada();
    void mostrarInfo(){
        System.out.println("Numero de entrada: " + this.numEntrada);
        System.out.println("Hora de acceso: " + this.horaAcceso + " HS");
    }
}
