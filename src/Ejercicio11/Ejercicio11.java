package Ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectángulo");
        int ancho = scanner.nextInt();
        System.out.println("Ingrese el alto del rectángulo");
        int alto = scanner.nextInt();
        System.out.println("Escribe el carácter/caracteres que se repetiran");
        String caracter = scanner.next();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }


    }
}