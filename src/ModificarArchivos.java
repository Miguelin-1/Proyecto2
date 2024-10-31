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
    public static void dejarBlanco(int numeroArchivo){
        File archivo = new File("heroe_info_" + numeroArchivo + ".txt");
        try (FileWriter writer = new FileWriter(archivo)) {
            // No se escribe nada en el archivo para vaciarlo
            JOptionPane.showMessageDialog(null, "Archivo " + numeroArchivo + " limpiado exitosamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
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

    public static void abrirArchivos(int numeroArchivo){
        String nombrea = "archivo" + numeroArchivo + ".txt";
            try {
                Desktop.getDesktop().open(new File(nombrea));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }

