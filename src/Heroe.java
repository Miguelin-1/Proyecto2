import java.util.ArrayList;

public class Heroe extends Personaje {
    private String equipo;
    private int nivelBondad;

    public Heroe(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, ArrayList<String> premios, ArrayList<String> papeles, int anosCarrera, String alias, String nombre_personaje, String equipo) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, premios, papeles, anosCarrera, alias, nombre_personaje);
        this.equipo = equipo;
        this.nivelBondad = nivelBondad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getNivelBondad() {
        return nivelBondad;
    }

    public void setNivelBondad(int nivelBondad) {
        this.nivelBondad = nivelBondad;
    }
}