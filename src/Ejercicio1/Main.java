package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto(0);

        a1.arrancar();
        System.out.println();
        a1.acelerar(50);
        System.out.println();
        a1.acelerar(80);
        System.out.println();
        a1.frenar();

    }
}
