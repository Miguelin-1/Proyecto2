import java.util.ArrayList;

public class Actor extends Persona {
    private String alias;
    private int anosCarrera;
    private ArrayList<String> papeles = new ArrayList<>();
    private ArrayList<String> premios = new ArrayList<>();

    public Actor(int edad, String nombre, String nacionalidad, String genero, String altura,String estado_civil,String alias, int anosCarrera, ArrayList<String> premios,ArrayList<String> papeles) {
        super(edad, nombre, nacionalidad, genero, altura,estado_civil);
        this.alias=alias;
        this.anosCarrera=anosCarrera;
        this.papeles=papeles;
        this.premios = premios;
    }

    public void agregarPapel(String papel) {
        papeles.add(papel);
    }

    public ArrayList<String> getPapeles() {
        return papeles;
    }


    public void agregarPremio(String premio) {
        premios.add(premio);
    }

    public ArrayList<String> getPremios() {
        return premios;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + // Llamada a toString() de la clase padre
                "Alias: " + alias + "\n" +
                "Años de Carrera: " + anosCarrera + "\n" +
                "Papeles: " + papeles + "\n" +
                "Premios: " + premios;
    }
}