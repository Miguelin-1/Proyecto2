import java.io.*;

public class ModificarArchivos {
    public static void crearArchivos()
    {
        for(int i=1;i<=10;i++) {
            String nombrea="archivo"+ i +".txt";
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
    public static void escribirArchivo(String nombrea,String contenido){
        File archivo=new File(nombrea);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.print(contenido);
            salida.close();

            System.out.println("Se ha escrito en el archivo archivo");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(IOException e){
           e.printStackTrace(System.out);
    }
}
}
