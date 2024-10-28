import java.util.ArrayList;
public class Personaje extends Actor{
    private String nombre_personaje;
    private String alias_personaje;
    private ArrayList<String> poderes;
    private ArrayList<String> debilidades;
    private ArrayList<String> dichos;


    public Personaje(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, ArrayList<String> premios, ArrayList<String> papeles, int anosCarrera, String alias, String nombre_personaje) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, premios, papeles, anosCarrera, alias);
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
        return "Nombre: " + nombre_personaje + "\n" +
                "Alias: " + alias_personaje + "\n" +
                "Poderes: " + poderes + "\n" +
                "Debilidades: " + debilidades + "\n" +
                "Dichos: " + dichos;
    }
}
