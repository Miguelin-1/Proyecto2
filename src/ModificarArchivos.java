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

    public static void escribirArchivos(List<String> contenido) {
        for (int i = 1; i <= 10; i++) {
            String nombrea = "archivo" + i + ".txt";
            File archivo = new File(nombrea);

            try {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                for (int j = 0; j < contenido.size(); j++) {
                    String linea = contenido.get(j);
                    salida.println(linea);
                }
                salida.close();

                System.out.println("Se ha escrito en el archivo " + nombrea);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
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
