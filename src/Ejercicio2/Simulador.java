package Ejercicio2;

public class Simulador {
    Red crearRed(){
        Red red = new Red();
        red.agregarDispositivo(new Router("R1"));
        red.agregarDispositivo(new Router("R2"));;
        return red;
    }
    public void identificarCuellosDeBotella(){
        System.out.println("Identificando cuellos de botella...");
        //Supongamos que hay un cuello de botella en R1
        System.out.println("Cuello de botella identificado: R1");
    }
    public static void main(String[]args){
        Simulador simulador = new Simulador();
        Red red = simulador.crearRed();
        red.mostrarDispositivos();
        simulador.identificarCuellosDeBotella();
    }
}

