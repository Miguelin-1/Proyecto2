import java.util.ArrayList;

public class Antiheroe extends Personaje {
    private String motivacion;
    private int nivelAmenaza;

    public Antiheroe(int edad, String nombre, String nacionalidad, String genero, String altura, String estadoCivil, String alias, String motivacion, int nivelAmenaza) {
        super(nombre, alias, new ArrayList<>(), new ArrayList<>(), new ArrayList<>()); // Llamada al constructor de Personaje
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