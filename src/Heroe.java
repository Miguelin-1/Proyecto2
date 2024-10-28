import java.util.ArrayList;

public class Heroe extends Personaje {
    private String equipo;
    private int nivelBondad;

    public Heroe(String nombre, String alias_personaje, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos, String nombre_personaje, String equipo) {
        super(nombre, alias_personaje, poderes, debilidades, dichos, nombre_personaje);
        this.equipo = equipo;
        this.nivelBondad=nivelBondad;

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
        return "Heroe" + "\n" +
                "equipo='" + equipo + "\n" +
                "nivelBondad=" + nivelBondad + "\n" ;
    }
}