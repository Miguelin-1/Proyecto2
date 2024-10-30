import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ModificarArchivos {
    public static void crearArchivos()
    {
        for(int i=1;i<=10;i++) {
            String nombrea="archivo"+ i +".txt";
            File archivo = new File(nombrea);
            try {
                PrintWriter salida = new PrintWriter(archivo);
                salida.close();
                System.out.println("Se ha creado el archivo"+ i);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void escribirArchivos(String nombreArchivo, Heroe heroe) {
        String contenido = "Este es el heroe que acabas de crear: \n"+
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
                "Fecha de inicio de la pelicula: " + heroe.getAnoInicio() + "\n" +
                "Fecha del fin de la pelicula: " + heroe.getAnoFin() + "\n" +
                "Peliculas: " + heroe.getPeliculas() + "\n" +
                "Nombre de personaje: " + heroe.getNombre_personaje() + "\n" +
                "Alias del personaje: " + heroe.getAlias_personaje() + "\n" +
                "Poderes: " + heroe.getPoderes() + "\n" +
                "Debilidades: " + heroe.getDebilidades() + "\n" +
                "Dichos: " + heroe.getDichos() + "\n" +
                "Equipo: " + heroe.getEquipo() + "\n" +
                "Nivel de bondad: " + heroe.getNivelBondad() + "\n" +
                "---------------------------\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void leerArchivos(String nombrea){
        File file = new File ("archivo1.txt");
           try{
               Scanner sc =new Scanner(file);
               while(sc.hasNextLine()){
                   String info=sc.nextLine();
                   System.out.println(info);
               }
    } catch (RuntimeException | FileNotFoundException e) {
               throw new RuntimeException(e);
           }
    }
}
