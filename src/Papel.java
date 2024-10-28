import java.util.ArrayList;

public class Papel extends Actor{
private int anoInicio;
private int anoFin;
private ArrayList<String> peliculas = new ArrayList<>();

    public Papel(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, String alias, int anosCarrera, ArrayList<String> premios, ArrayList<String> papeles, int anoInicio, int anoFin,ArrayList<String> peliculas) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, alias, anosCarrera, premios, papeles);
        this.anoInicio = anoInicio;
        this.anoFin=anoFin;
        this.peliculas=peliculas;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(int anoFin) {
        this.anoFin = anoFin;
    }

    public ArrayList<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<String> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Papel:\n" +
                " - Año de Inicio: " + anoInicio + "\n" +
                " - Año de Fin: " + anoFin + "\n" +
                " - Películas: " + peliculas + "\n";
    }

}
