package Ejercicio2;
import java.util.ArrayList;
import java.util.List;
public class Red {
    List<DispositivoRed> dispositivos;
    public Red(){
        dispositivos = new ArrayList<>();
    }
    void agregarDispositivo(DispositivoRed dispositivo){
        dispositivos.add(dispositivo);
    }
    void mostrarDispositivos(){
        for(DispositivoRed dispositivo : dispositivos){
            System.out.println(dispositivo.id);
        }
    }
}
