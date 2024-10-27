import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        crearArchivo("archivo1.txt");
        System.out.println("Hello world!");
        //Ventana v1= new Ventana();
        //v1.setVisible(true);

    }

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
}