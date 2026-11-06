public class Aparcamiento {
    private String ciudad;
    private String nombre;
    private int capacidadMaxima;
    private int cochesAparcados;

    public Aparcamiento(String ciudad, String nombre, int capacidadMaxima) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.cochesAparcados = 0 ;
    } 
    
    public void entrarCoche() throws InterruptedException {
        cochesAparcados++;
    }

    public void salirCoche() {
        
        cochesAparcados--;
       
    }

    public int getCochesAparcados() {
        return cochesAparcados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}