import java.util.ArrayList;

public class Antiheroe extends Personaje {
    private String motivacion;
    private int nivelAmenaza;

    public Antiheroe(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, ArrayList<String> papeles, ArrayList<String> premios, String nombre_personaje, String alias_personaje, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos, String motivacion,int nivelAmenaza) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, papeles, premios, nombre_personaje, alias_personaje, poderes, debilidades, dichos);
        this.motivacion = motivacion;
        this.nivelAmenaza=nivelAmenaza;
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