package Ejercicio6;

public class DetectorTransascciones {
    private Transaccion[] Transacciones;

    public void detectarFraude() {

        for (Transaccion transaccion : Transacciones) {
            if (transaccion.getImporte() > 1000) {
                transaccion.marcarComoFraudulenta();
            }
        }

        for (int i = 0; i < Transacciones.length; i++) {
            if (Transacciones[i].getImporte() > 1000) {
                Transacciones[i].marcarComoFraudulenta();
            }

        }
    }
}
