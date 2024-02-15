package Ejercicio7;
import java.util.Scanner;
public class Aplicacion {
    public static void main(String[]args){
        GeneradorDeCitas generador = new GeneradorDeCitas();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Cita inspiradora del día: "+generador.obtenerCita());
            System.out.println("Teclee salir");
            String salida = sc.nextLine();
            if(salida.equals("salir")){
                break;
            }
        }
        sc.close();
    }
}
