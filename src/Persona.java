public class Persona {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String genero;
    private String altura;
    private String estado_civil;

    public Persona(int edad, String nombre, String nacionalidad, String genero, String altura, String estado_civil) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.altura = altura;
        this.estado_civil = estado_civil;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public String getAltura() {
        return altura;
    }

    public String getEstadoCivil() {
        return estado_civil;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estado_civil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad + ", Género: " + genero +
                ", Altura: " + altura + ", Estado Civil: " + estado_civil;
    }
}