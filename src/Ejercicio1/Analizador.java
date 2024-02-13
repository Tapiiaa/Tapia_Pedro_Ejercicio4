package Ejercicio1;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Analizador {

    public static void main(String[] args) {
        List<String> comentarios = Arrays.asList(
                "Es Producto bueno",
                "No es un producto bueno",
                "Producto normal",
                "Flipante",
                "Decepcionado"
        );



        analizarComentarios(comentarios);
    }

    public static void analizarComentarios(List<String> comentarios) {
        for (String comentario : comentarios) {
            String sentimiento = determinarSentimiento(comentario);
            System.out.println("Comentario: " + comentario + " - Sentimiento: " + sentimiento);
        }
    }

    // Esta es una implementación muy básica y ficticia de análisis de sentimiento
    public static String determinarSentimiento(String comentario) {
        // La lógica de determinación de sentimiento real sería más compleja y probablemente
        // involucraría el uso de bibliotecas de NLP o llamadas a APIs especializadas
        if (comentario.contains("bueno") || comentario.contains("increíblemente") || comentario.contains("impresionado")||comentario.contains("flipante)")) {
            return "positivo";
        } else if (comentario.contains("no") || comentario.contains("peor")||comentario.contains("Decepcionado")) {
            return "negativo";
        } else {
            return "neutral";
        }
    }
}
