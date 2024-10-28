import java.util.ArrayList;

public class Actor extends Persona {
    private String alias;
    private int anosCarrera;
    private ArrayList<String> papeles = new ArrayList<>();
    private ArrayList<String> premios = new ArrayList<>();

    public Actor(int edad, String nombre, String nacionalidad, String genero, String altura, String estadoCivil, String alias, int anosCarrera) {
        super(edad, nombre, nacionalidad, genero, altura, estadoCivil);
        this.alias = alias;
        this.anosCarrera = anosCarrera;
    }

    public void agregarPapel(String papel) {
        papeles.add(papel);
    }

    public void agregarPremio(String premio) {
        premios.add(premio);
    }

    public ArrayList<String> getPapeles() {
        return papeles;
    }

    public ArrayList<String> getPremios() {
        return premios;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAnosCarrera() {
        return anosCarrera;
    }

    public void setAnosCarrera(int anosCarrera) {
        this.anosCarrera = anosCarrera;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alias: " + alias + ", Años de Carrera: " + anosCarrera +
                ", Papeles: " + papeles + ", Premios: " + premios;
    }
}
