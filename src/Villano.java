import java.util.ArrayList;

public class Villano extends Personaje{
    ArrayList<String> complices;
    String estadoMental;
    String planMalevolo;

    public ArrayList<String> getComplices() {
        return complices;
    }

    public void setComplices(ArrayList<String> complices) {
        this.complices = complices;
    }

    public Villano(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil, String alias, int anosCarrera, ArrayList<String> premios, ArrayList<String> papeles, int anoInicio, int anoFin, ArrayList<String> peliculas, String nombre_personaje, String alias_personaje, ArrayList<String> poderes, ArrayList<String> debilidades, ArrayList<String> dichos, ArrayList<String> complices, String estadoMental, String planMalevolo) {
        super(edad, nombre, nacionalidad, genero, altura, estado_civil, alias, anosCarrera, premios, papeles, anoInicio, anoFin, peliculas, nombre_personaje, alias_personaje, poderes, debilidades, dichos);
        this.complices = complices;
        this.estadoMental=estadoMental;
        this.planMalevolo=planMalevolo;

    }

    public String getEstadoMental() {
        return estadoMental;
    }

    public void setEstadoMental(String estadoMental) {
        this.estadoMental = estadoMental;
    }

    @Override
    public String toString() {
        return "Villano:\n" +
                " - Cómplices: " + complices + "\n" +
                " - Estado Mental: " + estadoMental + "\n" +
                " - Plan Malévolo: " + planMalevolo + "\n";
    }

}
