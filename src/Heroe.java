import java.util.ArrayList;

public class Heroe extends Personaje {
    private String equipo;
    private int nivelBondad;

    public Heroe(int edad, String nombre, String nacionalidad, String genero, String altura, String estadoCivil, String alias, String equipo, int nivelBondad) {
        super(nombre, alias, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());  // Llamada al constructor de Personaje
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

    @Override
    public String toString() {
        return super.toString() + ", Equipo: " + equipo + ", Nivel de Bondad: " + nivelBondad;
    }
}
