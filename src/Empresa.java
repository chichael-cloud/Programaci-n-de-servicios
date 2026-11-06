import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
    private String nombre;
    private List<Aparcamiento> aparcamientos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.aparcamientos = new ArrayList<>();
    }

       public void registrarAparcamiento(Aparcamiento aparcamiento) {
        aparcamientos.add(aparcamiento);
    }

    public List<Aparcamiento> buscarPorCiudad(String ciudad) {
        return aparcamientos.stream()	
                .filter(a -> a.getCiudad().equalsIgnoreCase(ciudad))
                .collect(Collectors.toList());
    }

    public void consultaGeneral() {
        System.out.println("\n===== ESTADO GENERAL DE LA EMPRESA: " + nombre + " =====");
        for (Aparcamiento a : aparcamientos) {
            System.out.println("- Ciudad: " + a.getCiudad() + 
                               " | Aparcamiento: " + a.getNombre() + 
                               " | Vehículos: " + a.getCochesAparcados() + "/" + a.getCapacidadMaxima());
        }
        System.out.println("==================================================\n");
    }
}