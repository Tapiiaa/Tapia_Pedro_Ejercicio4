package Ejercicio6;

import java.util.Collection;

public class GenTransacciones {
    public static Transacciones generarTransacciones(){
        Transacciones transacciones = new Transacciones();
        for(int i = 0; i < 10; i++){
           boolean esFraudulenta = Math.random()<0.5;// Generams un valor aleatorio para esFraudulenta
            transacciones.agregarTransaccion(esFraudulenta, i, Math.random()*1000, "Concepto"+i, i, i+10);// Añadimos una nueva transaccion
        }
        return transacciones;
    }
}
