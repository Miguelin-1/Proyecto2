public class Antiheroe extends Personaje {
    private String motivacion;
    private int nivelAmenaza;

    public Antiheroe(String id, String nombre, int edad, String nacionalidad, String nombreSuperheroe, String origen, String motivacion, int nivelAmenaza) {
        this.motivacion = motivacion;
        this.nivelAmenaza = nivelAmenaza;
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
}

