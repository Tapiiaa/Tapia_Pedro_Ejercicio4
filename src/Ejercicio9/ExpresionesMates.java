package Ejercicio9;
import java.util.Scanner;
public class ExpresionesMates {
public static void main(String[] args) {
    System.out.println("Ingrese el primer valor");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("Ingrese el segundo valor");
    int b = scanner.nextInt();
    System.out.println("Que operación quiere hacer: suma, resta, multiplicación o división");
    System.out.println("Pulse 1 para suma, 2 para resta, 3 para multiplicación o 4 para división");
    int operacion = scanner.nextInt();
    switch (operacion) {
        case 1:
            System.out.println("Indique la forma de hacer la suma:");
            String forma = scanner.next();
            if (forma != "a+b") {
                System.out.println("Incorrecto");
                break;
            }

            System.out.println("Operación correcta. El resultado de la suma es: " + (a + b));
            break;
        case 2:
            System.out.println("Indique la forma de hacer la resta:");
            String forma2 = scanner.next();
            if (forma2 != "a-b") {
                System.out.println("Incorrecto");
                break;
            }
            System.out.println("Operación correcta. El resultado de la resta es: " + (a - b));
            break;
        case 3:
            System.out.println("Indique la forma de hacer la multiplicación:");
            String forma3 = scanner.next();
            if (forma3 != "a*b") {
                System.out.println("Incorrecto");
                break;
            }
            System.out.println("Operación correcta. El resultado de la multiplicación es: " + (a * b));
            break;
        case 4:
            System.out.println("Indique la forma de hacer la división:");
            String forma4 = scanner.next();
            if (forma4 != "a/b") {
                System.out.println("Incorrecto");
                break;
            }
            System.out.println("Operación correcta. El resultado de la división es: " + (a / b));
            break;
        default:
            System.out.println("Operación no válida");
    }



}
    }


