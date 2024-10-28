import java.util.ArrayList;

public class Personaje extends Persona {
    private String alias;
    private ArrayList<String> poderes = new ArrayList<>();
    private ArrayList<String> debilidades = new ArrayList<>();
    private ArrayList<String> dichos = new ArrayList<>();

    public Personaje(String nombre, String alias, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos) {
        super(30, nombre, nombre, "USA", "Masculino", "1.80");
        this.alias = alias;
        this.poderes = poderes;
        this.debilidades = debilidades;
        this.dichos = dichos;
    }

    // Otros métodos...

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alias: " + alias + ", Poderes: " + poderes + ", Debilidades: " + debilidades;
    }
}
