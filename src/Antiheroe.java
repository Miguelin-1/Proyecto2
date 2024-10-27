import java.util.ArrayList;

public class Antiheroe extends Personaje {
    private String motivacion;
    private int nivelAmenaza;

    public Antiheroe(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, ArrayList<String> premios, ArrayList<String> papeles, int anosCarrera, String alias, String nombre_personaje, String motivacion) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, premios, papeles, anosCarrera, alias, nombre_personaje);
        this.motivacion = motivacion;
        this.nivelAmenaza = nivelAmenaza;
    }

    public String getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(String motivacion) {
        this.motivacion = motivacion;
    }

    public int getNivelAmenaza() {
        return nivelAmenaza;
    }

    public void setNivelAmenaza(int nivelAmenaza) {
        this.nivelAmenaza = nivelAmenaza;
    }
}