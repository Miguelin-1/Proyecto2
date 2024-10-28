import java.util.ArrayList;

public class Antiheroe extends Personaje {
    private String motivacion;
    private int nivelAmenaza;

    public Antiheroe(String nombre, String alias_personaje, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos, String nombre_personaje, String motivacion) {
        super(nombre, alias_personaje, poderes, debilidades, dichos, nombre_personaje);
        this.motivacion = motivacion;
        this.nivelAmenaza= nivelAmenaza;
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

    @Override
    public String toString() {
        return "Antiheroe" + "\n" +
                "motivacion='" + motivacion + "\n" +
                "nivelAmenaza=" + nivelAmenaza + "\n" ;
    }
}