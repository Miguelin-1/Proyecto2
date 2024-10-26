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
}
