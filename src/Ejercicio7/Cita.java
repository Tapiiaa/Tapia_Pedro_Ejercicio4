package Ejercicio7;

public class Cita {
    private String texto;
    private String autor;

    public Cita(String texto, String autor){
        this.texto = texto;
        this.autor = autor;
    }
    public String toString(){
        return "\" "+texto + "\" - " + autor;
    }
}
