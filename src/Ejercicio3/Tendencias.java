package Ejercicio3;
import java.util.List;
public class Tendencias {
    public static void main(String[] args) {
        String[] datos = {"Deportes", "Peliculas", "Tecnología"};

        AnalizadorDeTendencias analizador = new AnalizadorDeTendencias();
        List<String> tendencias = analizador.identificarTendencias(datos);
        for (String tendencia : tendencias) {
            System.out.println(tendencia);
        }

    }
}
