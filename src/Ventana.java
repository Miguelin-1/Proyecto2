import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        setSize(500,500);
        setLocationRelativeTo(null); //este metodo pone la ventana en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Creacion de héroes y antihéroes");
        panelPrincipal();
    }
    private void panelPrincipal(){
            JPanel panel=new JPanel();
            this.getContentPane().add(panel);
            JLabel etiqueta=new JLabel("Registro de héroes y antihéroes");
            panel.add(etiqueta);
            etiqueta.setSize(10,10);
            etiqueta.setFont(new Font("arial",Font.PLAIN,20));
        JLabel etiqueta1=new JLabel("¿Que quieres crear, héroe o anti héroe?");
        panel.add(etiqueta1);
        etiqueta.setSize(10,10);
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));


    }


}
