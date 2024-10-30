import java.util.ArrayList;

public class Heroe extends Personaje {
    private String equipo;
    private int nivelBondad;

    public Heroe(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, String alias, int anosCarrera, ArrayList<String> premios, ArrayList<String> papeles, int anoInicio, int anoFin, ArrayList<String> peliculas, String nombre_personaje, String alias_personaje, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos, String equipo,int nivelBondad) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, alias, anosCarrera, premios, papeles, anoInicio, anoFin, peliculas, nombre_personaje, alias_personaje, poderes, debilidades, dichos);
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