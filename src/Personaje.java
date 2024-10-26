import java.util.ArrayList;
public class Personaje {
    String nombre_personaje;
    String alias_personaje;
    ArrayList<String> poderes;
    ArrayList<String> debilidades;
    ArrayList<String> dichos;
    public Personaje(String nombre_personaje, String alias_personaje, ArrayList<String> poderes,
                     ArrayList<String> debilidades, ArrayList<String> dichos) {
        this.nombre_personaje = nombre_personaje;
        this.alias_personaje = alias_personaje;
        this.poderes = poderes;
        this.debilidades = debilidades;
        this.dichos = dichos;
    }

    // Métodos para gestionar poderes
    public void agregarPoder(String poder) {
        poderes.add(poder);
    }

    public void eliminarPoder(String poder) {
        poderes.remove(poder);
    }

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    // Métodos para gestionar debilidades
    public void agregarDebilidad(String debilidad) {
        debilidades.add(debilidad);
    }

    public void eliminarDebilidad(String debilidad) {
        debilidades.remove(debilidad);
    }

    public ArrayList<String> getDebilidades() {
        return debilidades;
    }

    // Métodos para gestionar dichos
    public void agregarDicho(String dicho) {
        dichos.add(dicho);
    }

    public ArrayList<String> getDichos() {
        return dichos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre_personaje + " (" + alias_personaje + "), Poderes: " + poderes +
                ", Debilidades: " + debilidades + ", Dichos: " + dichos;
    }
}
