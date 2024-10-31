import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ModificarArchivos {

    //  public static void crearArchivos() {
    //    for (int i = 1; i <= 10; i++) {
    //      String nombrea = "archivo" + i + ".txt";
    //    File archivo = new File(nombrea);
    //  try {
    //    PrintWriter salida = new PrintWriter(archivo);
    //  salida.close();
    //System.out.println("Se ha creado el archivo " + i);
//            } catch (FileNotFoundException e) {
    //              throw new RuntimeException(e);
    //        }
    //  }
    //  }

    public static void escribirArchivos(int numeroArchivo, Heroe heroe) {
        String nombrea = "archivo" + numeroArchivo + ".txt";
        String contenido = "Este es el héroe que acabas de crear: \n" +
                "Nombre: " + heroe.getNombre() + "\n" +
                "Edad: " + heroe.getEdad() + "\n" +
                "Nacionalidad: " + heroe.getNacionalidad() + "\n" +
                "Género: " + heroe.getGenero() + "\n" +
                "Altura: " + heroe.getAltura() + "\n" +
                "Estado Civil: " + heroe.getEstadoCivil() + "\n" +
                "Alias: " + heroe.getAlias() + "\n" +
                "Años de experiencia: " + heroe.getAnosCarrera() + "\n" +
                "Premios: " + heroe.getPremios() + "\n" +
                "Papeles: " + heroe.getPapeles() + "\n" +
                "Fecha de inicio de la película: " + heroe.getAnoInicio() + "\n" +
                "Fecha del fin de la película: " + heroe.getAnoFin() + "\n" +
                "Películas: " + heroe.getPeliculas() + "\n" +
                "Nombre de personaje: " + heroe.getNombre_personaje() + "\n" +
                "Alias del personaje: " + heroe.getAlias_personaje() + "\n" +
                "Poderes: " + heroe.getPoderes() + "\n" +
                "Debilidades: " + heroe.getDebilidades() + "\n" +
                "Dichos: " + heroe.getDichos() + "\n" +
                "Equipo: " + heroe.getEquipo() + "\n" +
                "Nivel de bondad: " + heroe.getNivelBondad() + "\n" +
                "---------------------------\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombrea))) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void escribirArchivosV (int numeroArchivo, Villano villano) {
        String nombrea = "archivo" + numeroArchivo + ".txt";
        String contenido = "Este es el Villano que acabas de crear: \n" +
                "Nombre: " + villano.getNombre() + "\n" +
                "Edad: " + villano.getEdad() + "\n" +
                "Nacionalidad: " + villano.getNacionalidad() + "\n" +
                "Género: " + villano.getGenero() + "\n" +
                "Altura: " + villano.getAltura() + "\n" +
                "Estado Civil: " + villano.getEstadoCivil() + "\n" +
                "Alias: " + villano.getAlias() + "\n" +
                "Años de experiencia: " + villano.getAnosCarrera() + "\n" +
                "Premios: " + villano.getPremios() + "\n" +
                "Papeles: " + villano.getPapeles() + "\n" +
                "Fecha de inicio de la película: " + villano.getAnoInicio() + "\n" +
                "Fecha del fin de la película: " + villano.getAnoFin() + "\n" +
                "Películas: " + villano.getPeliculas() + "\n" +
                "Nombre de personaje: " + villano.getNombre_personaje() + "\n" +
                "Alias del personaje: " + villano.getAlias_personaje() + "\n" +
                "Poderes: " + villano.getPoderes() + "\n" +
                "Debilidades: " + villano.getDebilidades() + "\n" +
                "Dichos: " + villano.getDichos() + "\n" +
                "Estado Mental: " + villano.getEstadoMental() + "\n" +
                "Plan Malevolo: " + villano.getPlanMalevolo() + "\n" +
                "Complices: " + villano.getComplices() + "\n" +
                "---------------------------\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombrea))) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void escribirArchivosA (int numeroArchivo, Antiheroe antiheroe) {
        String nombrea = "archivo" + numeroArchivo + ".txt";
        String contenido = "Este es el héroe que acabas de crear: \n" +
                "Nombre: " + antiheroe.getNombre() + "\n" +
                "Edad: " + antiheroe.getEdad() + "\n" +
                "Nacionalidad: " + antiheroe.getNacionalidad() + "\n" +
                "Género: " + antiheroe.getGenero() + "\n" +
                "Altura: " + antiheroe.getAltura() + "\n" +
                "Estado Civil: " + antiheroe.getEstadoCivil() + "\n" +
                "Alias: " + antiheroe.getAlias() + "\n" +
                "Años de experiencia: " + antiheroe.getAnosCarrera() + "\n" +
                "Premios: " + antiheroe.getPremios() + "\n" +
                "Papeles: " + antiheroe.getPapeles() + "\n" +
                "Fecha de inicio de la película: " + antiheroe.getAnoInicio() + "\n" +
                "Fecha del fin de la película: " + antiheroe.getAnoFin() + "\n" +
                "Películas: " + antiheroe.getPeliculas() + "\n" +
                "Nombre de personaje: " + antiheroe.getNombre_personaje() + "\n" +
                "Alias del personaje: " + antiheroe.getAlias_personaje() + "\n" +
                "Poderes: " + antiheroe.getPoderes() + "\n" +
                "Debilidades: " + antiheroe.getDebilidades() + "\n" +
                "Dichos: " + antiheroe.getDichos() + "\n" +
                "Motivación: " + antiheroe.getMotivacion() + "\n" +
                "Nivel de amenaza: " + antiheroe.getNivelAmenaza() + "\n" +
                "---------------------------\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombrea))) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void leerArchivos(String nombrea) {
        File file = new File(nombrea);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String info = sc.nextLine();
                System.out.println(info);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void abrirArchivos(int numeroArchivo) {
        String nombrea = "archivo" + numeroArchivo + ".txt";
        try {
            Desktop.getDesktop().open(new File(nombrea));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
