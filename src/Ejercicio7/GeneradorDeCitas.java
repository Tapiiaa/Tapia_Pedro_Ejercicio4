package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GeneradorDeCitas {
    private List<Cita>citas;
    private Random random;
    public GeneradorDeCitas(){
        this.citas = new ArrayList<>();
        this.random = new Random();
        citas.add(new Cita("La vida es como una bicicleta, para mantener el equilibrio debes seguir adelante.", "Albert Einstein"));
        citas.add(new Cita("La vida es lo que pasa mientras estás ocupado haciendo otros planes.", "John Lennon"));
        citas.add(new Cita("El éxito es la suma de pequeños esfuerzos repetidos día tras día.", "Robert Collier"));

    }
    public Cita obtenerCita(){
        int indice = random.nextInt(citas.size());
        return citas.get(indice);
    }

}
