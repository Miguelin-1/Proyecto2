import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        //Este metodo lo que hace es hacer el tamaño de la ventana y la posicion por coordenadas
        setBounds(0,0,500,500);
        //setLocationRelativeTo(null); //este metodo pone la ventana en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pendiente poner un buen titulo");
    }

}
