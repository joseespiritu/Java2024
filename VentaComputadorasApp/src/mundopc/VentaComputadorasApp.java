package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        // Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        // System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        // System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        // System.out.println(monitorLenovo);

        //Creamos un objeto de tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        // System.out.println(computadoraLenovo);

        // Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell =
                new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        // Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        System.out.println();
        orden1.mostrarOrden();

        // Computadora Mac
        Monitor monitorMac = new Monitor("Apple", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Apple");
        Raton ratonMac = new Raton("bluetooth", "Apple");
        Computadora computadoraIMac =
                new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}