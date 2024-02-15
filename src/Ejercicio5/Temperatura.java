package Ejercicio5;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        int temperatura = scanner.nextInt();
        System.out.println("Ingrese la humedad");
        int humedad = scanner.nextInt();
        System.out.println("Ingrese la calidad del aire");
        int calidadAire = scanner.nextInt();
        Temperatura madrid = new Temperatura(temperatura, humedad, calidadAire);
        Temperatura barcelona = new Temperatura(temperatura, humedad, calidadAire);




        System.out.println("Tiempo en Madrid: 1. Temperatura, 2. Humedad, 3. Calidad del aire");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("La temperatura es: " + madrid.temperatura);
                System.out.println("La temperatura en Barcelona es: " + barcelona.temperatura);
                break;
            case 2:
                System.out.println("La humedad es: " + madrid.humedad);
                break;
            case 3:
                System.out.println("La calidad del aire es: " + madrid.calidadAire);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    int temperatura; // En grados Celsius
    int humedad; // Entre 0 y 100
    int calidadAire; // Entre 1 y 10

    public Temperatura(int temperatura, int humedad, int calidadAire) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.calidadAire = calidadAire;
    }


}
