import java.util.ArrayList;

public class Heroe extends Personaje {
    private String equipo;
    private int nivelBondad;

    public Heroe(int edad, String nombre, String nacionalidad, String genero, String altura, ArrayList<String> papeles, ArrayList<String> premios, String nombre_personaje, String alias_personaje, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos, String equipo,int nivelBondad) {
        super(edad, nombre, nacionalidad, genero, altura, papeles, premios, nombre_personaje, alias_personaje, poderes, debilidades, dichos);
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