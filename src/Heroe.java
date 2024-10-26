public class Heroe extends Personaje {
    private String equipo;
    private int nivelBondad;

    public Heroe(String id, String nombre, int edad, String nacionalidad, String nombreSuperheroe, String origen, String equipo, int nivelBondad) {
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