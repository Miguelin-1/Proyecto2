import java.util.ArrayList;

public class Personaje extends Papel {
    private String nombre_personaje;
    private String alias_personaje;
    private ArrayList<String> poderes = new ArrayList<>();
    private ArrayList<String> debilidades = new ArrayList<>();
    private ArrayList<String> dichos = new ArrayList<>();

    public Personaje(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, String alias, int anosCarrera, ArrayList<String> premios, ArrayList<String> papeles, int anoInicio, int anoFin, ArrayList<String> peliculas, String nombre_personaje,String alias_personaje,ArrayList<String>poderes,ArrayList<String>debilidades,ArrayList<String>dichos) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, alias, anosCarrera, premios, papeles, anoInicio, anoFin, peliculas);
        this.nombre_personaje = nombre_personaje;
        this.alias_personaje = alias_personaje;
        this.poderes = poderes;
        this.debilidades = debilidades;
        this.dichos = dichos;
    }

    public String getNombre_personaje() {
        return nombre_personaje;
    }

    public void setNombre_personaje(String nombre_personaje) {
        this.nombre_personaje = nombre_personaje;
    }
    // Otros métodos...

    public String getAlias() {
        return alias_personaje;
    }

    public void setAlias(String alias_personaje) {
        this.alias_personaje = alias_personaje;
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
