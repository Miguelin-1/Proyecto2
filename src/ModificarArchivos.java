import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ModificarArchivos {
    public static void crearArchivo(String nombrea)
    {
        File archivo = new File(nombrea);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void escribirArchivo(String nombrea,String contenido){
        File archivo=new File(nombrea);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.print(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo archivo");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
