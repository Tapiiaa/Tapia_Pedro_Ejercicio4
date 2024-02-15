package Ejercicio6;

public class Transaccion {
    private boolean esFraudulenta;
    private int idTransaccion;
    private double importe;
    private String concepto;
    private int idOrdenante;
    private int idBeneficiario;

    public Transaccion(boolean esFraudulenta, int idTransaccion, double importe, String concepto, int idOrdenante, int idBeneficiario) {
        this.esFraudulenta = esFraudulenta;
        this.idTransaccion = idTransaccion;
        this.importe = importe;
        this.concepto = concepto;
        this.idOrdenante = idOrdenante;
        this.idBeneficiario = idBeneficiario;
    }
    public void marcarComoFraudulenta() {
        this.setEsFraudulenta(true);
    }

    private void setEsFraudulenta(boolean esFraudulenta) {
        this.esFraudulenta = esFraudulenta;
    }

}
