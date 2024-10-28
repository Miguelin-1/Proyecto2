public class Poder {
    private String nombre;
    private String descripcion;
    private int nivel;
    private TipoPoder tipo;

    public Poder(String nombre, String descripcion, int nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public TipoPoder getTipo() {
        return tipo;
    }

    public void setTipo(TipoPoder tipo) {
        this.tipo = tipo;
    }
}
