import java.util.ArrayList;
public class Actor extends Persona {
    String alias;
    int anosCarrera;
    ArrayList<String> papeles;
    ArrayList<String> premios;

    public Actor(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, ArrayList<String> premios,ArrayList<String> papeles, int anosCarrera, String alias) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil);
        this.alias=alias;
        this.anosCarrera=anosCarrera;
        this.papeles=papeles;
        this.premios = premios;
    }

}